package Sorting;
import java.util.*;

public class bubble {

    static int[] bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j+1] < arr[j]){
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;    
                }
            }
        }
        return arr;
    }

    public static void main (String args[]){
        int arr[] = {5,1,4,2,6,3};
        int[] result = bubbleSort(arr);
        System.out.println(Arrays.toString(result));
    }
    
}