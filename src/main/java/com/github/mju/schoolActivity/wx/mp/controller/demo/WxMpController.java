package com.github.mju.schoolActivity.wx.mp.controller.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//@RestController
//@RequestMapping("/wx/mp")
@Slf4j
public class WxMpController {

    @GetMapping("/auth")
    public String auth(String code) {
        log.info("进入auth方法...");
        log.info("code = {}", code);

        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx6f5f40b08e983502&secret=51392662722c53a8c56c359086a91cbe&code=" + code + "&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info("response = {}", response);
        return response;
    }
}
