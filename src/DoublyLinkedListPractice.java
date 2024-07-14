public class DoublyLinkedListPractice {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }


        class DoublyLinkedList {
            Node head;


            //1)Insert a Node at the Beginning
            public void insertAtStart(int data) {
                Node newNode = new Node(data);
                if (head == null) {
                    head = newNode;
                } else {
                    newNode.next = head;
                    head.prev = newNode;
                    head = newNode;
                }
            }

            //2)insert a node at the end
            void insertAtEnd(int data) {
                Node newNode = new Node(data);
                if (head == null) {
                    head = newNode;
                } else {
                    Node temp = head;
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                    temp.next = newNode;
                    newNode.prev = temp;
                }
            }
            //3) Print the doubly-linked list
            public void printList() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }

            //4) Count nodes
            int countNodes() {
                int count = 0;
                Node temp = head;
                while (temp != null) {
                    count++;
                    temp = temp.next;
                }
                return count;
            }
            //5) Insert a node given a position
            void insertAtPosition(int data, int position) {
                Node newNode = new Node(data);
                if (position == 0) {
                    insertAtStart(data);
                    return;
                }
                Node temp = head;
                for (int i = 0; i < position - 1 && temp != null; i++) {
                    temp = temp.next;
                }
                if (temp == null) {
                    return;
                }
                newNode.next = temp.next;
                newNode.prev = temp;
                if (temp.next != null) {
                    temp.next.prev = newNode;
                }
                temp.next = newNode;
            }

            //6) rotate node
            void rotate(int N) {
                if (N == 0) {
                    return;
                }
                Node current = head;
                int count = 1;
                while (count < N && current != null) {
                    current = current.next;
                    count++;
                }
                if (current == null) {
                    return;
                }
                Node nNode = current;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = head;
                head.prev = current;
                head = nNode.next;
                head.prev = null;
                nNode.next = null;
            }
        }
    }
}
