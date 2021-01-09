package com.geekutil.config;

public enum DBTypeEnum {

    DB_CLICKHOUSE("db-clickhouse"), DB_MYSQL("db-mysql");

    private String value;

    DBTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
