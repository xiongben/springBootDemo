package com.xiongben.boot.bean;

public class User {
    private String name;
    private Integer age;
    private  Pet pet;
    public User(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
