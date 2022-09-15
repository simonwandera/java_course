package com.JDBC.Service;
import java.util.Map;

public class Entity {
    private String tableName;

    private Map<String, Object> entitiesMap;

    public Map<String, Object> getEntitiesMap() {
        return entitiesMap;
    }

    public String getTableName() {
        return tableName;
    }

    public Entity(Map<String, Object> entitiesMap, String tableName) {
        this.tableName = tableName;
        this.entitiesMap = entitiesMap;
    }

}
