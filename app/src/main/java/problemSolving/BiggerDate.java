package problemSolving;

public class BiggerDate {
    protected static int bigDate(int date1, int date2) {
        int big = 0;

        if(date1>date2){
            big=date1;
        } else if (date1<date2) {
            big=date2;
        }
        return big;
    }

    public static void main(String[] args) {

        System.out.println(bigDate(12,20));
    }
}
