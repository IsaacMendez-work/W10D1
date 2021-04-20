package com.tts;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n=====================Pet Class==================");

        // getter and setters go together and toString() can be use as a template to print.

        Pet pet1 = new Pet();


        pet1.setName("Brown");
        pet1.setAge(3);
        pet1.setLocation("Charlotte");

        System.out.println(pet1.getAge());

        System.out.println(pet1);

        System.out.println("\n=====================Custom Class==================");

        // instantiating and using a car object
        Car car1 = new Car();
        car1.setModel("Honda");
        car1.setYearMake(2016);
        car1.setColor("Blue");

        System.out.println(car1);


    }
}