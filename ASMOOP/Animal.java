package ASMOOP;

public class Animal {
    int age;
    String nameAnimal;
    protected int kgAnimal;

    public Animal(String nameAnimal){
        this(3, nameAnimal, 8);
    }

    public Animal(int age, String nameAnimal, int kgAnimal){
        this.age = age;
        this.nameAnimal = nameAnimal;
        this.kgAnimal = kgAnimal;
    }

    public void printNameAndAge (){
        System.out.println("Age: " + age + ", Name animal: " + nameAnimal + kgAnimal);
    }
}
