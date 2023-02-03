package corejavatwo;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        //printing the values before swapping
        System.out.println("Value of a before swapping : "+a);
        System.out.println("Value of b before swapping : "+b);
        //After swapping
        int c = a + b;
        a = c - a;
        b = c - a;
        System.out.println("After swapping value of a "+a);
        System.out.println("After swapping value of b "+b);
    }
}
