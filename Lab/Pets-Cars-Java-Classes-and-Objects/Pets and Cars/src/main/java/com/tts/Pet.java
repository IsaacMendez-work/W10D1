package com.tts;

public class Pet {


    private String name;
    private int  age;
    private String location;
    private String type;

    public Pet(){

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}