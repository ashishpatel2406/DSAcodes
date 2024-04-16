package dsa.stackexamples;

public class UseStack {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        int x = 10;

        for(int i=1;i<=5;i++)
        {
            s.push(x);
            System.out.println("pushed:"+x);
            x = x+10;
        }

        System.out.println("Top element of the Stack is"+s.peek());

        for(int i=1;i<=5;i++)
        {
            s.pop();
            System.out.println("popped:"+x);
        }
    }
}