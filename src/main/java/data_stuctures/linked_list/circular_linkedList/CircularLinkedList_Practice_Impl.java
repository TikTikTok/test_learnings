package data_stuctures.linked_list.circular_linkedList;

public class CircularLinkedList_Practice_Impl {

    private Node first;
    private Node last;

    public CircularLinkedList_Practice_Impl() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        boolean isEmpty = first == null;
        return isEmpty;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;
        }

        newNode.next = first;
        first = newNode;
    }


    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        }

        last.next = newNode;
        last = newNode;
    }

    public int deleteFirst() {
        int temp = first.data;

        if (first.next == null) {
            last = null;
        }

        first = first.next;
        return temp;
    }

    public int deleteLast() {

        Node previous = null;
        Node current = first;

        if (isEmpty()) {
            return 0;
        }

        while (current != null) {
            previous = current;
            current = current.next;

            if (current == null) {
                last = null;
                first = null;
                return 0;
            }

            if (current.next == null) {
                previous.next = null;
                last = previous;
                last.next = null;
                current = null;
            }
        }
        return 0;
    }


    public void displayList() {
        Node node = first;

        while (node != null) {
            System.out.println(" Node: " + node.data);
            node = node.next;
        }
        System.out.println();
    }
}
