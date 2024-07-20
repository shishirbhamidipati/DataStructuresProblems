package StackPractice;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
public class Problem1 {
    //implement stack using arraylist
    private List<Integer> stack;

    public Problem1(){
        stack = new ArrayList<>();

    }
    public void push(int val){
        stack.add(val);
    }
    public int pop(){
        if(stack.isEmpty()){
            return 0;
        }
        return stack.remove(stack.size()-1);

    }
    public int peek(){
        if(stack.isEmpty()){
            return 0;
        }
        return stack.get(stack.size()-1);
    }
    public boolean isEmpty(){
        boolean empty= false;
        if(stack.size() < 0){
            empty = true;
        }
        return empty;
    }

    public int size(){
        return stack.size();
    }

    public static void main(String[] args){
        Problem1 stack = new Problem1();
        stack.push(10);
        stack.push(30);
        stack.push(23);
        System.out.println("size: "+ stack.size());
        System.out.println("top: " + stack.peek());
        System.out.println("is empty: " + stack.isEmpty());
        stack.pop();
        System.out.println("size: "+ stack.size());
        System.out.println("top: " + stack.peek());
    }

}
