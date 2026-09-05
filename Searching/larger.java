package Searching;

public class larger {
    
    static int largestNum(int arr[]){
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }


    public static void main(String args[]){

        int arr[] = {100,11,2,35,5,99};
        int result = largestNum(arr);

        System.out.println("Largest Num : " + result );
    }
}
