import Queue.Queue;

public class Main {

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.add(3);
        queue.add(1);
        queue.add(10);
        queue.delete();
        queue.delete();
        queue.delete();

        System.out.println("stalking:");

        queue.stalk();

        System.out.println("List is here:");
        queue.print();
    }

}
