package ArrayListPractice;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem7 {


    public static void rotateLeft(List<Integer> list, int k){
        int size = list.size();
        k = k % size;
        for(int i =0; i < k; i++){
            list.add(list.remove(0));
        }
    }
    public static void rotateRight(List<Integer> list, int k) {
        int size = list.size();
        k = k % size; // To handle cases where k > n
        for (int i = 0; i < k; i++) {
            list.add(0, list.remove(size - 1));
        }
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        int i =1;
        while(i < 8){
            list.add(i);
            i++;
        }
        System.out.println(list);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rotate by how many units: ");
        int k = scanner.nextInt();
        String input = "";
        scanner.nextLine();
        while(!input.equals ("l") && !input.equals("r")) {
            System.out.println("left(l) or right(r)");
            input = scanner.nextLine();
        }
        if (input.equals("l")){
            rotateLeft(list, k);
        }
        if(input.equals("r")){
            rotateRight(list, k);
        }
        System.out.println(list);
    }
}
