package Strings;
import java.util.*;

public class Palindrome {

    static String palindrome(String word){
        StringBuilder copy = new StringBuilder();
        for(int i=word.length()-1;i>=0;i--){
            copy.append(word.charAt(i));
        }

        return copy.toString();
    }

    static boolean palindromeOptimized(String word){

        for(int i=0;i<=word.length()/2;i++){
            if(word.charAt(i) != word.charAt(word.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){

        String word = "racecar";
        String result = palindrome(word);
        boolean result2 = palindromeOptimized(word);

        if(result2 == true){
            System.out.println("Its a Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}

