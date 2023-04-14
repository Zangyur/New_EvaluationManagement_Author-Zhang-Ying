package com.inc.admin.controller.sys;

import com.inc.admin.constants.Constants;
import com.inc.admin.domain.biz.Email;
import com.inc.admin.domain.sys.UserDO;
import com.inc.admin.dto.sys.UserDTO;
import com.inc.admin.dto.sys.req.UpPwdReq;
import com.inc.admin.service.biz.EmailService;
import com.inc.admin.service.sys.MailService;
import com.inc.admin.service.sys.RoleService;
import com.inc.admin.service.sys.UserService;
import com.inc.admin.utils.*;
import com.inc.admin.context.FilterContextHandler;
import com.inc.admin.dto.sys.LoginUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.*;

/**
 * 用户信息
 * @author inc
 */
@RequestMapping("/user")
@RestController
public class UserController extends BaseController {
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
	@Autowired
	EmailService emailService;
	@Autowired
	MailService mailService;
	/**
	 * 登录的当前用户，前台需要验证用户登录的页面可以调用此方法
	 * @return
	 */
    @GetMapping("/currentUser")
    LoginUserDTO currentUser(){
		LoginUserDTO loginUserDTO = new LoginUserDTO();
		loginUserDTO.setUserId(FilterContextHandler.getUserID()+"");
		loginUserDTO.setUsername(FilterContextHandler.getUsername());
		loginUserDTO.setName(FilterContextHandler.getName());
		return loginUserDTO;
	}

	@RequestMapping("/resetPwdByEmail")
	@ResponseBody
	public R resetPwdByEmail(HttpServletRequest request,String email){
		UserDO user= userService.getusersByEmail(email);
		if(user==null){
			return R.error("该邮箱尚未注册");
		}else{
			//生成邮件url唯一地址
			reset(request,user);
			return R.ok();
		}
	}

	@RequestMapping("/resetPwdByEmail2")
	@ResponseBody
	public R backManage(@RequestBody UpPwdReq req){
		Email email = new Email();
		email.setSid(req.getSid());
		email.setUserName(req.getUserName());
		Email one = emailService.getOne(email);
		if(!req.getNewPwd().equals(req.getConfirmPwd())){
			return R.error("两次密码不匹配");
		}else if(one == null){
			return R.error("追回密码失败，未匹配sid");
		}else {
			emailService.delete(one.getId());
			UserDO userDO = userService.getusersByusername(req.getUserName());
			UserDO up = new UserDO();
			up.setUserId(userDO.getUserId());
			up.setPassword(MD5Utils.encrypt(userDO.getUsername(), req.getNewPwd()));
			return R.operate(userService.update(up)>0);
		}
	}

	@Async
	R reset(HttpServletRequest request, UserDO user){
		String path = request.getContextPath();
		String key= RandomUtils.getRandom(6)+"";
		Date outDate = new Timestamp(System.currentTimeMillis()+(long)(30*60*1000));//30分钟后过期             //忽略毫秒数
		long outtimes=outDate.getTime();
		String sid=user.getEmail()+"&"+key+"&"+outtimes;
		Email emaildo = new Email();
		emaildo.setUserName(user.getUsername());
		emaildo.setSid(MD5Utils.encrypt(sid));
		emaildo.setOutTime(outtimes);
		emailService.insert(emaildo);
		String result =  "http://localhost:8082/resetPwd?sid="+emaildo.getSid()+"&username="+user.getUsername();
		mailService.sendSimpleEmail(user.getEmail(),result);
		return R.ok().put("data",result);
	}
	/**
	 * 根据用户id获取用户
	 * @param id
	 * @return
	 */
    @GetMapping("{id}")
	R get(@PathVariable("id") Long id ){
		UserDO userDO = userService.get(id);
    	return R.ok().put("data", ObjectCopyUtils.copyProperties(new UserDTO(), userDO));
	}

	/**
	 * 分页查询用户
	 * @param params
	 * @return
	 */
    @GetMapping()
    R listByPage(@RequestParam Map<String, Object> params) {
        Query query = new Query(params);
		List<UserDO> list = userService.list(query);
		List<UserDTO> userDTOS = ObjectCopyUtils.copyListProperty(UserDTO.class, list);
        int total = userService.count(query);
        PageUtils pageUtil = new PageUtils(userDTOS, total);
        return R.ok().put("page",pageUtil);
    }

	/**
	 * 分页查询教师
	 * @param params
	 * @return
	 */
	@GetMapping("/jiaoshi")
	R jiaoshi(@RequestParam Map<String, Object> params) {
		Query query = new Query(params);
		Map jiaoshi = userService.jiaoshi(query);
		List<UserDO> list = (List<UserDO>) jiaoshi.get("list");
		List<UserDTO> userDTOS = ObjectCopyUtils.copyListProperty(UserDTO.class, list);
		int total = userService.count(query);
		PageUtils pageUtil = new PageUtils(userDTOS, (Integer) jiaoshi.get("count"));
		return R.ok().put("page",pageUtil);
	}

