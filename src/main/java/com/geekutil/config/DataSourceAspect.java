package com.geekutil.config;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = -100)
@Log4j2
@Aspect
public class DataSourceAspect {
    @Pointcut("execution(* com.geekutil.clickhouse.mng..*.*(..))")
    private void dbClickhouseAspect() {
    }

    @Pointcut("execution(* com.geekutil.mng..*.*(..))")
    private void dbMysqlAspect() {
    }

    @Before("dbClickhouseAspect()")
    public void dbClickhouse() {
        log.info("切换到db1 数据源...");
        DataSourceContextHolder.setDbType(DBTypeEnum.DB_CLICKHOUSE);
    }

    @Before("dbMysqlAspect()")
    public void dbMysql() {
        log.info("切换到db2 数据源...");
        DataSourceContextHolder.setDbType(DBTypeEnum.DB_MYSQL);
    }
}
