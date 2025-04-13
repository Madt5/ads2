package Asik2;

public class Main {
    public static void main(String[] args) {
        // Testing MyStack
        MyStack<Integer> stack = new MyStack<>();
        System.out.println("Testing MyStack");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack is empty: " + stack.isEmpty());

        // Testing MyQueue
        MyQueue<String> queue = new MyQueue<>();
        System.out.println("\nTesting MyQueue");
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue dequeue: " + queue.dequeue());
        System.out.println("Queue peek: " + queue.peek());
        System.out.println("Queue is empty: " + queue.isEmpty());

        // Testing MyMinHeap
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        System.out.println("\nTesting MyMinHeap");
        heap.insert(9);
        heap.insert(5);
        heap.insert(7);
        heap.insert(1);
        heap.insert(3);
        System.out.println("Heap size: " + heap.size());
        System.out.println("Min element: " + heap.peek());
        System.out.println("Extract min: " + heap.extractMin());
        System.out.println("New min: " + heap.peek());
        System.out.println("Heap is empty: " + heap.isEmpty());
    }
}

