package lesson20231031;

public class CustomQueue {

    private int[] data;
    private int head;
    private int tail;

    public CustomQueue(int capacity){
        data = new int[capacity];
        head = 0;
        tail = 0;
    }

    public void enqueue(int element){ // TODO
        if (tail >= head && tail < data.length) {
            data[tail++] = element;
        } else if (tail == data.length) {
            tail = 0;
            data[tail++] = element;
        } else {
            throw new RuntimeException("no more place");
        }
    }

    public int dequeue(){ // TODO
        if (head < data.length && tail != head) {
            return data[head++];
        } else if (head == data.length && tail != head) {
            head = 0;
            return data[head++];
        } else {
            throw new RuntimeException("No more elements");
        }
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public int size() { // TODO
        return head >= tail ? head - tail : tail - head;
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }


}
