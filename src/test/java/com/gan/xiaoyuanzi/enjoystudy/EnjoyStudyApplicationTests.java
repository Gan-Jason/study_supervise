package com.gan.xiaoyuanzi.enjoystudy;

import com.gan.xiaoyuanzi.enjoystudy.entity.SignIn;
import com.gan.xiaoyuanzi.enjoystudy.service.SignInRestService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.LocalTime;

@SpringBootTest
class EnjoyStudyApplicationTests {

    @Resource
    SignInRestService signInfo;

    @Test
    void contextLoads() {
    }


}
