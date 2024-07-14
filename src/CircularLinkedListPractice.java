import java.util.List;
public class CircularLinkedListPractice {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


        class CircularLinkedList {
            Node head = null;
            //1) create list
            void create(int[] arr) {
                if (arr.length == 0){
                    return;
                }

                Node last = null;
                for (int i = 0; i < arr.length; i++) {
                    Node newNode = new Node(arr[i]);
                    if (head == null) {
                        head = newNode;
                        last = newNode;
                    } else {
                        last.next = newNode;
                        last = newNode;
                    }
                }
                last.next = head; // Make the list circular
            }



            //2 insert at beginning
            void insertAtBeginning(int data) {
                Node newNode = new Node(data);
                if (head == null) {
                    head = newNode;
                    head.next = head;
                } else {
                    Node temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    temp.next = newNode;
                    newNode.next = head;
                    head = newNode;
                }
            }

            //3) insert at end
            void insertAtEnd(int data) {
                Node newNode = new Node(data);
                if (head == null) {
                    head = newNode;
                    head.next = head;
                } else {
                    Node temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    temp.next = newNode;
                    newNode.next = head;
                }
            }
            //4) print list
            // Function to print the circular linked list
            void printList() {
                if (head == null){
                    return;
                }

                Node temp = head;
                do {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                } while (temp != head);
                System.out.println();
            }

            //5) delete a node
            int countNodes() {
                if (head == null){
                    return 0;
                }

                int count = 0;
                Node temp = head;
                do {
                    count++;
                    temp = temp.next;
                } while (temp != head);
                return count;
            }

            public static void main(String[] args) {
                CircularLinkedListPractice outerInstance = new CircularLinkedListPractice();
                CircularLinkedList list = outerInstance.new CircularLinkedList();
                int[] arr = {1, 2, 3, 4, 5};
                list.create(arr);
                list.printList();
            }

    }
}