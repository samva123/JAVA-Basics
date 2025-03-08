public class Main {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(10);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(2);
        q.enqueue(2);
        System.out.println(q.peek());
        q.dequeue();
    }
}
