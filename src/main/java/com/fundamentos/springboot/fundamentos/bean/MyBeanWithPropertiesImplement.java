package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanWithPropertiesImplement implements MyBeanWithProperties {

    String name;
    String lastName;

    public MyBeanWithPropertiesImplement(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String function() {
        return name + "-" + lastName;
    }
}
