package patterns;

public class InvertedRightTriangle {
    public static void main(String args[]){

        int lines = 10;

        for(int i=lines; i>0; i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// another version
// for(int i = 1; i <= lines; i++) {
//     for(int j = 1; j <= lines - i + 1; j++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }