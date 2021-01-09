package com.geekutil.clickhouse.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import java.util.Date;

@TableName("view_log")
@Data
@Builder
public class ViewLog {
    @Tolerate
    public ViewLog(){}

    @TableId(type= IdType.AUTO)
    private Integer id;

    private String type;

    private Date createDate;

}