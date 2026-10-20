package DivideAndConquer;

public class MergeSort {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void Merge(int arr[], int start, int mid, int end){
        int i = start;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[end - start + 1];

        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= end){
            temp[k++] = arr[j++];
        }

        int l = start;
        for(k=0;k<temp.length;k++){
            arr[l] = temp[k];
            l++;
        }
    }


    public static void Mergesort(int arr[], int start, int end){
        if(start >= end){
            return ;
        }
            int mid = start + (end - start)/2;
            Mergesort(arr, start, mid); //left side
            Mergesort(arr, mid + 1, end);//right side

            Merge(arr, start, mid, end);
    }


    public static void main(String args[]){
        int arr[] = {1,5,3,2};
        Mergesort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
