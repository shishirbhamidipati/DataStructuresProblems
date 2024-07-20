package VectorPractice;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
import java.util.Arrays;
public class Problem5 {
    //vector to array conversion
    public static int[] convertToArray(List<Integer> vector){

        int size = vector.size();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++){
            arr[i] = vector.get(i);
        }
        return arr;
    }
    public static void main(String[] args){
        List<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(6);
        vector.add(5);
        int[] arr = (convertToArray(vector));
        for(int elem: arr){
            System.out.print(elem + " ");
        }
    }
}
