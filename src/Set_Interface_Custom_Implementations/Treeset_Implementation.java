package Set_Interface_Custom_Implementations;
import java.util.TreeMap;
import java.util.TreeSet;
public class Treeset_Implementation<T> {
    private transient TreeMap<T, Object> map;
    private static final Object PRESENT = new Object();

    public Treeset_Implementation(){
        map = new TreeMap<>();

    }
    public boolean add(T t) {
        return map.put(t, PRESENT) == null;
    }
    public boolean contains(T t){
        return map.containsKey(t);
    }
    public boolean remove(T t){
        return map.remove(t) == PRESENT;
    }
    public int size(){
        return map.size();
    }
    public void clear(){
        map.clear();
    }


}
