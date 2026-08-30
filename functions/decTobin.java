package functions;

public class decTobin {

    static int binConveter(int n){
        if( n == 0){
            return -1;
        }
        int decimal = 0;
        int pow = 1;
        while(n > 0){
        int rem = n % 2;
        decimal = decimal + rem*pow;
        pow = pow*10;
        n = n/2;     
        }
        return decimal;
    }
    public static void main(String args[]){
        int result = binConveter(2);
        if (result != -1){
            System.out.println("Binary Number : " + result);

        }
    }
}