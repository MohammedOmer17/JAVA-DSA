package Sorting;

import java.util.Arrays;

public class selection {
    static void  SelectionSort(int arr[]){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int smallestEle = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[smallestEle]){
                    smallestEle = j;

                }
            }
            int temp = arr[smallestEle];
            arr[smallestEle] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[]){
        int arr[] = {6,1,5,3,4,2};
        SelectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
