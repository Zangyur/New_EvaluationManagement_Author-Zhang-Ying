package com.inc.admin.controller.sys;


import com.inc.admin.config.ServerConfig;
import com.inc.admin.utils.AliyunUtil;
import com.inc.admin.utils.R;
import com.inc.admin.vo.X;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Controller
@RequestMapping("/upload")
public class UploadController {

    @Value("${pic.path}")
    String filePath;
    @Value("${pic.prefix}")
    String prefix;

    @Autowired
    ServerConfig serverConfig;

    @PostMapping(value = "/img")
    @ResponseBody
    public R materialPictureAndText(@RequestParam(value = "file", required = true) MultipartFile file) {

        if (file.isEmpty()) {
            return R.ok("请上传图片");
        } else {
            String fileName = file.getOriginalFilename();  // 文件名
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            fileName = UUID.randomUUID().toString().replace("-", "") + suffixName; // 新文件名
            File dest = new File(filePath + fileName);
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            try {
                file.transferTo(dest);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return R.ok().put("img", prefix + fileName);//这里就是上传图片返回的信息，成功失败异常等，前端根据字段接收就是了
        }
    }

    @PostMapping("/file")
    @ResponseBody
    public R upload(@RequestParam("fileList") MultipartFile[] fileList) {
        if (fileList==null || fileList.length<1) {
            return R.ok("请上传文件");
        } else {
            List<String> list = new ArrayList<>();
            for (MultipartFile file : fileList) {
                String fileName = file.getOriginalFilename();  // 文件名
                String suffixName = fileName.substring(fileName.lastIndexOf("."));
                fileName = UUID.randomUUID().toString().replace("-", "") + suffixName; // 新文件名
                File dest = new File(filePath + fileName);
                if (!dest.getParentFile().exists()) {
                    dest.getParentFile().mkdirs();
                }
                try {
                    file.transferTo(dest);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                list.add(prefix + fileName);
            }
            return R.ok().put("fileList", list);
        }
    }

    @PostMapping("/ocr")
    @ResponseBody
    public R ocr(@RequestParam("fileList") MultipartFile[] fileList) throws Exception {
        if (fileList==null || fileList.length<1) {
            return R.ok("请上传文件");
        } else {
            List<X> list = new ArrayList<>();
            for (MultipartFile file : fileList) {
                String fileName = file.getOriginalFilename();  // 文件名
                String suffixName = fileName.substring(fileName.lastIndexOf("."));
                fileName = UUID.randomUUID().toString().replace("-", "") + suffixName; // 新文件名
                File dest = new File(filePath + fileName);
                if (!dest.getParentFile().exists()) {
                    dest.getParentFile().mkdirs();
                }
                try {
                    file.transferTo(dest);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                list.add(new X(prefix + fileName, AliyunUtil.ocr(dest)));
            }
            return R.ok().put("data", list);
        }
    }

}
