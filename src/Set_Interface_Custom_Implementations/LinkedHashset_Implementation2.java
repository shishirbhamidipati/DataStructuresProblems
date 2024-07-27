package Set_Interface_Custom_Implementations;
import java.util.LinkedList;
import java.util.Set;
//linkedhashset using linkedList


    public class LinkedHashset_Implementation2<E> {
        private LinkedList<E> elements;

        public LinkedHashset_Implementation2() {
            elements = new LinkedList<>();
        }

        public boolean add(E e) {
            if (contains(e)) {
                return false;
            }
            elements.add(e);
            return true;
        }

        public boolean contains(E e) {
            return elements.contains(e);
        }

        public boolean remove(E e) {
            return elements.remove(e);
        }

        public int size() {
            return elements.size();
        }

        public static void main(String[] args) {
            LinkedHashset_Implementation2<Integer> mySet = new LinkedHashset_Implementation2<>();
            mySet.add(10);
            mySet.add(20);
            mySet.add(10);
            System.out.println("Size: " + mySet.size());
            System.out.println("Contains 20: " + mySet.contains(20));
            mySet.remove(10);
            System.out.println("Size after removal: " + mySet.size());
        }
}
