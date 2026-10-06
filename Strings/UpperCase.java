package Strings;

public class UpperCase {

    static String logic(String sentence){

        StringBuilder str = new StringBuilder();

        char ch = Character.toUpperCase(sentence.charAt(0));
        
        str.append(ch);
        

        for(int i=1;i<sentence.length();i++){

            if(sentence.charAt(i) == ' ' && i < sentence.length()-1){
                str.append(sentence.charAt(i));
                i++;
                str.append(Character.toUpperCase(sentence.charAt(i)));
            }
            else{
                str.append(sentence.charAt(i));
            }
        }
        return str.toString();
    }
    public static void main(String args[]){

        String sentence = "hello, my name is omer";
        String result  = logic(sentence);

        System.out.println(result);
    }
}
