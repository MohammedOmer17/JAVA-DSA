package functions;

public class factorial {

    static int findfactorial(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f = f*i;
        }
        return f;
    }

    public static void main (String args[]){
        int result = findfactorial(5);
        System.out.println("factorial: "+result);
    }
}