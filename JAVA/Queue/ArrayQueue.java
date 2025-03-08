import java.util.NoSuchElementException;

public class ArrayQueue {
    private int[] arr;
    private int front, rear, capacity, size;

    ArrayQueue(int _capacity) {
        capacity = _capacity;
        arr = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    int size() {
        return size;
    }
    int capacity() {
        return capacity;
    }
    int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return arr[front];
    }
    void enqueue(int ele) {
        if (isFull()) {
            throw new IllegalStateException("Bass karo");
        }
        arr[rear] = ele;
        rear = (rear + 1) % capacity;
        size++;
    }
    int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        int ele = arr[front];
        front = (front + 1) % capacity;
        size--;
        return ele;
    }
    boolean isFull() {
        return size == capacity;
    }
    boolean isEmpty() {
        return size == 0;
    }
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }
        else {
            System.out.println("Elements of Queue: ");
            int index = front;
            for (int i = 0; i < size; i++) {
                System.out.print(arr[index] + " ");
                index = (index + 1) % capacity;
            }
        }
        
    }
}