package patterns;

public class HalfPyramid {
    public static void main(String args[]){
        int lines = 4;
        for(int i=1;i<=lines;i++){
            for(int j=1;j<=i;j++){
                System.out.print("\t"+j);
            }
            System.out.println();
        }

    }
}
