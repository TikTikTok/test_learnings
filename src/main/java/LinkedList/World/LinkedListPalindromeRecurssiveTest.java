package LinkedList.World;

import java.util.HashSet;

public class LinkedListPalindromeRecurssiveTest {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    HashSet set = null;

    public void removeDuplicates() {
        Node node = head;

        set = new HashSet();

        while (node != null) {
            set.add(node.data);
            node = node.next;
        }
    }


    public void removeDuplicatesWithList() {
        Node current = head;
        Node next_next = null;
        while (current != null) {
                Node current_next = current.next;
                if (current.data == current_next.data) {
                    System.out.println(" Removed ");
                    next_next = current.next.next;
                    current.next = null;
                    current.next = next_next;
                } else {
                    current.next = current_next.next;
                }
        }
    }

    public Node reverseLinkedList()
    {
        Node node = head;
        Node current = head;
        Node next = null;
        Node prev = null;

        //1,2
        while (current!= null)
        {
            next = current.next;//2,3
            current.next = prev;//current next = null,1
            prev = current;// previous = 1,
            current = next;// 2
        }
        node = prev;// node = 1
        return node;
    }


    public void printElementss() {
        Node node = head;
        for (Object obj : set) {
            System.out.println(obj);
        }
        return;
    }

    public static void main(String[] args) {
        LinkedListPalindromeRecurssiveTest linkedListPalindromeRecurssiveTest = new LinkedListPalindromeRecurssiveTest();
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seven = new Node(7);

        head = new Node(1);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seven;

        //linkedListPalindromeRecurssiveTest.removeDuplicates();
        //linkedListPalindromeRecurssiveTest.printElementss();
        //linkedListPalindromeRecurssiveTest.removeDuplicatesWithList();
        Node node = linkedListPalindromeRecurssiveTest.reverseLinkedList();

        while (node!= null)
        {
            System.out.println(" Nodes "+node.data);
            node =  node.next;
        }

    }
}
