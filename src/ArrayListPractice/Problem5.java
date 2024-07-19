package ArrayListPractice;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Problem5 {
    //convert array to arraylist
    public static List<Integer> toArrayList(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        return list;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,6,5};
        List<Integer> list = new ArrayList<>(toArrayList(arr));
        System.out.print(list);
    }
}
