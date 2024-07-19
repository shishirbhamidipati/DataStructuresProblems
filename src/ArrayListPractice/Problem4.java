package ArrayListPractice;
import java.util.List;
import java.util.ArrayList;
public class Problem4 {
    //Finding the Max/Min Element:

    public static int max(List<Integer>list){

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }

    public static int min(List<Integer>list){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < min){
                min = list.get(i);
            }
        }
        return min;
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);

        System.out.println(list);
        int min = min(list);
        int max = max(list);
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
