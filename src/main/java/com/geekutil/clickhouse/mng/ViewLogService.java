package com.geekutil.clickhouse.mng;

import com.baomidou.mybatisplus.extension.service.IService;
import com.geekutil.clickhouse.entity.ViewLog;

/**
 * @author Asens
 * create 2019-07-17 22:04
 **/

public interface ViewLogService extends IService<ViewLog> {
    void saveData(ViewLog viewLog);
}
