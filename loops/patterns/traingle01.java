package patterns;

public class traingle01 {
    public static void main(String args[]){
        int lines = 6;

        for(int i=1;i<=lines;i++){
            for(int j=1;j<=i;j++){
                if((i + j) % 2 == 0){
                    System.out.print("1");
                    System.out.print("\t");
                }
                else{
                    System.out.print("0");
                    System.out.print("\t");                  
                }
            }
            System.out.println();
        }
    }
}
