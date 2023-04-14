package com.inc.admin.utils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyun.tea.*;
import com.aliyun.ocr_api20210707.*;
import com.aliyun.ocr_api20210707.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.ocr_api20210707.models.RecognizeAdvancedRequest;
import lombok.extern.slf4j.Slf4j;
import sun.misc.BASE64Encoder;

import java.io.*;
import java.util.Objects;

@Slf4j
public class AliyunUtil {
    /**
     * 使用AK&SK初始化账号Client
     * @return Client
     * @throws Exception
     */
    public static com.aliyun.ocr_api20210707.Client createClient() throws Exception {
        Config config = new Config()
                // 您的AccessKey ID
                .setAccessKeyId("LTAI4GDz6vsYY5533pM5KBB2")
                // 您的AccessKey Secret
                .setAccessKeySecret("Nb9Ohe3v009malfVUjPA7XOBXPYg7u");
        // 访问的域名
        config.endpoint = "ocr-api.cn-hangzhou.aliyuncs.com";
        return new com.aliyun.ocr_api20210707.Client(config);
    }

    public static String ocr(File img) throws Exception {
        com.aliyun.ocr_api20210707.Client client = AliyunUtil.createClient();
        RecognizeAdvancedRequest recognizeAdvancedRequest = new RecognizeAdvancedRequest()
                .setBody(new FileInputStream(img))
                //.setUrl("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fe3f49eaa46b57.cdn.sohucs.com%2Fc_pad%2Cw_640%2Ch_360%2Cblur_80%2F2019%2F10%2F31%2F3%2F33%2FMTAwMTM1XzE1NzI0NjM5OTQyNjk%3D.jpg&refer=http%3A%2F%2Fe3f49eaa46b57.cdn.sohucs.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1645451217&t=91e16ff7eb336e57ce02cffe20a836e0")
                .setOutputCharInfo(false)
                .setNeedRotate(false)
                .setOutputTable(false)
                .setNeedSortPage(false);
        // 复制代码运行请自行打印 API 的返回值
        RecognizeAdvancedResponse recognizeAdvancedResponse = client.recognizeAdvanced(recognizeAdvancedRequest);
        String data = recognizeAdvancedResponse.body.getData();
        log.info(data);
        JSONObject obj = JSONObject.parseObject(data);
        if(obj.containsKey("content")) {
            return (obj.getString("content"));
        }else{
            return (data);
        }

    }

    public static void main(String[] args_) throws Exception {
        File f = new File("D:\\files\\a.jfif");
        System.out.println(ocr(f));
    }

    /**
     * 本地图片转换Base64的方法
     *
     * @param imgPath
     */

    private static String ImageToBase64(String imgPath) {
        byte[] data = null;
        // 读取图片字节数组
        try {
            InputStream in = new FileInputStream(imgPath);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        // 返回Base64编码过的字节数组字符串
        return encoder.encode(Objects.requireNonNull(data));
    }
}
