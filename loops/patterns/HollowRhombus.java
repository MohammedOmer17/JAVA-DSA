package patterns;

public class HollowRhombus {
    static void HollowRhombusPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=n;j++){
                if(j ==1 || j ==n || i==1 || i==n  ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        HollowRhombusPattern(5);
    }
}
