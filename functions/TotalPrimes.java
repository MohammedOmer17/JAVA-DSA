package functions;
import java.util.*;

public class TotalPrimes {

    static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
          return true;
    }

    static void primeRange(int n){
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();
        System.out.println("List of Prime Numbers : ");
        primeRange(n);
        sc.close();
    }
}
