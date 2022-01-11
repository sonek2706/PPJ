package Taskz1003;

public class SortedSLL {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getData() {
            return this.data;
        }
    }

    public SortedSLL() {
        this.head = null;
    }

    public void addSorted(int val) {

        Node node = new Node(val);
        if (head == null)
            head = node;
        else {
            if (head.getData() > node.getData()) {
                node.setNext(head);
                head = node;
            } else {
                Node tmp = head;
                while (tmp.getNext() != null && tmp.getNext().getData() < val) {
                    tmp = tmp.getNext();
                }

                if (tmp.getNext() == null) tmp.setNext(node);
                else {
                    node.setNext(tmp.getNext());
                    tmp.setNext(node);
                }
            }
        }

    }

    public void show() {
        Node tmp = head;

        while (tmp.getNext() != null) {
            System.out.println(tmp.getData());
            tmp = tmp.getNext();
        }

        System.out.println(tmp.getData());
    }
}
