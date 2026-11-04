import java.util.*;

public class prattice {

    public static boolean palindrome(int x){
        int newnum = 0;
        int original = Math.abs(x);
        int num = original;

        while(num > 0){
            int rem = num % 10;
            newnum = newnum*10 + rem;
            num = num /10;
    }

    return original == newnum;
}

    public static void main(String args[]){
        int x = -121;
        System.out.println(palindrome(x));
    }
}
