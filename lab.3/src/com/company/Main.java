package com.company;

public class Main {

    public static void main(String[] args) {
        Breed n1 = new Breed("Маруся", 4, "Лабрадор");
        DogTest n2 = new Breed("", 0, "");
        n1.info();
        n2.setName();
        n2.setAge();
        n2.setBreed();
        n2.info();
    }
}
