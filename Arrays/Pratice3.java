package Arrays;

public class Pratice3 {

    static void Transpose(String arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        String[][] transpose = new String[m][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[j][i] = arr[i][j];
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

        String arr[][] = {{"a11","a12","a13"},
                          {"a21","a22","a23"}};

        Transpose(arr);
    }
}
