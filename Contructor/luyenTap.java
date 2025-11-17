package Contructor;

public class luyenTap {
    public static void main(String[] args) {

        // tạo đối tượng của lớp
        Family family = new Family();

        family.setName("Huynh");
        family.setAge(24);
        family.setAddress("Điện Biên");

        System.out.println(family.getName() + " " + family.getAge() + " " + family.getAddress());
    }
}
