package VectorPractice;
import java.util.List;
import java.util.Vector;
public class Problem2 {
    //remove duplicates

    public static List<Integer> removeDuplicates(List<Integer> vector){
        List<Integer> newVector = new Vector<>();
        for(Integer elem: vector){
            if(!newVector.contains(elem)){
                newVector.add(elem);
            }
        }
        return newVector;
    }
    public static void main(String[] args){
        List<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(4);
        vector.add(3);
        vector.add(3);
        vector.add(9);
        vector.add(2);
        vector.add(3);
        vector.add(5);
        vector.add(4);
        System.out.println(vector);

        List<Integer> newList = removeDuplicates(vector);
        System.out.println(newList);

    }
}
