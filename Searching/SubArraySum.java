package Searching;


public class SubArraySum {

    static int SumArray(int arr[]){
        int sum = 0;
        int largestSum = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(sum > largestSum){
                    largestSum = sum;
                }
                sum = 0;
                for(int k=i;k<=j;k++){
                    sum = sum + arr[k];
                }
            }
        }
        return largestSum;
    }

    static int SumArray2(int arr[]){
        int n = arr.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix_sum[] = new int[n];

        prefix_sum[0] = arr[0];
        for(int i=1;i<n;i++){
            prefix_sum[i] = arr[i] + prefix_sum[i-1];
            System.out.println(prefix_sum[i]);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum = i==0 ? prefix_sum[j] : prefix_sum[j] - prefix_sum[i-1];
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
    
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int result = SumArray2(arr);
        System.out.println("Largest Sum : "+ result);
    }
}