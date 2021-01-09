package com.geekutil.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Tolerate;

import java.util.Date;

@TableName("user")
@Data
@Builder
public class User {
    @Tolerate
    public User(){}

    @TableId(type= IdType.AUTO)
    private Integer id;

    private String name;

    private Date createDate;

}
