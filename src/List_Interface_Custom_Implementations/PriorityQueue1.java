package List_Interface_Custom_Implementations;
//singly linkedlist
import java.util.LinkedList;
import java.util.List;
public class PriorityQueue1<T extends Comparable<T>> {
    private class Node{
        T data;
        Node next;

        Node(T data){
            this.data= data;
            this.next = null;
        }
    }
    private Node head;
    private int size;

    public PriorityQueue1(){
        head =null;
        size = 0;

    }
    public void insert(T element){
        Node newNode = new Node(element);
        if(head == null || head.data.compareTo(element) > 0){
            newNode.next = head;
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null && current.next.data.compareTo(element) <= 0){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;

    }

    public T remove(){
        T data= head.data;
        head = head.next;
        size--;
        return data;
    }

    public T peek(){
        return head.data;
    }

    public boolean isEmpty(){
        return head==null;
    }
    public int size(){
        return size;
    }
}
