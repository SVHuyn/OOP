package Polymorphism;

import Extend.Animals;

public class MainOld {

    public static void main(String[] args) {

        // Đa hình

        Animals animals = new Animals();

        Animals myCat = new Cat();
        Animals myPig = new Pig();

        animals.animalSound();
        myCat.animalSound();
        myPig.animalSound();
    }
}
