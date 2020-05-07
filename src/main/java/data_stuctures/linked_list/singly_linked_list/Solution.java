package data_stuctures.linked_list.singly_linked_list;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node) throws IOException {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode node = head;
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (head == null) {
            node = new SinglyLinkedListNode(data);
            head = node;
            head.next = null;
        }

        while (node!=null)
        {
            node.next = newNode;
            node =  node.next;
        }

        return head;
    }


    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {

        int counter =0;
        SinglyLinkedListNode node = head;
        while(node.next!=null)
        {
            SinglyLinkedListNode previous = node;
            SinglyLinkedListNode after = node.next;
            SinglyLinkedListNode afterAfter = node.next.next;
            if(counter==position)//1
            {
                head = after;
                //previous=null;
            }else
            {
                previous.next = afterAfter;
            }
            node = node.next;
            counter++;//1
        }
        return head;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();

            SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);

            llist.head = llist_head;
        }

        printSinglyLinkedList(llist.head);

        scanner.close();
    }
}
