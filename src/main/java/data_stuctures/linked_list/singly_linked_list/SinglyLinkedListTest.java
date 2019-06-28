package data_stuctures.linked_list.singly_linked_list;

public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(5);
        singlyLinkedList.insertFirst(9);
        singlyLinkedList.insertFirst(12);
        singlyLinkedList.displayList();
        singlyLinkedList.deleteFirst();
        singlyLinkedList.displayList();
        System.out.println(singlyLinkedList.isEmpty());
        singlyLinkedList.insertLast(1000);
        singlyLinkedList.displayList();
        singlyLinkedList.deleteLast();
        singlyLinkedList.displayList();
    }
}
