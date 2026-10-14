package Strings;
import java.util.*;

public class Anagram {

    static int anagram(String one, String two){
        if(one.length() != two.length()){
            return -1;
        }
        else{
            char[] oneChars = one.toCharArray();
            char[] twoChars = two.toCharArray();
            
            Arrays.sort(oneChars);
            Arrays.sort(twoChars);

            if(Arrays.equals(oneChars,twoChars)){
                return 1;
            }
        }
        return -1;
    }

    static int anagram2(String one,String two){
        return 1;
    }
    public static void main(String args[]){

        String one = "care";
        String two = "race";

        int result = anagram2(one, two);
        System.out.println(result);
    }

}
