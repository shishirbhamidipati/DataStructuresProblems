package List_Interface_Custom_Implementations;
import java.util.List;
import java.util.LinkedList;

public class Stack1<T> {
    private class Node{
        T data;
        Node next;

        Node(T data){
            this.data =data;
            this.next = null;

        }

    }
    private Node top;
    private int size;

    public Stack1(){
        top =null;
        size = 0;

    }
    public void push(T element){
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
        size++;

    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size ==0;

    }
    public T pop(){
        if(isEmpty()){

        }
        T data= top.data;
        top = top.next;
        size--;
        return data;
    }
    public T peek(){
        return top.data;
    }

    public static void main(String[] args){

    }

}
