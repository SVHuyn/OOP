package myfavoritefruit;

public class main {

    public static void main(String[] args) {

        // tạo đối tượng của medthod
        classMethods myMethodsFruit = new classMethods();
        myMethodsFruit.myMethod();

        // truy cập thuộc tính bằng cách tạo một đối tượng của lớp
        Fruit myFruit = new Fruit();
        myFruit.quantity = 20;
        myFruit.color = "Green";
        // có thể sửa đổi giá trị của thuộc tính
        System.out.println("Fruit: " + myFruit.str + ", Quantity: " + myFruit.quantity + ", Color: " + myFruit.color); // sủ dụng dấu chấm để gọi đến thuộc tính của lớp
        Fruit myFruit2 = new Fruit();
        myFruit2.quantity = 10;
        myFruit2.str = "Orange"; // thay đổi giá trị của thuộc tính thành 'Orange'
        myFruit2.color = "Orange";
        System.out.println("Fruit: " + myFruit2.str + ", Quantity: " + myFruit2.quantity + ", Color: " + myFruit2.color);

        myMethodsFruit.maxQuantity(100);


    }
}
