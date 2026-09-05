package Searching;

public class binary {

    static int binarySearch(int arr[],int key){
        int start = 0;
        int end = arr.length-1;

        

        while(start <= end){

        int mid = start + (end - start)/2;


            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid+1;
            }
            else{
               end = mid;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key = 8;

        int result = binarySearch(arr, key);

        if(result != -1){
            System.out.println(key + " Found at " + result +" Index");
        }
        else{
            System.out.println(key + " Not found");
        }

    }
}
