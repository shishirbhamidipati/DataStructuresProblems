package ArrayListPractice;
import java.sql.Array;
import java.util.List;
import java.util.ArrayList;
public class Problem8 {
    //count the frequency of each element in an ArrayList.
    public static List<String> frequency(List<String> list){
        List<String> frequencyList = new ArrayList<>();
        for (String elem : list) {
            boolean found = false;
            for (int i = 0; i < frequencyList.size(); i += 2) {
                if (frequencyList.get(i).equals(elem)) {
                    int count = Integer.parseInt(frequencyList.get(i + 1));
                    frequencyList.set(i + 1, Integer.toString(count + 1));
                    found = true;
                    break;
                }
            }
            if (!found) {
                frequencyList.add(elem);
                frequencyList.add("1");
            }
        }
        return frequencyList;
    }
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("one");
        list.add("five");
        list.add("five");

        List<String> frequency = new ArrayList<>(frequency(list));
        System.out.println(frequency);

    }

}
