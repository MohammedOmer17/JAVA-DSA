package Recursion;

public class Factorial {
    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int facpev = factorial(n-1);
        int fac = n * facpev;
        return fac;
    }

    public static void main(String args[]){
        int n = 4;
        int result = factorial(n);
        System.out.println(result);
    }
}
