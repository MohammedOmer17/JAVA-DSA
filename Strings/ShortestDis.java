package Strings;

public class ShortestDis {

    static float shortestDistance(String path){
        int x=0;
        int y=0;

        for(int i=0;i<path.length();i++){
            if(path.charAt(i) == 'N'){
                y++;
            }
            if(path.charAt(i) == 'S'){
                y--;
            }
            if(path.charAt(i) == 'E'){
                x++;
            }
            if(path.charAt(i) == 'W'){
                x--;
            }


        }
            int x1 = x*x;
            int y1 = y*y;        
            return (float)Math.sqrt(x1 + y1);        
    }
    public static void main(String args[]){

        String path = "WNEENESENNN";
        System.out.println(shortestDistance(path));
    }
    
}