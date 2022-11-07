package problemSolving;

public class EvenOdd {

    public static String EvenOdd(int number){
        if(number%2 == 0){
            return "true";
        }
        else{
            return "false";
        }
    }
    public static void main(String[] args) {
        System.out.println(EvenOdd(10));
    }
}
