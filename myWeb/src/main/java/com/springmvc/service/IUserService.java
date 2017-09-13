package com.springmvc.service;

import com.springmvc.domain.User;

import java.util.List;

/**
 * Created by 人之初 on 2017/9/13.
 */
public interface IUserService {
    public List<User> selectAll();
}
