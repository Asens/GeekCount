package com.geekutil.clickhouse.mng.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.geekutil.clickhouse.entity.ViewLog;
import com.geekutil.clickhouse.mapper.ViewLogMapper;
import com.geekutil.clickhouse.mng.ViewLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ViewLogServiceImpl extends ServiceImpl<ViewLogMapper, ViewLog> implements ViewLogService {

    @Resource
    private ViewLogMapper viewLogMapper;

    @Override
    public void saveData(ViewLog viewLog) {
        viewLogMapper.saveData(viewLog);
    }
}
