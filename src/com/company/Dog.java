package com.company;

public class Dog extends Animal {


    private String breed;
    private Person owner;

    public Dog(String name, int age, Person owner, String breed) {
        super(name, age);
        this.owner = owner;
        this.breed = breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getOwnerName() {
        return owner.getName();
    }

    public int getOwnerAge() {
        return owner.getAge();
    }

    @Override
    public String toString() {
        return "Dog {" +
                "name = " + this.getName() + '\'' +
                ", age = " + this.getAge() +
                ", owner name = " + getOwnerName() +
                ", owner age = " + getOwnerAge() +
                ", breed = " + getBreed() +
                '}';
    }
}
