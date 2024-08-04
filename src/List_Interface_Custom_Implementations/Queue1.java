package List_Interface_Custom_Implementations;

import java.util.LinkedList;
import java.util.List;


public class Queue1<T> {
private class Node{
 T data;
 Node next;
 Node prev;
 Node(T data){
     this.data= data;
     this.next= null;
     this.prev = null;

 }

}
private Node head;
private Node tail;
private int size;

public Queue1(){
    head = null;
    tail = null;
    size=  0;

}
public void enqueue(T elem){
    Node newNode = new Node(elem);
    if(tail ==null){
        head = tail = newNode;

    }else{
        tail.next =newNode;
        newNode.prev = null;
        tail = newNode;

    }
    size++;

}
public T dequeue(){
    T data = head.data;
    head= head.next;
    if(head ==null){
        tail =null;
    }
    else{
        head.prev =null;
    }
    size--;
    return data;
}
public T peek(){
    return head.data;
}

public int size(){
    return size;
}
public boolean isEmpty(){
    return size==0;
}

}
