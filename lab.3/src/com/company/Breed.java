package com.company;

import java.util.Scanner;

public class Breed extends DogTest {
    protected String breed;
    Scanner lc = new Scanner(System.in);

    public Breed(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    public void setBreed() {
        breed = lc.nextLine();
    }
    public void info() {
        System.out.println("Name: " + super.getName() + "\nAge:" + super.getAge() + "\nBreed:" + this.breed);
    }

}
