package dsa.stackexamples;

public class Stack {
    private int[] arr;
    private int tos;
    private int size;

    public Stack(int size) {
        arr = new int[size];
        this.size = size;
        tos = -1;
    }

    //code for push() operation
    public void push(int x) {
        if (tos == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        tos++;
        x = arr[tos];
    }

    public int pop() {
        if (tos == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int x;
        x = arr[tos];
        tos--;
        return x;

    }

    public int peek() {
        if (tos == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int x;
        x = arr[tos];
        return x;
    }
}
