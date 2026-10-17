package Recursion.Advance;

public class Pairing {
    public static int FriendsPairing(int Friends){
        if(Friends == 1 || Friends == 2){
            return Friends;
        }

        int single = FriendsPairing(Friends-1);
        int relationship = (Friends-1)*FriendsPairing(Friends-2);

        int totalWays = single + relationship;
        return totalWays;
    }

    public static void main(String args[]){
        int n = 7;
        System.out.println(FriendsPairing(n));
    }
}
