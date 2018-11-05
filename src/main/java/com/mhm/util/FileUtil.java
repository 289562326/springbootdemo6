package com.mhm.util;

import java.io.*;
import java.util.Base64;

/**
 * 文件操作类
 * Created by MHm on 2018/3/19.
 */
public class FileUtil {

    /**
     * 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
     */
    public static String readImgFile(String imgFilePath){
        if (null == imgFilePath){
            return "";
        }
        byte[] data = readImgFile2Bytes(imgFilePath);

        // 对字节数组Base64编码
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(data); // 返回Base64编码过的字节数组字符串
    }

    public static byte[] readImgFile2Bytes(String imgFilePath){
        if (null == imgFilePath){
            return null;
        }
        byte[] data = null;
        InputStream in = null;
        // 读取图片字节数组
        try {
            in = new FileInputStream(imgFilePath);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (Exception e) {
//            LogUtil.exception(e);
        }finally {
            try {
                if(null!=in){
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return data; // 返回Base64编码过的字节数组字符串
    }

    /**
     * 对字节数组字符串进行Base64解码并生成图片
     */
    public static boolean generateImageFile(String imgStr, String imgFilePath) {
        if (imgStr == null) // 图像数据为空
            return false;
        Base64.Decoder decoder = Base64.getDecoder();
        OutputStream out = null;
        try {
            // Base64解码
            byte[] bytes = decoder.decode(imgStr);
            for (int i = 0; i < bytes.length; ++i) {
                if (bytes[i] < 0) {// 调整异常数据
                    bytes[i] += 256;
                }
            }
            out = new FileOutputStream(imgFilePath);
            out.write(bytes);
            out.flush();
            out.close();
            return true;
        } catch (Exception e) {
//            LogUtil.exception(e);
            return false;
        }finally {
            try {
                if(null!=out){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 字节流的方式读取文件
     * @param f
     * @return
     */
    public static String readFile(File f) {
        String result = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
            byte[] b = new byte[1024];
            int len = 0;
            while (-1 != (len = fis.read(b))) {
                result = new String(b, 0, len);
            }

        } catch (FileNotFoundException e) {
//            LogUtil.exception(e);
        } catch (IOException e) {
//            LogUtil.exception(e);
        } finally {
            if (null != fis) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

}
