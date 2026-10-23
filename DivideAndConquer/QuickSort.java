package DivideAndConquer;

public class QuickSort {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int Partition(int arr[], int start, int end){

        int pivot = end;
        int i = start-1;
        int j = start;

        while( j <= end - 1){
            if(arr[j] < arr[pivot] ){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;

        return i;
    }

    public static void quickSort(int arr[], int start , int end){

        if(start >= end){
            return ;
        }
        int pivot = Partition(arr, start, end);
        quickSort(arr, start, pivot - 1); //left side
        quickSort(arr, pivot + 1, end);

    }
    public static void main(String args[]){
        int arr[] = {5,1,3,4,2};
        Partition(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}