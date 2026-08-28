package patterns;

public class InvertedPyramid {
    public static void main(String args[]){
        int lines = 4;
        for(int i=0;i<lines;i++){
            for(int j=1;j<=lines;j++){
                if(j <= lines-i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
