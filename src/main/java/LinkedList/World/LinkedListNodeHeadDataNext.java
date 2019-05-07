package LinkedList.World;

public class LinkedListNodeHeadDataNext {

    Node head;

    static class Node
    {
        Node next;
        int data;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        LinkedListNodeHeadDataNext linkedListNodeHeadDataNext = new LinkedListNodeHeadDataNext();
        linkedListNodeHeadDataNext.head = new Node(1);
        Node second = new Node(2);
        Node third  = new Node(3);
        linkedListNodeHeadDataNext.head.next = second;
        second.next = third;
        linkedListNodeHeadDataNext.printList();
        linkedListNodeHeadDataNext.push(4);
        linkedListNodeHeadDataNext.printList();
        //System.out.println(" delete at head ");
        //linkedListNodeHeadDataNext.removeFromHead();

        System.out.println(" delete in between ");
        linkedListNodeHeadDataNext.removeFirstOccurance(2);
        linkedListNodeHeadDataNext.printList();

        System.out.println(" length of the linked list  ");
        int length = linkedListNodeHeadDataNext.lenthOfLinkedList();
        System.out.println(" linked list length "+length );

        System.out.println(" delete linked list ");
        linkedListNodeHeadDataNext.deleteLinkedList();
        linkedListNodeHeadDataNext.printList();




    }

        public void printList()
        {
            Node node = head;
            while(node!= null)
            {
                System.out.println(node.data +" Data ");
                node = node.next;
            }
        }


    public void push(int data)
    {
        LinkedListNodeHeadDataNext.Node new_node = new LinkedListNodeHeadDataNext.Node(data);

        new_node.next = head;

        head =  new_node;
    }

    public void removeFromHead()
    {
        Node node = head;

        head.next = head;
        head = null;
    }

    public void removeElement(int dataAsKey) {

        Node temp = head;
        Node prev =  null;

        if (temp != null && temp.data == dataAsKey) {
            head = temp.next;
        }

        while (temp!=null && temp.data != dataAsKey)
        {
            prev = temp;
            temp  = temp.next;
        }

        if(temp==null)
            return;
        prev.next = temp.next;

    }

    public void deleteLinkedList()
    {
        Node node = head;
        head = null;
    }


    public void removeFirstOccurance(int dataAsKey)
    {
        Node node = head;
        Node previous = null;
        Node after = null;


            while (node.next != null) {
                if (node.data == dataAsKey) {
                    after = node.next;
                    previous.next = node.next;
                    break;

                } else {
                    previous = node;

                }

                node = node.next;


        }
    }


    public int lenthOfLinkedList()
    {
        Node node = head;
        int length = 0;
        while (node!=null)
        {
            ++length;
            node = node.next;
        }

        return length;
    }

    public void searchElement(int dataKey)
    {
        Node node = head;

    }

}
