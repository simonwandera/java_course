package com.JDBC.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IEntity {
    private String tableName;

    private Map<String, Object> entitiesMap;

    public Map<String, Object> getEntitiesMap() {
        return entitiesMap;
    }

    public String getTableName() {
        return tableName;
    }

    public IEntity(Map<String, Object> entitiesMap, String tableName) {
        this.tableName = tableName;
        this.entitiesMap = entitiesMap;
    }
}
