package Inheritance;

public class Dog extends Animal{

    public Dog(String dogName){
        this.name = dogName;
    }

    public void speak() {
        System.out.println("Woof");
    }

    public void play() {
        System.out.println(name + " is chasing a ball");
    }
}
