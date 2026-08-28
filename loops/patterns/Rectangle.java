package patterns;

public class Rectangle {
public static void main(String  args[]){

    int lines = 4;
    
    for(int i=1;i<=lines;i++){
        for(int j=1;j<=lines+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}    
}