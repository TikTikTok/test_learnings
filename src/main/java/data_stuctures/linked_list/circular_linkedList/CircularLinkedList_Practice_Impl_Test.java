package data_stuctures.linked_list.circular_linkedList;

public class CircularLinkedList_Practice_Impl_Test {

    public static void main(String[] args) {
        CircularLinkedList_Practice_Impl circularLinkedList = new CircularLinkedList_Practice_Impl();
        circularLinkedList.insertFirst(1);
        circularLinkedList.insertFirst(2);
        circularLinkedList.insertFirst(3);
        circularLinkedList.displayList();

        System.out.println(" Delete First ");
        circularLinkedList.deleteFirst();
        circularLinkedList.displayList();
        System.out.println(" Deleted Last ");
        circularLinkedList.deleteLast();
        circularLinkedList.displayList();
        System.out.println(" Deleted Last ");
        circularLinkedList.deleteLast();
        circularLinkedList.displayList();

        System.out.println(" Inserted Again ");
        circularLinkedList.insertFirst(1);
        circularLinkedList.insertFirst(2);
        circularLinkedList.insertFirst(3);
        circularLinkedList.insertFirst(4);
        circularLinkedList.displayList();

        System.out.println(" Deleted Last ");
        circularLinkedList.deleteLast();
        circularLinkedList.displayList();

        System.out.println(" Delete First ");
        circularLinkedList.deleteFirst();
        circularLinkedList.displayList();

    }
}
