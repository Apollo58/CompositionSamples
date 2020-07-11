package com.company;

public class Main {

    public static void main(String[] args) {
        Person Peter = new Person("Peter", 60);
        Person Celeste = new Person("Celeste", 55);

        Dog Podge = new Dog("Podge", 12, Peter);
        System.out.println(Podge);

        Podge.setOwner(Celeste);
        System.out.println(Podge);

        Person personX = Podge.getOwner();
        System.out.println("Person X is now: " +personX);
    }
}
