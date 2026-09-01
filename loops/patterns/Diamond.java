package patterns;

public class Diamond {

    static void diamondPattern(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>0;i--){
            
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            
            for(int j=2*i-1 ; j>0;j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String args[]){
        diamondPattern(4);
    }
}
