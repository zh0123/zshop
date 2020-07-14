package com.itany.zshop.common.util;

import org.springframework.util.StreamUtils;

import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Author：汤小洋
 * Date：2018-04-27 11:43
 * Description：<描述>
 */
public class StringUtils {
    public static String renameFileName(String fileName){
        int dotIndex = fileName.lastIndexOf(".");
        String suffix=fileName.substring(dotIndex);
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+ new Random().nextInt(100)+suffix;

    }
}

