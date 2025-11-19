package Assignment;

import java.util.Scanner;

public class Product {
    // Khai báo các thuộc tính với access modifier PRIVATE
    private String name;
    private double price;
    private double tax;

    // Khoi tao ham tao contructor cho doi tuong khong co tham so o lop 'MainProduct'
    public Product(){
        this.name = "";
        this.price = 0;
        this.tax = 0;
    }

    // Contructor co tham so
    public Product(String name, double price, double tax){
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    // In thong tin
    public void enterInfomation () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten san pham: ");
        name = scanner.nextLine();

        System.out.print("Nhap gia san pham: ");
        price = scanner.nextDouble();

        System.out.print("Nhap thue san pham (0-10%): ");
        tax = scanner.nextDouble();
    }

    // Xuat thong tin
    public void exportInformation(){
        System.out.println("===== Thong tin san pham =====");
        System.out.println("Ten san pham: " + name);
        System.out.println("Gia san pham: " + price);
//        System.out.println("Thue: " + (tax * 100) + "%");
        System.out.println("Tien thue: " + getTaxPrice() + " VND");
        System.out.println("Tong so tien: " + (price + getTaxPrice() + " VND"));
    }

    // Method tinh tien thue
    public double getTaxPrice(){
        return price * tax;
    }

}
