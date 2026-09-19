package Arrays;

public class DiagonalSum {

    static void diagonalSum(int matrix[][]){

        int n = matrix[0].length;
        int m = matrix.length;

        if( n != m){
            System.out.println("Enter a valid nxn Matrix");
        }

        else{
            int PrimaryDiagonalSum = 0;
            int SecondaryDiagonalSum = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(i == j){
                        PrimaryDiagonalSum = PrimaryDiagonalSum + matrix[i][j];
                    }
                    if( i+j == n-1){
                        SecondaryDiagonalSum = SecondaryDiagonalSum + matrix[i][j];
                    }
                }
            }
            int DiagonalSum = PrimaryDiagonalSum+SecondaryDiagonalSum;
            System.out.println(DiagonalSum);
        }
    }
    
    static void OptimizedDiagonalSum(int matrix[][]){

        int n = matrix.length;
        int sum = 0;
        for(int i=0;i<n;i++){
        
            sum += matrix[i][i];

            if( i != n-i-1){
            sum += matrix[i][n-i-1];    
            }
            
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16}};

        // diagonalSum(matrix);
        OptimizedDiagonalSum(matrix);
    }
}
