package data_stuctures.queues;

public class QueueTest {

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);
        queue.insert(9);
        queue.view();
    }
}
