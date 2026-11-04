package Backtracking;

public class permutations {
    
    public static void permutationsLogic(String str,String ans){

        if(str.length() == 0){
            System.out.println(ans);
            return ;
        }

        for(int i=0;i<str.length();i++){
            String newstr = str.substring(0,i)+str.substring(i+1);
            
            permutationsLogic(newstr, ans+str.charAt(i));
        }
    }

    public static void main(String args[]){
        String str = "abc";
        permutationsLogic(str, "");
    }
}