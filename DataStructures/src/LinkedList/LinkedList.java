package LinkedList;

public class LinkedList {

    Node head;

    public static class Node {

        public Node next;
        public int value;

        public Node(int value) {

            this.value = value;
        }
    }

    public void add(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node mock = head;
            while (mock != null) {
                if (mock.next == null) {
                    mock.next = node;
                    break;
                } else {
                    mock = mock.next;
                }
            }
        }
    }

    public void print() {
        Node mock = head;
        while (mock != null) {
            System.out.println(mock.value);
            mock = mock.next;
        }
    }

    public void find(int value) {
        Node mock = head;
        while (mock != null) {
            if (value == mock.value) {
                System.out.println("DA");
                return;
            } else {
                mock = mock.next;
            }
        }
        System.out.println("NU");
    }

    public void delete(int value) {
        Node mock = head;
        if (value == head.value) {
            head = mock.next;
            return;
        }
        while (mock.next != null) {
            if (value == mock.next.value) {
                mock.next = mock.next.next;
                return;
            }
            mock = mock.next;
        }
    }
}
