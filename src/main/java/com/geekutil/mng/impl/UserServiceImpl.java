package com.geekutil.mng.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.geekutil.entity.User;
import com.geekutil.mapper.UserMapper;
import com.geekutil.mng.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
