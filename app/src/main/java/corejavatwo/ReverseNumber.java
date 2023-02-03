package corejavatwo;
public class ReverseNumber {
    public static void main(String[] args) {
        //Java program to reverse a number
        int number = 123456789;
        System.out.println("Number before reversing "+number);
        String strNumber = Integer.toString(number);
        String reversed = "";
        for (int i = strNumber.length(); i > 0; i--){
            reversed += strNumber.charAt(i-1);
        }
        int rev = Integer.parseInt(reversed);
        System.out.println("Number after reversing "+rev);
    }
}
