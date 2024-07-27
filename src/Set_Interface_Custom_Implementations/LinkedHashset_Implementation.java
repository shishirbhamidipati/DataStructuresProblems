package Set_Interface_Custom_Implementations;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashset_Implementation<T> {
    private transient LinkedHashMap<T, Object> map;
    private static final Object PRESENT = new Object();
    public LinkedHashset_Implementation(){
        map =new LinkedHashMap<>();
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
