package functions;
import java.util.*;

public class prime {

    static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(i % n == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        boolean result = isPrime(n);
        if(result){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Not a prime");
        }
        sc.close();
    }
    
}
