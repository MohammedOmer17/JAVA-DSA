package DivideAndConquer;

import java.util.Arrays;

public class MajorityCount {

    public static void count(int arr[]) {
        boolean visited[] = new boolean[arr.length];
        int count[] = new int[arr.length];

        int times = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) {
                continue;
            }

            count[i] = 1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count[i]++;
                    visited[j] = true;
                }
            }
        }



        for (int i = 0; i < arr.length; i++) {
            if (count[i] > times) {
                System.out.println(arr[i]);
                return;
            }
        }
    }


    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;

        if(nums.length == 1){
            return nums[0];
        }

        
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
                
            }
            if(count > nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }

    public static int majorityElement1(int nums[]){
        int maxele = nums[0];
        int count=0;
        if(nums.length == 1){
            return nums[0];
        }
        for(int i=1;i<nums.length;i++){
            if(maxele == nums[i]){
                count++;
            }else{
                maxele = nums[i];
                count = 1;
            }

            if(count > nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {2, 4, 1, 3, 5};
        count(arr);
    }
}
