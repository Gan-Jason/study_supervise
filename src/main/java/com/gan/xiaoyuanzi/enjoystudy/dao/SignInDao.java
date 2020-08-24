package com.gan.xiaoyuanzi.enjoystudy.dao;


import com.gan.xiaoyuanzi.enjoystudy.entity.SignIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "sign")
public interface SignInDao extends JpaRepository<SignIn,Long> {
}
