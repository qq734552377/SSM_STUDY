package cn.acheng1314.test.service;

import cn.acheng1314.domain.User;
import cn.acheng1314.exception.*;
import cn.acheng1314.service.serviceImpl.UserServiceImpl;
import cn.acheng1314.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016/9/25.
 */
public class UserServiceTest extends BaseTest {
    @Autowired
    private UserServiceImpl userService;

    @Test
    public void testAdd() {
        User user = new User();
        try {
            userService.add(user);
        } catch (OtherThingsException e) {
            //其他综合异常或是不能处理的异常
            e.printStackTrace();
        }


    }
}
