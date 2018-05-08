package cn.acheng1314.service;

import cn.acheng1314.domain.User;
import cn.acheng1314.exception.UserCanNotBeNullException;
import cn.acheng1314.exception.UserNameCanNotBeNullException;
import cn.acheng1314.exception.UserPwdCanNotBeNullException;

/**
 * Created by Administrator on 2016/9/25.
 */
public interface UserService extends BaseService<User> {

    void add(User user) throws Exception;

    User findUser(User user) throws Exception;
}
