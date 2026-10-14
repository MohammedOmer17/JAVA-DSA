package Recursion;

public class SumOfN {
    static int sumOfn(int n){
        if(n == 1){
            return 1;
        }
        int prevSum = sumOfn(n-1);
        int sum = n + prevSum;
        return sum;
    }
    public static void main(String args[]){
        int n = 10;
        int result = sumOfn(n);
        System.out.println(result);

    }
}
