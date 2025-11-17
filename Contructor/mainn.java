package Contructor;

import AccessModifier.Gun;

public class mainn {
    public static void main(String[] args) {

        // là Contructor: hàm tạo
        Cars cars = new Cars(); // khởi tạo hàm tạo

        cars.setName("Volvo");
        cars.setYear(1994);

        System.out.println("Check obj: " + cars.getName() + ", Year: " + cars.getYear());

        Gun newG = new Gun();

    }
}
