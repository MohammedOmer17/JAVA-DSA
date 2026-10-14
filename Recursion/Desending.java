package Recursion;

public class Desending {
    static void desending(int n){
        if(n == 1){
            System.out.print(n);
            return ;
        }
        else{
            System.out.print(n + " ");
            
            desending(n-1);
        }
    }
    public static void main(String args[]){
        desending(10);
    }
}
