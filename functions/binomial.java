package functions;
import java.util.*;

public class binomial {

    static int factorial(int n){
        int r = 1;
        for(int i=1;i<=n;i++){
            r = r*i;
        }
        return r;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter value of r : ");
        int r = sc.nextInt();
        int result = factorial(n)/(factorial(r)*factorial(n-r));

        System.out.println("binomial coefficient : "+result);
        sc.close();
    }
}
