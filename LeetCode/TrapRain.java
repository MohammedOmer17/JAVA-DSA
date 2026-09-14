package LeetCode;


public class TrapRain {

    static int TrappedWater(int height[]){
        int n = height.length;

        int leftMax[] = new int[n];
        // calculating left max
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // calculating rightmax

        int RightMax[] = new int[n];
        RightMax[n-1] = height[n-1];
        for(int j=n-2;j>=0;j--){
            RightMax[j] = Math.max(height[j], RightMax[j+1]);
        }

        // calculating the minimum height and the trapped water

        int trappedwater = 0;
        for(int i=0;i<n;i++){
            trappedwater += Math.min(leftMax[i],RightMax[i]) - height[i];
        }

        return trappedwater;

    }
    public static void main(String args[]){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
      int result =  TrappedWater(height);
      System.out.println(result);
        
    }
}
