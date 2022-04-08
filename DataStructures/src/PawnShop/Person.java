package PawnShop;

public class Person {

    protected String name;
    private int age;
    private int jobPosition;
    private int vacationDays;
    private double bruteSalaray;
    private double netSalary;
    public double discount;
    public double money;

    public double pay(double money){
        this.money = money;
        return money;

    }

    public double buy(double money){
        this.money = money;
        return money;

    }

    public double returnMoney(double money){
        this.money = money;
        return money;

    }

    public String returnObject(String object){
        // look in clasele de obiecte!
        return object;
    }
}
