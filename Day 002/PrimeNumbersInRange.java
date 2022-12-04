
import java.util.*;

public class PrimeNumbersInRange {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        System.out.println("these are  the prime numbers between " + low + " and " + high);
        for (int i = low + 1; i < high; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0)
                System.out.println(i);
        }

    }
}