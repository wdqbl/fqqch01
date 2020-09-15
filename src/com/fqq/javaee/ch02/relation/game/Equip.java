package com.fqq.javaee.ch02.relation.game;

public class Equip {
//装备拥有名称，级别，颜色，类别，攻击力，防御力
    private String name;
    private int level;
    private String color;
    private String kind;
    private int power;
    private int defence;

    public Equip() {
    }

    public Equip(String name, int level, String color, String kind, int power, int defence) {
        this.name = name;
        this.level = level;
        this.color = color;
        this.kind = kind;
        this.power = power;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void show(){
        System.out.println("装备名称："+name );
        System.out.println("装备级别："+level  );
        System.out.println("装备颜色："+color  );
        System.out.println("装备类别："+kind  );
        System.out.println("装备攻击力："+power   );
        System.out.println("装备防御力："+defence  );
    }

}
