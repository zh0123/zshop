package com.itany.zshop.front.controller;

import com.itany.zshop.common.util.HttpClientUtils;
import com.itany.zshop.common.util.RedisUtils;
import com.itany.zshop.common.util.ResponseResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Author：汤小洋
 * Date：2018-05-15 16:17
 * Description：<描述>
 */
@Controller
@RequestMapping("/sms")
public class SmsController {

    @Value("${sms.url}")
    private String url;

    @Value("${sms.key}")
    private String key;

    @Value("${sms.tplId}")
    private String tplId;

    @Value("${sms.tplValue}")
    private String tplValue;

    @RequestMapping("/sendVerificationCode")
    @ResponseBody
    public ResponseResult sendVerificationCode(String phone, HttpSession session) {
        try {
            System.out.println("phone="+phone);
            //生成六位的随机验证码
            Random random = new Random();
            int randVerificationCode = random.nextInt(999999);
          //  session.setAttribute("randVerificationCode", randVerificationCode);

            //将验证码存放到Redis中
            RedisUtils.set(session.getId(), randVerificationCode+"", 2 * 60); //验证码有效期为2分钟

            //发送短信
            Map<String, String> params = new HashMap<>();
            params.put("mobile", phone);
            params.put("key", key);
            params.put("tpl_id", tplId);
            params.put("tpl_value", tplValue + randVerificationCode);
            System.out.println("params="+params);
            String result = HttpClientUtils.doPost(url, params);
            System.out.println(result);
            return ResponseResult.success("验证码发送成功");
        } catch (Exception e) {
            return ResponseResult.fal("验证码发送失败");
        }


    }
}
