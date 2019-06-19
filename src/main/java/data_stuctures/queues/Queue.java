package data_stuctures.queues;

public class Queue {

    private int rear;
    private int front;
    private int maxSize;
    private long queueArr[];
    private int nItems;

    public Queue(int size) {
        this.nItems = 0;
        this.front = 0;
        this.rear = -1;
        this.maxSize = size;
        this.queueArr = new long[size];
    }

    public void insert(long data) {
        if (rear == maxSize-1)
        {
            rear =-1;
        }
        rear++;
        queueArr[rear] = data;
        nItems++;
    }

    public long remove() {
        long temp = queueArr[front];
        front++;
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public long peekFront() {
        return queueArr[front];
    }

    public boolean isEmpty() {
        if (nItems == 0) {
            return true;
        }

        return false;
    }

    public boolean isFull() {
        if (nItems == maxSize) {
            return true;
        }
        return false;
    }

    public void view()
    {
        for (int i = 0; i < queueArr.length; i++) {
            System.out.println(" items :"+queueArr[i]);
        }
    }
}
