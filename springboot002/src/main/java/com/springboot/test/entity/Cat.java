package com.springboot.test.entity;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name;
    private String genger;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenger() {
        return genger;
    }

    public void setGenger(String genger) {
        this.genger = genger;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", genger='" + genger + '\'' +
                '}';
    }
}
