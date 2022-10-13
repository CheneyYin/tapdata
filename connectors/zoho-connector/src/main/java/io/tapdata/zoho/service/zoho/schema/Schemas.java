package io.tapdata.zoho.service.zoho.schema;

import java.util.ArrayList;
import java.util.List;

public enum Schemas {
    Tickets("Tickets",      Tickets.class,        Boolean.TRUE),


    ;
    String tableName;
    Class<? extends Schema> schemaCls;
    boolean isUse;
    Schemas(String tableName,Class<? extends Schema> schemaCls,boolean isUse){
        this.schemaCls = schemaCls;
        this.tableName = tableName;
        this.isUse = isUse;
    }


    public static List<Schema> allSupportSchemas(){
        Schemas[] values = values();
        ArrayList<Schema> objects = new ArrayList<>();
        for (Schemas value : values) {
            if (null != value && value.isUse) {
                try {
                    objects.add(value.schemaCls.newInstance());
                } catch (InstantiationException e) {
                } catch (IllegalAccessException e) {
                }
            }
        }
        return objects.isEmpty()?null:objects;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Class getSchemaCls() {
        return schemaCls;
    }

    public void setSchemaCls(Class schemaCls) {
        this.schemaCls = schemaCls;
    }
}
