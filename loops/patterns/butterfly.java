package patterns;

public class butterfly {

 static void butterflypattern(int lines){
        for(int i=1;i<=lines;i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=1; j<=2*(lines-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // lower code
        for(int i=lines;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=2*(lines - i);j>0;j--){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
    public static void main (String args[]){
        butterflypattern(4);
}

}
