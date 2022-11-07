package problemSolving;
public class Prob_2_String {
    public static boolean isIsogram(String str){
        for(int i = 0; i <= str.length(); i++){
            if(str.charAt(i) == str.charAt(i+1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Prob_2_String obj = new Prob_2_String();
        obj.isIsogram("Pratik Bhoowmik");
    }
}