	/**
	 * 分页查询学生
	 * @param params
	 * @return
	 */
	@GetMapping("/xuesheng")
	R xuesheng(@RequestParam Map<String, Object> params) {

		Map<String, Object> map = new HashMap<>();
		map.put("userId",FilterContextHandler.getUserID4Int());
		Map jiaoshi = userService.jiaoshi(map);
		List<UserDO> list2 = (List<UserDO>) jiaoshi.get("list");
		if(list2!=null && list2.size()>0){
			params.put("deptId",Integer.parseInt(list2.get(0).getDeptId()+""));
		}

		Query query = new Query(params);
//		query.put("userId",FilterContextHandler.getUserID4Int());
		Map maps = userService.xuesheng(query);
		List<UserDO> list = (List<UserDO>) maps.get("list");
		List<UserDTO> userDTOS = ObjectCopyUtils.copyListProperty(UserDTO.class, list);
		//int total = userService.count(query);
		PageUtils pageUtil = new PageUtils(userDTOS, (Integer) maps.get("count"));
		return R.ok().put("page",pageUtil);
	}

	/**
	 * 增加用户
	 * @param user
	 * @return
	 */
	@PostMapping()
    R save(@RequestBody UserDO user) {
		if (exits(user.getUsername())) {
			return R.error("用户名已存在");
		}
		user.setPassword(MD5Utils.encrypt(user.getUsername(), user.getPassword()));
		return R.operate(userService.save(user) > 0);
	}

	/**
	 * 批量添加教师
	 * @param list
	 * @return
	 */
	@PostMapping("insertBatchJiaoshi")
	R insertBatchJiaoshi(@RequestBody List<UserDO> list) {
		List<Long> roleIdList = new ArrayList<>();
		roleIdList.add(Constants.ROLE_ID_KRJS);
		for (UserDO user : list) {
			if (exits(user.getUsername())) {
				return R.error("用户名已存在");
			}
			user.setUserIdCreate(FilterContextHandler.getUserID4Int().longValue());
			user.setPassword(MD5Utils.encrypt(user.getUsername(), user.getPassword()));
			String[] split = user.getRoleId().split(",");
			List<Long> l = new ArrayList<>();
			for (String s : split) {
				l.add(Long.parseLong(s));
			}
			user.setroleIds(l);
			userService.save(user);
		}
		return R.operate(true);
	}

	/**
	 * 批量添加学生
	 * @param list
	 * @return
	 */
	@PostMapping("insertBatchXuesheng")
	R insertBatch(@RequestBody List<UserDO> list) {
		List<Long> roleIdList = new ArrayList<>();
		roleIdList.add(Constants.ROLE_ID_XUESHENG);
		for (UserDO user : list) {
			if (exits(user.getUsername())) {
				return R.error("用户名已存在");
			}
			user.setUserIdCreate(FilterContextHandler.getUserID4Int().longValue());
			user.setPassword(MD5Utils.encrypt(user.getUsername(), user.getPassword()));
			user.setroleIds(roleIdList);
			userService.save(user);
		}
		return R.operate(true);
	}

	@PostMapping("register")
    R register(@RequestBody UserDO user) {
		if (exits(user.getUsername())) {
			return R.error("用户名已被注册");
		}
		user.setroleIds(Arrays.asList(56L));
		user.setPassword(MD5Utils.encrypt(user.getUsername(), user.getPassword()));
		return R.operate(userService.save(user) > 0);
	}

	@PostMapping("resetPwd")
    R resetPwd(@RequestBody UserDO user) {
		return userService.resetPwd(user.getUserId());
	}

	@PostMapping("updatePwd")
    R updatePwd(@RequestBody @Validated UpPwdReq req) {
		return userService.updatePwd(req);
	}

	@GetMapping("isMsg")
	R isMsg(Boolean isMsg) {
		UserDO userDO = new UserDO();
		userDO.setUserId(Long.valueOf(FilterContextHandler.getUserID()));
		userDO.setMsg(isMsg?1:0);
		return R.operate(userService.update(userDO)>0);
	}

	/**
	 * 修改用户
	 * @param user
	 * @return
	 */
	@PutMapping()
	R update(@RequestBody UserDO user) {
		return R.operate(userService.update(user) > 0);
	}

	@PostMapping("profile")
	R profile(@RequestBody UserDO user) {
		user.setUserId(FilterContextHandler.getUserID4Int().longValue());
		return R.operate(userService.profile(user)>0);
	}

	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	@DeleteMapping()
	R remove( Long id) {
		return R.operate (userService.remove(id) > 0);
	}

	@PostMapping("/batchRemove")
	@ResponseBody
	R batchRemove(@RequestParam("ids[]") Long[] userIds) {
		int r = userService.batchremove(userIds);
		if (r > 0) {
			return R.ok();
		}
		return R.error();
	}

	boolean exits(String userName) {
		// 存在，不通过，false
		Map<String, Object> params = new HashMap<>();
		params.put("username", userName);
		return userService.exits(params);
	}
}
