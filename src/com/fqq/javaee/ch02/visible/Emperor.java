package com.fqq.javaee.ch02.visible;

public class Emperor {

     private String name;
     private int time;
     private String  achievements;
     private String description;

    public Emperor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void show(){
        System.out.println("姓名："+name);
        System.out.println("在位时间："+time+"年");
        System.out.println("政绩："+achievements );
        System.out.println("描述："+description );

    }
}
