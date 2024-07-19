package ArrayListPractice;

import com.sun.jdi.IntegerValue;

import java.util.List;
import java.util.ArrayList;

public class Problem3 {

    //Remove duplicates
    public static List<Integer> removeDuplicates(List<Integer> list){
        List<Integer> newList = new ArrayList<>();
        for(Integer elem: list){
            if(!newList.contains(elem)){
                newList.add(elem);
            }
        }
        return newList;

    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(3);
        list.add(9);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        System.out.println(list);

        List<Integer> newList = removeDuplicates(list);
        System.out.println(newList);
    }
}
