package AccessModifier;

import Contructor.Cars;
import Extend.Train;

public class hello extends Cars {
    public static void main(String[] args) {

        Gun firstObj = new Gun("AK-47", 30);

        System.out.println(firstObj.getNameGun() + " " + firstObj.getQuantity());



    }
}
