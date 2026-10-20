package Recursion.Advance;

public class BinaryString {

    public static void binarysearch(int n, int Lastidx, String str){
        if(n == 0){
            System.out.println(str);
            return ;
        }

        binarysearch(n-1, 0, str+"0");

        if(Lastidx == 0){
            binarysearch(n-1, 1, str+"1");
        }
    }

    public static void main(String args[]){
        binarysearch(3, 0, "");
    }
    
}