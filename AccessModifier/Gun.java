package AccessModifier;

public class Gun {

    // private mày sinh ra o dau thi may o day
    private String nameGun; // private chỉ có thể truy cập bên trong chính nó
    private int quantity;
    int a; // la` default
    // public có thể truy cập ở khắp mọi nơii


    public Gun(String nameGun, int quantity){
        this.nameGun = nameGun;
        this.quantity = quantity;
    }

    public String getNameGun(){
        return this.nameGun;
    }

    public int getQuantity(){
        return this.quantity;
    }


}
