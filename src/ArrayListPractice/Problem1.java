
package ArrayListPractice;
import java.util.List;
import java.util.ArrayList;

public class Problem1 {
    //Arraylist implementation in list interface??
    //stack, arraylist, vector implementations
    //Also think about Time and space complexity when you are solving problems

    //Reverse an ArrayList

    public static void reverse(List<Integer> list){
        int size = list.size();
        for(int i =0; i < size/2; i++){
            Integer temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }
}
