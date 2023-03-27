
import java.util.Scanner;

public class Queue extends Ship {

    private int queSize = 36;
    private int front, rear;
    private String items[] = new String[queSize];

    public Queue() {
        front = -1;
        rear = -1;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int getRear() {
        return rear;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    // Checking if the queue is full

    public boolean isFull() {
        if (front == 0 && rear == queSize - 1) {
            return true;
        }
        else if (front == rear + 1) {
            return true;
        }
        return false;
    }


    // Adding an element to queue

    public void addQue() {
        Scanner in = new Scanner(System.in);
        if (isFull()) {
            System.out.println("The Queue is Full...");
        } else {
            System.out.println("No Cabins Available Now. Please Enter Your Name to Added to Waiting List...");
            String element = in.next();
            if (front == -1)
                front = 0;
            rear = (rear + 1) % queSize;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    // Removing an element in queue

    public String deQueue () {
        String element;

        element = items[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        }

        /* Q has only one element, so we reset the queue after deleting it. */

        else {
            front = (front + 1) % queSize;
        }
        return (element);

    }
}


