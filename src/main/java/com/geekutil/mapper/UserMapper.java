package com.geekutil.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.geekutil.entity.User;

public interface UserMapper extends BaseMapper<User> {
    void saveData (User viewLog) ;
}
