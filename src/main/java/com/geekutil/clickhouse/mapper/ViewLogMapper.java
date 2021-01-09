package com.geekutil.clickhouse.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.geekutil.clickhouse.entity.ViewLog;
import com.geekutil.entity.User;

public interface ViewLogMapper extends BaseMapper<ViewLog> {
    void saveData (ViewLog viewLog) ;
}
