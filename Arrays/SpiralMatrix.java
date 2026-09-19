package Arrays;
import java.util.*;

public class SpiralMatrix {
    static void spiralmatrix(int Matrix[][]){

        int m = Matrix[0].length;
        int n = Matrix.length;

        

        int StartRow=0;
        int EndColumn=m-1 ;
        int EndRow = n-1;
        int StartColumn = 0;

        while(StartRow <= EndRow && StartColumn <= EndColumn){

        for(int k=StartColumn;k<=EndColumn;k++){
            System.out.print(Matrix[StartRow][k] + " ");
        }
        StartRow++;

        
        for(int k=StartRow;k<=EndRow;k++){
            System.out.print(Matrix[k][EndColumn] + " ");
        }
        EndColumn--;

        
        for(int k=EndColumn;k>=StartColumn;k--){
            System.out.print(Matrix[EndRow][k] + " ");        
        }
        EndRow--;

        
        for(int k=EndRow;k>=StartRow;k--){
            System.out.print(Matrix[k][StartColumn] + " ");    
            
        }
        StartColumn++; 

        }  
    }

    public static void main(String args[]){
        int arr[][] = new int[5][5];
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int m = 5;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        spiralmatrix(arr);
        sc.close();
    }
}
