package VectorPractice;
import java.util.List;
import java.util.Vector;
public class Problem6 {
    //vector synchronization with multi-threads
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                vector.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                vector.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

      System.out.println(vector);
    }
}

