package VectorPractice;
import java.util.List;
import java.util.Vector;
public class Problem1 {
    //Reverse a vector

    public static void reverse(List<Integer> vector){
        int size= vector.size();
        for(int i =0; i < size/2; i++){
            int temp = vector.get(i);
            vector.set(i, vector.get(size - 1 - i));
            vector.set(size - 1 - i, temp);
        }
    }
    public static void main(String[] args){
        List<Integer> vector = new Vector<>();
        for(int i = 0; i <= 10; i++){
            vector.add(i);
        }
        System.out.println(vector);
        reverse(vector);
        System.out.println(vector);

    }
}
