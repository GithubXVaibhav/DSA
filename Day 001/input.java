import java.util.*;
public class input {
    public static void main(String[] args){
      System.out.println("Enter the desired number");
      Scanner sc = new Scanner(System.in);
    
      int n = sc.nextInt();
      String name = sc.nextLine();
        System.out.print("Dear"+name+" Here is the counting"+" " );
        for (int i=1;i<n;i =i+3){
            System.out.print(i+" ");
        }
        System.out.println("3");
    }

}