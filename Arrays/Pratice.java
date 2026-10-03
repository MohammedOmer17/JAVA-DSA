package Arrays;

public class Pratice {

    static int countNum(int arr[][],int key){
        int m = arr[0].length;
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == key){
                    count ++;
                }
            }
        }
        return count;
    }
    public static void main (String args[]){
        int arr[][] = {{4,7,8},
                       {8,8,7}};
        int key = 7;
        int result = countNum(arr,key);

        System.out.println(result);
    }
}
