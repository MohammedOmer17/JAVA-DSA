package Sorting;

import java.util.Arrays;

public class Insertion {
    static void InsertionSort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && curr < arr[prev]){
                arr[prev +1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void main(String args[]){
        int arr[] = {6,1,3,2,4,5};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
