package com.inc.admin.controller.sys;

import com.inc.admin.service.biz.GonggaoService;
import com.inc.admin.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

@Slf4j
@RestController
public class DownloadController {

    public static final String basePath = "";

    @GetMapping("/download")
    public void download(String path, HttpServletResponse response) {
        if(StringUtils.isEmpty(path)){

        }else {
            try {
                // path是指想要下载的文件的路径
                File file = new File(basePath + path);
                log.info(file.getPath());
                // 获取文件名
                String filename = file.getName();
                // 获取文件后缀名
                String ext = filename.substring(filename.lastIndexOf(".") + 1).toLowerCase();
                log.info("文件后缀名：" + ext);

                // 将文件写入输入流
                FileInputStream fileInputStream = new FileInputStream(file);
                InputStream fis = new BufferedInputStream(fileInputStream);
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);
                fis.close();

                // 清空response
                response.reset();
                // 设置response的Header
                response.setCharacterEncoding("UTF-8");
                //Content-Disposition的作用：告知浏览器以何种方式显示响应返回的文件，用浏览器打开还是以附件的形式下载到本地保存
                //attachment表示以附件方式下载 inline表示在线打开 "Content-Disposition: inline; filename=文件名.mp3"
                // filename表示文件的默认名称，因为网络传输只支持URL编码的相关支付，因此需要将文件名URL编码后进行传输,前端收到后需要反编码才能获取到真正的名称
                response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(filename, "UTF-8"));
                // 告知浏览器文件的大小
                response.addHeader("Content-Length", "" + file.length());
                OutputStream outputStream = new BufferedOutputStream(response.getOutputStream());
                response.setContentType("application/octet-stream");
                outputStream.write(buffer);
                outputStream.flush();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
