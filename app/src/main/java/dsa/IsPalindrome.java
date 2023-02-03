package dsa;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class IsPalindrome {
    public String isPalindrome(String s) {
        String str = " ";
        //first will return true if nothing is passed by user
        if (s.length() == 0){
            return "true";
        }
//else will do some operation for checking it's a pallindrome or not but it will ignore all the casing and spaces and non alpha numeric characters
        for (int i = s.length(); i > 0; i--){
            str = str + s.charAt(i);
        }
        //check if the result string is equal to original string
        if(str.equalsIgnoreCase(s)){
            return "true";
        }
        return "false";
    }
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        String result = new IsPalindrome().isPalindrome(line);
        System.out.print(result);
    }
}
