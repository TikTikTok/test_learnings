package data_stuctures.linked_list;

public class LinkedListNodeTest_1 {
    public static void main(String[] args) {
        Node_1 nodeA = new Node_1(3);
        Node_1 nodeB = new Node_1(4);
        Node_1 nodeC = new Node_1(5);
        Node_1 nodeD = new Node_1(6);
        Node_1 nodeE = new Node_1(6);
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = null;

        LinkedListNodeTest_1.listLength(nodeA);

    }

    public static int listLength(Node_1 node)
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
