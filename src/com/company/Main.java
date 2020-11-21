package com.company;

public class Main {

    public static void main(String[] args) {
        Person Jack = new Person("Jack", 60);
        Person Claire = new Person("Claire", 55);
        String nameOfKing;
        Dog Rover = new Dog("Rover", 12, Jack, "Pug");
        System.out.println(Rover);

        Rover.setOwner(Claire);
        System.out.println(Rover);

        Person personX = Rover.getOwner();
        System.out.println("Person X is now: " + personX);

        Rover.setOwner(Jack);
        System.out.println(Rover);

        Person personY = Rover.getOwner();
        System.out.println("Person Y is now: " + personY);

        King.getKingInstance();
        King.getKingInstance();
        nameOfKing = King
                .getKingInstance()
                .getName();
        System.out.println("The kings name is: " + nameOfKing);
    }
}
