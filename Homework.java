import java.util.*;

public class Homework{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b ;
         System.out.println(sum);
        int diff = b-a ;
        System.out.println(diff);
        int mul = a*b ;
        System.out.println(mul);
        int x = a*b;
        if (x%2==0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
        System.out.println(sc);
    }

}
