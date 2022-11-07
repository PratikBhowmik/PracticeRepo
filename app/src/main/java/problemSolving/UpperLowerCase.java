package problemSolving;

public class UpperLowerCase {
    public int countUpper(String str) {
        int noOfupperLetter = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                noOfupperLetter++;
            }
        }
        return noOfupperLetter;
    }


    public int countLower(String s) {
        int noOfLowerLetter = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                noOfLowerLetter++;
            }
        }
        return noOfLowerLetter;
    }

    public static void main(String[] args) {
        UpperLowerCase ul = new UpperLowerCase();
        System.out.println(ul.countUpper("Pratik Bhowmik is an Engineer"));
        System.out.println(ul.countLower("Pratik Bhowmik is an Engineer"));
    }
}
