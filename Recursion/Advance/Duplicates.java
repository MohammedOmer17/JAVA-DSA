package Recursion.Advance;

public class Duplicates {
    public static void DuplicatesLogic(String str){
        boolean count[] = new boolean[25];

        StringBuilder newstr = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i) - 'a'] == true){
                continue;
            }else{
                count[str.charAt(i) - 'a'] = true;
                newstr.append(str.charAt(i));
            }
        }
        System.out.println(newstr);
    }

    public static void RecursiveDuplicates(String str, StringBuilder newstr, int i, boolean count[]){
        if(i == str.length()){
            System.out.println(newstr);
            return;
        }
        if(count[str.charAt(i) - 'a'] == true){
            RecursiveDuplicates(str, newstr, i+1, count);
        }else{
            count[str.charAt(i) - 'a'] = true;
            newstr.append(str.charAt(i));
            RecursiveDuplicates(str, newstr, i+1, count);
        }
    }
    public static void main(String args[]){
        String str = "appnnacollege";
        StringBuilder newstr = new StringBuilder();
        boolean count[] = new boolean[26];
        // DuplicatesLogic(str);
        RecursiveDuplicates(str, newstr, 0, count);
    }
}
