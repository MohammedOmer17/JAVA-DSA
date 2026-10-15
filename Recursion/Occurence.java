package Recursion;

public class Occurence {
    static int FirstOccurence(int arr[], int key, int i){
        if(arr[i] == key){
            return i;
        }
        if(i == arr.length-1){
            return -1;
        }
        return FirstOccurence(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(FirstOccurence(arr, 1, 0));
    }
}
