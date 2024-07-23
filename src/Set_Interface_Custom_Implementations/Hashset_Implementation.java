package Set_Interface_Custom_Implementations;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
//implement hashset using hashmap
public class Hashset_Implementation<T> {
    private transient HashMap<T, Object> map;
    private static final Object PRESENT = new Object();

    public Hashset_Implementation(){
        map = new HashMap<>();
    }
    public boolean add(T t){
        return map.put(t, PRESENT) == null;
    }

    public boolean contains(T t){
        return map.containsKey(t);
    }
    public boolean remove(T t){
        return map.remove(t, PRESENT);

    }
    public int size(){
        return map.size();
    }


}
