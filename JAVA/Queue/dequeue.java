class Node{
    int data;
    Node prev ;
    Node next;

    Node(){
        data = 0 ;
        prev  = null;
        next = null;

    }

    Node(int data){
        this.data  = data ;
        this.next = null;
        this.prev  = null;
    }

}


class dequeue{
    Node front;
    Node rear;
    static int size  = 0 ;

    void addFirst(int item){
        if(size == 0){
            Node temp  = new Node(item);
            front  = temp;
            rear = temp;
        }
        else{
            Node temp  = new Node(item);
            temp.next = front;
            front.prev = temp;
            front = temp;

        }
        size++;

    }
    void addLast(int item){
        if(size == 0){
            Node temp  = new Node(item);
            front  = temp;
            rear = temp;
        }
        else{
            Node temp  = new Node(item);
            rear.next = temp;
            temp.prev  = rear;
            rear = temp;

        }
        size++;

    }

    int removeFirst() {
        if (size == 0) {
            throw new RuntimeException("Deque is empty");
        }
        int data = front.data;
        front = front.next;
        if (front != null) {
            front.prev = null;
        } else {
            rear = null; 
        }
        size--;
        return data;
    }

    int removeLast() {
        if (size == 0) {
            throw new RuntimeException("Deque is empty");
        }
        int data = rear.data;
        rear = rear.prev;
        if (rear != null) {
            rear.next = null;
        } else {
            front = null; 
        }
        size--;
        return data;
    }
    boolean isEmpty() {
        return size == 0;
    }

    int getSize() {
        return size;
    }

    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        dequeue dq = new dequeue();
        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);
        dq.addLast(25);
        dq.display();

        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());
        dq.display();





        
    }
}