import LinkedList.LinkedList;

public class Main {

    public static void main(String[] args){

        LinkedList numere = new LinkedList();

        numere.add(10);
        numere.add(5);
        numere.add(2);
        numere.delete(2);

        numere.print();

    }

}
