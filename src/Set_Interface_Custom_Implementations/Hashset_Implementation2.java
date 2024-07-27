package Set_Interface_Custom_Implementations;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

//hashset implementation on arrays
public class Hashset_Implementation2<E> {
    private static final int CAPACITY = 16;
    private Object[] elements;
    private int size;

    public Hashset_Implementation2(){
        elements = new Object[CAPACITY];
        size =0;

    }
    public boolean add(E e){
        if(contains(e)){
            return false;
        }
        ensureCapacity();
        elements[size++] =e;
        return true;
    }

    public boolean contains(E e){
       for(int i=0; i < size; i++){
           if(elements[i] != null && elements[i].equals(e)){
               return true;
           }

       }
       return false;
    }
    public boolean remove(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i] != null && elements[i].equals(e)) {
                elements[i] = null;
                compactArray();
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }

    private void compactArray() {
        int newIndex = 0;
        for (int i = 0; i < size; i++) {
            if (elements[i] != null) {
                elements[newIndex++] = elements[i];
            }
        }
        size = newIndex;
    }

    public static void main(String[] args) {
        Hashset_Implementation2<Integer> mySet = new Hashset_Implementation2<>();
        mySet.add(10);
        mySet.add(20);
        mySet.add(10);
        System.out.println("Size: " + mySet.size());
        System.out.println("Contains 20: " + mySet.contains(20));
        mySet.remove(10);
        System.out.println("Size after removal: " + mySet.size());
    }
}
