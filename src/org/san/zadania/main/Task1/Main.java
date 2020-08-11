package org.san.zadania.main.Task1;

public class Main {
    public static void main(String[] args) {
        Animal a = new Cat();
        Animal b = new Dog();
        interactWithAnimals(a, b);
    }

    private static void interactWithAnimals(Animal a, Animal b) {
        a.speak();
        b.speak();
        a.speak();
        b.speak();
    }
}
