package PawnShop;

public class Jewellery extends Produce {

    public Jewellery(String name){
        this.name = name;
    }

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
