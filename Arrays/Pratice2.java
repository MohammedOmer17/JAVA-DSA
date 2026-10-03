package Arrays;

public class Pratice2 {
    static int sumOfRow(int arr[][], int row){
        int m = arr[0].length;
        int sum = 0;
        int i = row;

        for(int j=0;j<m;j++){
            sum += arr[i][j];
        }
        return sum;
    }

    public static void main(String args[]){
        int arr[][] = {{1,4,9},
                       {11,4,3},
                       {2,2,3}};
        int row = 1;
        int result = sumOfRow(arr, row);

        System.out.println(result);
    }
}
