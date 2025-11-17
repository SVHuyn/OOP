package Extend;

import AccessModifier.Gun;

class Vehicl{
    protected String brand = "Ford";        // Vehicle attribute
    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

public class mainnn extends Vehicl {

    public static void main(String[] args) {

        mainnn Car = new mainnn();

        Car.honk();

        String str = "fsdhfu435hsdfu3454hsdfuh3453sdhf";
        String onlyLetters = str.replaceAll("[0-9]", "");
        System.out.println(onlyLetters);
    }
}
