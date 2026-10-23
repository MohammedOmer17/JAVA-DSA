package DivideAndConquer;


public class MergeSortStrings {

    public static void Merge(String arr[], int start, int mid , int end){
        int i = start;
        int j = mid + 1;
        String temp[] = new String[end - start + 1];
        int k = 0;

        while(i <= mid && j <= end){
            if( arr[i].compareTo(arr[j]) <= 0){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid){
          temp[k++] = arr[i++];  
        }

        while(j <= end){
            temp[k++] = arr[j++];
        }

        int x = start;
        for(int p = 0;p < temp.length;p++){
            arr[x] = temp[p];
            x++;
        }
    }
public static void MergeSort(String arr[], int start , int end){
    if(start >= end){
        return ;
    }
    int mid = start + (end - start)/2;
    MergeSort(arr, start, mid);
    MergeSort(arr, mid+1, end);
    Merge(arr, start, mid, end);
}

public static void main(String args[]){
    String str[] = {"mango", "apple","banana","eagle"};
    MergeSort(str, 0, str.length-1);

    System.out.print("{ ");
    for(int i=0;i<str.length;i++){
        System.out.print(str[i] + ", ");
    }
    System.out.print("}");

}
}