import java.util.*;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int On1 = n1;
        int On2 = n2;
        // For HCF
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;

        }
        int HCF = n2;
        System.out.println("HCF" + " " + HCF);
        // For LCM
        int LCM = (On1 * On2) / HCF;
        System.out.println("LCM" + " " + LCM);

    }
}
