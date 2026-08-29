package functions;
import java.util.Scanner;

public class binTodec {
    static int converter(int n){
        int result = 0;
        int power = 1;
        while (n > 0){
            int rem = n % 10 ;

            if(rem == 0 || rem == 1){

                
            result = result + rem*power;
            power = power*2;
            n = n/10;
            }
            else{
                System.out.println("Enter a valid Binary Number");
                return -1;
            }
        }
        return result;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary Value : ");
        int bitsValue = sc.nextInt();
        int result = converter(bitsValue);
        if(result != -1){
        System.out.print("Decimal Value : " + result);            
        }

        
        sc.close();
    }
}
