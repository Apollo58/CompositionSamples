package com.company;

public class Main {

    public static void main(String[] args) {
        Person Jack = new Person("Jack", 60);
        Person Claire = new Person("Claire", 55);

        Dog Rover = new Dog("Rover", 12, Jack);
        System.out.println(Rover);

        Rover.setOwner(Claire);
        System.out.println(Rover);

        Person personX = Rover.getOwner();
        System.out.println("Person X is now: " +personX);

        Rover.setOwner(Jack);
        System.out.println(Rover);

        Person personY = Rover.getOwner();
        System.out.println("Person Y is now: " +personY);
    }
}
