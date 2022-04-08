package PawnShop;

public class Produce {

    public String name;
    public String detail;
    public double offer;
    public double price;

    public double value(double price){
        this.price = price;
        return price;
    }

    public double offer(double offer){
        this.offer = offer;
        return offer;
    }

    public void detail(String detail){
        this.detail = detail;
        System.out.println(detail);
    }

}
