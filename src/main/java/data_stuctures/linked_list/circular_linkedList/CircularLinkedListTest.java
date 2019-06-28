package data_stuctures.linked_list.circular_linkedList;

public class CircularLinkedListTest {

    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertFirst(1);
        circularLinkedList.insertFirst(2);
        circularLinkedList.insertFirst(3);
        circularLinkedList.insertFirst(4);
        circularLinkedList.insertFirst(5);
        circularLinkedList.displayList();
    }
}
