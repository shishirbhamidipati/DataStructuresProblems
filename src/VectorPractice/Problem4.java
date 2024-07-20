package VectorPractice;
import java.util.List;
import java.util.Vector;
import java.util.Scanner;
public class Problem4 {
    //Write a program to check if a specific element exists in a Vector and print the result

    public static boolean exists(List<Integer> vector, int k){
        boolean exists= false;
        for(int elem: vector){
            if(elem == k){
                exists = true;
            }
        }
        return exists;
    }
    public static void main(String[] args){
        List<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(35);
        vector.add(50);
        vector.add(3);
        vector.add(350);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value to check: ");
        int k = scanner.nextInt();
        boolean exists = exists(vector, k);
        System.out.println(exists);

    }
}
