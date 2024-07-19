package ArrayListPractice;
import java.util.List;
import java.util.ArrayList;

public class Problem6 {
    //Merge Two ArrayLists
    public static void merge(List<Integer> list1, List<Integer> list2) {
        for(int i = 0; i < list2.size(); i++){
            list1.add(list2.get(i));
        }

    }
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        List<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(9);
        list2.add(11);
        merge(list1, list2);
        System.out.println("list 1: " + list1);
        System.out.println("list 2: " + list2);
        System.out.println("merged list: " + list1);
    }
}
