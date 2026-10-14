package Recursion;

public class Fibonacci {
    static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        int fib = fibonacci(n-1) + fibonacci(n-2);
        return fib;
    }

    public static void main(String args[]){
        int n = 5;
        
        for(int i=0;i<n;i++){
            int result = fibonacci(i);
            System.out.print(result + " ");
        }
        
    }
}
