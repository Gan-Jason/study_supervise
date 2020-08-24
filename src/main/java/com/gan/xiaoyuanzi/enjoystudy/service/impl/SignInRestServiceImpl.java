package com.gan.xiaoyuanzi.enjoystudy.service.impl;

import com.gan.xiaoyuanzi.enjoystudy.dao.SignInDao;
import com.gan.xiaoyuanzi.enjoystudy.entity.SignIn;
import com.gan.xiaoyuanzi.enjoystudy.service.SignInRestService;
import org.apache.catalina.mapper.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class SignInRestServiceImpl implements SignInRestService {

    @Resource
    private SignInDao signInDao;


    @Override
    public SignIn saveSignInInfo(SignIn signIn) {
        signInDao.save(signIn);
        return null;
    }

    @Override
    public void deleteSignInInfo(Long id) {

    }

    @Override
    public void updateSignIn(SignIn signIn) {

    }

    @Override
    public SignIn getSignInInfo() {
        return null;
    }
}
