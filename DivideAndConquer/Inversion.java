package DivideAndConquer;

public class Inversion {
    public static int InversionLogic(int arr[]){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static int mergeConcept(int arr[], int start , int mid, int end){

        int i = start;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[end - start + 1];
        int Invcount = 0;

        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++]; 
            }else{
                Invcount += (mid-i+1);
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= end){
            temp[k++] = arr[j++];
        }

        int l = start;
        for(int p=0;p<temp.length;p++){
            arr[start] = temp[p];
            start++;
        }
        return Invcount;
    }

    public static int recersiveCount(int arr[], int start, int end){
        if(start >= end){
            return 0;
        }

        int mid = start + (end - start)/2;
        int leftCount = recersiveCount(arr, start, mid);
        int rightcount = recersiveCount(arr, mid +1, end);

        int invcount = mergeConcept(arr, start, mid, end);
        return leftCount + rightcount+ invcount;
    }

    public static void main(String args[]){
        int arr[] = {5, 4, 3, 2, 1};
        System.out.println(recersiveCount(arr, 0, arr.length-1));
    }
}
