package Searching;

public class kadane {

    static int kadaneLogic(int arr[]){

        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];

            if(sum > maxsum){
                maxsum = sum;
            }
            
            if(sum < 0){
             sum = 0;   
            }
        }
        return  maxsum;
    }

    public static void main(String args[]){

        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int result = kadaneLogic(arr);

        System.out.println("Max Sum : " + result);
    }
}
