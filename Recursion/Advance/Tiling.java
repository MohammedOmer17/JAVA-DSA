package Recursion.Advance;

public class Tiling {
     public static int TailingLogic(int n){

        if(n == 1 || n == 0){
            return 1;
        }

        int VerticalWays = TailingLogic(n-1);
        int HorizontalWays = TailingLogic(n-2);
        int TotalWays = VerticalWays + HorizontalWays;
        return TotalWays;
     }  
     
     public static void main(String args[]){
        int n = 4;
        System.out.println(TailingLogic(n));
     }
}