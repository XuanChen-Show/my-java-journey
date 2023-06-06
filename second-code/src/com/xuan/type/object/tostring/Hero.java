package com.xuan.type.object.tostring;

import java.util.Objects;

/**
 * @author : 轩辰;
 * @since 2023/06/06 23:36
 **/
public class Hero {
    private String name;
    private int high;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public Hero() {
    }

    public Hero(String name, int high) {
        this.name = name;
        this.high = high;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", high=" + high +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else {
            if (obj instanceof Hero) {
                Hero hero = (Hero) obj;
                if (hero.high == this.high) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, high);
    }
}
