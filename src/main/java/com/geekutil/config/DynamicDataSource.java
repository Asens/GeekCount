package com.geekutil.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        String datasource = DataSourceContextHolder.getDbType();
        return datasource;
    }
}
