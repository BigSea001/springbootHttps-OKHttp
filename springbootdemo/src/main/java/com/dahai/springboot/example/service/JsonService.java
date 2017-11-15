package com.dahai.springboot.example.service;

import org.springframework.stereotype.Service;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 类描述：
 * <p>
 * author：xjh
 * version v0.1
 * 时间：2017/10/11
 */
@Service
public class JsonService {

    public String getJsonData(String path) {
        BufferedInputStream bis=null;
        try {
            File file = new File(path);
            bis = new BufferedInputStream(new FileInputStream(file));
            byte[] bytes = new byte[1024];
            int len;
            StringBuilder sb = new StringBuilder();
            while ((len=bis.read(bytes))!=-1) {
                sb.append(new String(bytes,0,len));
            }

            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bis!=null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return "";
    }
}
