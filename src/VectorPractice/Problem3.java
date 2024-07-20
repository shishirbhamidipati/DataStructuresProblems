package VectorPractice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
public class Problem3 {
    //rotate a vector to the left/right
    public static void rotateLeft(List<Integer> vector, int k){
        int size = vector.size();
        k = k % size;
        for(int i =0; i < k; i++){
            vector.add(vector.remove(0));
        }
    }
    public static void rotateRight(List<Integer> vector, int k) {
        int size = vector.size();
        k = k % size;
        for (int i = 0; i < k; i++) {
            vector.add(0, vector.remove(size - 1));
        }
    }
    public static void main(String[] args){
        List<Integer> list = new Vector<>();

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
