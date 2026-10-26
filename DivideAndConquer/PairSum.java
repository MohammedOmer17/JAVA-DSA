package DivideAndConquer;

public class PairSum {
    public static void pairsum(int arr[],int target,int i,int j){
        int largestSum = arr[i]+arr[j];

        if(i >= j){
            return ;
        }

        if(target == largestSum){
            System.out.println("{ " + i + " , " + j + " }");
            return ;
        }
        if(target < largestSum){
            pairsum(arr, target, i, j-1);
        }
        else{
            pairsum(arr, target, i+1, j);
        }
        return;
    }

    public static void main(String args[]){
        int target = 22;
        int arr[] = {2,7,11,15};
        pairsum(arr, target, 0, arr.length-1);
    }
}
