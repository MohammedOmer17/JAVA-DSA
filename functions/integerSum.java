package functions;
import java.util.*;

public class integerSum {

    static int findSum(int num){
        int sum = 0;
        while( num > 0){
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int result = findSum(num);
        System.out.println("Sum of intergers : "+ result);
        sc.close();
    }
}
