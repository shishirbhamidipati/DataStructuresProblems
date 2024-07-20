package ArrayListPractice;
import java.util.List;
import java.util.ArrayList;
public class Problem2 {

    public static boolean isPalindrome(List<Integer> list){
        boolean palindrome= true;
        int size = list.size();
        for(int i =0; i < size/2; i++){
            if(!list.get(i).equals(list.get(size - 1 - i))){
                palindrome = false;
            }
        }
        return palindrome;
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        // 1 2 3 2 1
        boolean result = isPalindrome(list);
        System.out.println(result);

    }
}
