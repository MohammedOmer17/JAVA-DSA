package Arrays;

public class ArraySearch {

    static boolean arraysearch(int matrix[][],int key){
        int n = matrix.length;
        int m = matrix[0].length;

        int i =0;
        int j = m-1;
        while(i<n && j>=0){
            if(key == matrix[i][j]){
                System.out.println("Key Found at "+"("+i+","+j+")");
                return true;
            }
            if(key < matrix[i][j]){
                j--;
            }
            else if(key > matrix[i][j]){
                i++;
                
            }
        }
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        boolean result = arraysearch(matrix, 37);

        if(result == false){
            System.out.println("Found");
        }

    }
}