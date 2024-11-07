package HashSet;

import java.util.Arrays;

public class GPANA {
    public static void main(String[] args) {
        Animal myAnimal;

        myAnimal = new Dog(); // Creating a Dog object and assigning it to an Animal reference
        myAnimal.sound();    // Calls the overridden sound method in Dog class

        myAnimal = new Cat(); // Creating a Cat object and assigning it to an Animal reference
        myAnimal.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}


