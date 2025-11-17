package ASMOOP;

import Extend.Train;

public class MainAnimal extends Train {

    private String modelName = "Toyota";

    public static void main(String[] args) {
        Animal animal = new Animal("Cat");
        Animal animal2 = new Animal(5, "Dog", 8);

        animal.printNameAndAge();
        animal2.printNameAndAge();

        // Extends tu` Train
        MainAnimal cars = new MainAnimal();
        cars.honk();
        System.out.println(cars.modelName + ", " + cars.brand);

    }
}
