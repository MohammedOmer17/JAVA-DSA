package patterns;

public class rightTriangle {
    public static void main(String args[]) {
        int lines = 4;

        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


        //   mine logic
        // int rows = 4;
        // int columns = 4;

        // for(int i=1; i<=rows ; i++){
        //     for(int j=1; j<=columns; j++){
        //         if(j <= i){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }