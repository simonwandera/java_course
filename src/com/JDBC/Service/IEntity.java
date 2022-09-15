package com.JDBC.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IEntity {
    private List<String> columns;
    private String tableName;
    private List<Object> targetColumns;

    private Map<String, Object> entitiesMap;

    public List<Object> getTargetColumns() {
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
        this.entitiesMap = new HashMap<>();
    }
}
