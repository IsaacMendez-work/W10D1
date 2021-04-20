package com.tts;

public class Car {


    // Minimum 3 private instance variables
    private String model;
    private String color;
    private int yearMake;
    private int noOfOwners;


    // getter and setter method


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearMake() {
        return yearMake;
    }

    public void setYearMake(int yearMake) {
        this.yearMake = yearMake;
    }

    public int getNoOfOwners() {
        return noOfOwners;
    }

    public void setNoOfOwners(int noOfOwners) {
        this.noOfOwners = noOfOwners;
    }

    // An empty constructor

    public Car() {

    }

    //A constructor that uses only 2 of your 3 variables


    public Car(String color, String model) {
        this.color = color;
        this.model = model;

    }

    public Car(String color, String model, int yearMake) {
        this.color = color;
        this.model = model;
        this.yearMake = yearMake;
    }

// toStringMethod()


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearMake=" + yearMake +
                ", noOfOwners=" + noOfOwners +
                '}';
    }

    // A method that returns a Boolean

    public boolean isNewCar() {
        return yearMake>= 2017;
    }



}