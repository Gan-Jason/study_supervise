package com.gan.xiaoyuanzi.enjoystudy.controller;

import com.gan.xiaoyuanzi.enjoystudy.config.exception.AjaxResponse;
import com.gan.xiaoyuanzi.enjoystudy.entity.SignIn;
import com.gan.xiaoyuanzi.enjoystudy.service.SignInRestService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class SignInController {

    @Resource
    SignInRestService sign;

    @PostMapping("/sign")
    @ResponseBody
    public AjaxResponse saveSignInfo(@RequestBody SignIn signIn){
        sign.saveSignInInfo(signIn);
        return AjaxResponse.success();
    }

}
