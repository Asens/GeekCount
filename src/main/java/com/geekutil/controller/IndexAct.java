package com.geekutil.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.geekutil.clickhouse.entity.ViewLog;
import com.geekutil.clickhouse.mapper.ViewLogMapper;
import com.geekutil.clickhouse.mng.ViewLogService;
import com.geekutil.entity.User;
import com.geekutil.mapper.UserMapper;
import com.geekutil.mng.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Date;
import java.util.List;

@RestController
public class IndexAct {
    @Resource
    private ViewLogService viewLogService;
    @Resource
    private ViewLogMapper viewLogMapper;
    //@Resource
    private UserService userService;


    @GetMapping("/")
    public String index(){
        return viewLogService.list().toString();
    }

    @GetMapping("/save")
    public String save(String type){
        ViewLog viewLog = ViewLog.builder().id(1).type(type).createDate(new Date()).build();
        //viewLogMapper.saveData(viewLog);
        //viewLogMapper.insert(viewLog);
        viewLogMapper.saveData(viewLog);
        return "success";
    }

    @GetMapping("/user/list")
    public String userList(String type){
        return userService.list().toString();
    }

    @GetMapping("/user/save")
    public String userSave(){
        User user = User.builder().name("aa").createDate(new Date()).build();
        userService.save(user);
        return "success";
    }
}
