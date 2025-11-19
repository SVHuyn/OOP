package Assignment;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        // Nhap thong tin sp 1
        // Khong co tham so
        product.enterInfomation();

        // sp 2
        // co tham so
        Product product2 = new Product("Ao thun", 1000000, 0.5);

        // sp 3
        // Su dung getter setter
        Product product3 = new Product("Ao da", 5000000, 0.2);

        // sp 4 : nhap du lieu tu ban phim qua getter setter
        Product product4 = new Product();

        System.out.print("Nhap ten san pham: ");
        product4.setName(scanner.nextLine());

        System.out.print("Nhap gia san pham: ");
        product4.setPrice(scanner.nextDouble());

        System.out.print("Nhap thue san pham (0-10%): ");
        product4.setTax(scanner.nextDouble());


        // Thong tin 3 san pham
        product.exportInformation();
        product2.exportInformation();
        product3.exportInformation();
        product4.exportInformation();


    }
}
