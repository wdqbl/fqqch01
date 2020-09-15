package com.fqq.javaee.ch02.relation.game;

public class Hero {
    //游戏角色拥有昵称，等级，血量，攻击力，防御力，种族，装备（只能装3个装备，初始没有装备）。
    private String name;
    private int  level;
    private int  blood;
    private int  power;
    private int defence;
    private String kind;

    private Equip[] equips = new Equip[3];

    public Hero() {
    }

    public Hero(String name, int level, int blood, int power, int defence, String kind, Equip[] equips) {
        this.name = name;
        this.level = level;
        this.blood = blood;
        this.power = power;
        this.defence = defence;
        this.kind = kind;
        this.equips = equips;
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

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Equip[] getEquips() {
        return equips;
    }

    public void setEquips(Equip[] equips) {
        this.equips = equips;
    }
//拥有一定几率打出暴击
    public void attack(Monster m) {

        int random = (int) (Math.random() * 10 + 1);
        int block = 0;
        if (random > 2) {
            block = random * 3;
        }


    }
}