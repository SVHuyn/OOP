package Extend;

import AccessModifier.Gun;

public class mainnn extends Gun {

    private void test(){
        Gun g1 = new Gun();
        g1.name = "10";

        // kế thừa và chỉnh sửa trực tiếp không cần khai báo 'g1'
        quantity = 100; // protected
    }
    public static void main(String[] args) {



    }
}
