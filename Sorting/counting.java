package Sorting;

import java.util.Arrays;

public class counting {
    static int[] CountingSort(int arr[]){
        int n = arr.length;
        int[] count = new int[arr.length];
        for(int i=0;i<n;i++){
            count[i] = 0;
        }

        for(int i=0;i<n;i++){
            count[arr[i]] ++;
        }
        int j=0;
        for(int i=0;i<n;i++){
            while(count[i] > 0 && j<n){
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[] = {1,4,1,3,2,4,3,7};
        int[] result = CountingSort(arr);
        System.out.println(Arrays.toString(result));
    }

}
