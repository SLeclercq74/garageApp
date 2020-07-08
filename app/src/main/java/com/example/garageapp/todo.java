package com.example.garageapp;

import java.util.Date;

public class todo {

    int id;
    String desc;
    Date date;

    public todo(int id, String description, Date date) {
        setId(id);
        setDesc(description);
        setDate(date);
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getDesc() { return desc; }
    public void setDesc(String description) { this.desc = description; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }


}
