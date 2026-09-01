package patterns;

public class floyds {
    public static void main(String args[]){
        int lines = 5;
        int num = 1;
        for(int i=1; i<=lines; i++){
            for(int j=1; j<=i;j++){
                System.out.print(num);
                System.out.print("\t");
                num++;
            }
            System.out.println();
        }
    }
}
