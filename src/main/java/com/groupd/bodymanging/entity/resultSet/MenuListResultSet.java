package com.groupd.bodymanging.entity.resultSet;

public interface MenuListResultSet { //이거 왜 인터페이스로 하는가
    public int getMenuIndex();
    public String getMenuCode();
    public String getTime();
    public String getMonday();
    public String getTuesday();
    public String getWednesday();
    public String getThursday();
    public String getFriday();
    public String getSaturday();
    public String getSunday();
}
