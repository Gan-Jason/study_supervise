package com.gan.xiaoyuanzi.enjoystudy.service;

import com.gan.xiaoyuanzi.enjoystudy.entity.SignIn;
import org.springframework.stereotype.Service;

public interface SignInRestService {

    SignIn saveSignInInfo(SignIn signIn);

    void deleteSignInInfo(Long id);

    void updateSignIn(SignIn signIn);

    SignIn getSignInInfo();

}
