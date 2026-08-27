package patterns;

public class CharPattern {
    public static void main(String args[]){
        int lines  = 4;
        char alp = 'A';
        for(int i=1;i<=lines;i++){
            for(int j=1;j<=i;j++){
                System.out.print(alp);
                alp++;
            }
            System.out.println();
        }
    }
}
