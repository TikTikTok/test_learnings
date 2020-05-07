package data_stuctures.linked_list.singly_linked_list;

public class SinglyLinkedList {

    private Node first;

    public SinglyLinkedList() {

    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public Node deleteFirst() {
        Node deleteFirst = first;
        first = first.next;
        return deleteFirst;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        Node currentNode = first;
        while (currentNode != null) {
            if (currentNode.next == null) {
                currentNode.next = newNode;
                break;
            }
            currentNode = currentNode.next;
        }
    }

    public Node deleteLast() {
        Node currentNode = first;
        Node lastNode = null;
        while (currentNode != null) {
            if (currentNode.next.next == null) {
                lastNode = currentNode.next;
                currentNode.next = null;
            }
            currentNode = currentNode.next;
        }
        return lastNode;
    }

    public void insertMiddle(int data) {
        Node currentNode = first;
        while (currentNode.next.data == data) {
            Node previous = currentNode.next.next;
            Node middle = currentNode.next;
            Node after = currentNode;


            currentNode = currentNode.next;
        }
    }

    public void displayList() {
        System.out.println(" List (first --> last)");
        Node currentNode = first;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }


     SinglyLinkedList deleteNode(SinglyLinkedList head, int position) {

        int counter = 0;
        SinglyLinkedList singlyLinkedList = head;
        Node node = singlyLinkedList.first;

        while (node.next != null) {
            Node previous = node;
            Node after = node.next;
            Node afterAfter = node.next.next;
            if (counter == position)//1
            {
                this.first = after;
            } else {
                if (counter == position) {
                    previous.next = afterAfter;
                }
            }
            node = node.next;
            counter++;//1
        }
        return head;
    }

}
