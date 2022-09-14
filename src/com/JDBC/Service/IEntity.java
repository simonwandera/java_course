package com.JDBC.Service;

import java.util.ArrayList;
import java.util.List;

public class IEntity {
    private List<String> columns;
    private String tableName;
    private List<String> targetColumns;

    public List<String> getTargetColumns() {
        return targetColumns;
    }

    public List<String> getColumns() {
        return columns;
    }

    public String getTableName() {
        return tableName;
    }

    public IEntity(List<String> columns, String tableName) {
        this.columns = columns;
        this.tableName = tableName;
        this.targetColumns = new ArrayList<>();
    }
}
