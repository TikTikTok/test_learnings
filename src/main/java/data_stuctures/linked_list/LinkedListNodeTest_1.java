package data_stuctures.linked_list;

public class LinkedListNodeTest_1 {
    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.data = 5;
        Node nodeB = new Node();
        nodeB.data = 6;
        Node nodeC = new Node();
        nodeC.data = 7;
        Node nodeD = new Node();
        nodeD.data = 8;
        Node nodeE = new Node();
        nodeE.data = 9;
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = null;

        LinkedListNodeTest_1.listLength(nodeA);

    }

    public static int listLength(Node node)
    {
        int length =0;

        while (node!=null)
        {
            length++;
            System.out.println(node.data);
            node= node.next;
        }
        return length;
    }
}
