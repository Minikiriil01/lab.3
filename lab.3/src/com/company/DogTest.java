package com.company;

import java.util.Scanner;

public abstract class DogTest {
    private String name;
    private int age;
    Scanner sc = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public DogTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName() {
        name = sc.nextLine();
    }

    public void setAge() {
        age = sc.nextInt();
    }
public abstract  void setBreed();
public abstract  void info ();
}
