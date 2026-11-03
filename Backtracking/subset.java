package Backtracking;

public class subset {

    public static void subsets(String str, String ans, int i){

        if( i == str.length()){
            if(ans.length()==0){
                System.out.println("Null");
                return ;
            }
            else{
                System.out.println(ans);
                return ;
            }
        }

        // for accepting 
        subsets(str, ans+str.charAt(i), i+1);
        // for not accepting
        subsets(str, ans, i+1);
    }

    public static void main(String args[]){
        String str = "abc";
        subsets(str, "", 0);
    }
}