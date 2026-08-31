package functions;
import java.util.*;

public class palindrome {

    static int Numlength(int n){
        int count = 0;
        while(n > 0){
            n = n/10;
            count ++;
        }
        return count;
    }


    static int reverse(int num){
        int newnum = 0;
        while(num > 0){
            int rem = num%10;
            newnum = newnum*10 + rem;
            num = num/10;
        }
        return newnum;
    }

    static int ReverseNum(int num){
        int power = Numlength(num);
        int newnum = 0;
        while(num > 0){
            int rem = num % 10;
            newnum = newnum + rem*(int)Math.pow(10,power-1);
            power--;
            num = num/10;
        }
        return newnum;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        // int newnum = ReverseNum(num);
        int newnum = reverse(num);

        if(num == newnum){
            System.out.println(num +" is a palindrome.");
        }
        else{
            System.out.println(num + " Not a palindrome");
        }
        sc.close();
    }
}
