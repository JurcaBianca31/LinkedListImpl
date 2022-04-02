package Queue;

import LinkedList.LinkedList.Node;

public class Queue {

    Node head;

    public void add(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return;
        }
        Node mock = head;
        while (mock != null) {
            if (mock.next == null) {
                mock.next = node;
                return;
            }
            mock = mock.next;
        }

    }

    public void print() {
        Node mock = head;
        while (mock != null) {
            System.out.println(mock.value);
            mock = mock.next;
        }
    }

    public void delete() {
        if (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }

    public void stalk() {
        if (head == null) {
            System.out.println("null");
            return;
        }
        System.out.println(head.value);
    }
}
