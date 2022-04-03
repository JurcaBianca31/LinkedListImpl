package Inheritance;

public class Cat extends Animal{

    public Cat(String catName){
        this.name = catName;
    }

    public void speak() {
        System.out.println("Meow");
    }
}
