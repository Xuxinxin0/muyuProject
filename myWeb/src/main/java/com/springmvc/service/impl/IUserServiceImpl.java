package com.springmvc.service.impl;

import com.springmvc.dao.IUserDao;
import com.springmvc.domain.User;
import com.springmvc.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 人之初 on 2017/9/13.
 */
@Service("userService")
public class IUserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public List<User> selectAll() {

        return null;
    }
}
