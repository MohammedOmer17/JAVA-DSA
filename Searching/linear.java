package Searching;


public class linear {
    static int linerSearch(int key,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {5,8,2,9,10,11,13};
        int key = 1;
        int result = linerSearch(key, arr);

        if(result != -1){
            System.out.println(key + " Found at " + result + " Index" );
        }
        else{
            System.out.println(key + " Not Found");
        }
    }
}
