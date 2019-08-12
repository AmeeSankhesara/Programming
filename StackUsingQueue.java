/*Program to implement stack using Queue
Time complexity for pop - O(1)
Time complexity for push - O(N)
 */
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    /** Push element x onto stack. */
    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer> q = q1;
        q1=q2;
        q2=q;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int x= q1.remove();
        return x;
    }

    /** Get the top element. */
    public int top() {
        return q1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(5);
        System.out.println("Top : "+stack.top());
        stack.push(4);
        System.out.println("Top : "+stack.top());
        stack.push(3);
        System.out.println("Top : "+stack.top());
        stack.push(2);
        System.out.println("Top : "+stack.top());
        stack.push(1);
        System.out.println("Top : "+stack.top());
        System.out.println("Pop : "+stack.pop());
        System.out.println("Top : "+stack.top());
        System.out.println("Pop : "+stack.pop());
        System.out.println("Top : "+stack.top());
    }

}
