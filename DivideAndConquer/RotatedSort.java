package DivideAndConquer;

public class RotatedSort {
    public static void rotatedArray(int arr[],int start , int end, int key){
        int mid = start + (end - start)/2;
        if(key == arr[mid]){
            System.out.println("Index : " + mid);
            return;
        }

        //left cases
        if(arr[start] <= arr[mid]){
           if(key >= arr[start] && key <= arr[mid]){
            rotatedArray(arr, start, mid-1, key);
           }
           else{
            rotatedArray(arr, mid+1, end, key);
           }
        }

        //right cases
        else{
            if(key >= arr[mid] && key <= arr[end]){
                rotatedArray(arr, mid + 1, end, key);
            }
            else{
                rotatedArray(arr, start, mid -1, key);
            }
        }
    }
    public static void main(String args[]){

        int arr[] = {4,5,6,7,0,1,2};
        rotatedArray(arr, 0, arr.length-1, 2);
    }
}
