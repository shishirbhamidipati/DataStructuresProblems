package StackPractice;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Problem2 {
    //implement stack using two queues
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public Problem2(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    public void push(int val){
        q2.add(val);
        while (!q1.isEmpty()) {
            q2.add(q2.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    public int pop(){
        return q1.remove();
    }

    public int peek(){
        return q1.peek();
    }
    public boolean isEmpty(){
        return q1.size() < 0;
    }

}
