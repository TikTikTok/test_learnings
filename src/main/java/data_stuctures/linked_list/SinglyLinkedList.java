package data_stuctures.linked_list;

public class SinglyLinkedList {

    private Node_1 first;
    private Node_1 node;

    public SinglyLinkedList()
    {

    }

    public boolean isEmpty()
    {
        return (first == null);
    }

    public void push(int data)
    {
        Node_1 node_1 = new Node_1(data);
        if (first == null)
        {
            first = node_1;
            first.next = null;
        }

        node = node_1;
        node.next = null;
    }
}
