

package DivideAndConquer;

import java.util.Arrays;

class Solution {
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
    public static void main(String args[]){
        int nums[] = {1,2,2,2,4};
        System.out.println(majorityElement1(nums));
    }
}