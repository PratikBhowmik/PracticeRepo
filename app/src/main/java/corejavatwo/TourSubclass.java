package corejavatwo;

public class TourSubclass extends TourGroup {
    public void display(int i) {
        System.out.println(2 * i);
    }

    public static void main(String[] args) {
        TourGroup x = new TourSubclass();
        x.display(1);
        TourSubclass y = new TourSubclass();
        ((TourGroup) y).display(1);
        TourGroup z = new TourSubclass();
        z.display(1);
    }
}
