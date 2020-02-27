package com.imooc.sell.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("weixin")
@Slf4j
public class WeixinController {

    @GetMapping("auth")
    public void auth(@RequestParam("code") String code){
        log.info("进入auth方法");
        log.info("code={}",code);
        RestTemplate restTemplate=new RestTemplate();
        String url="https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx2757df78874fdcfa&secret=d3f7ea9e5b8ba542e5a50504b67e13e3&code="+code+"&grant_type=authorization_code";
        String response=restTemplate.getForObject(url,String.class);
        log.info(response);
    }
}
