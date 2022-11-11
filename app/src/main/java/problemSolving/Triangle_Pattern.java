package problemSolving;
public class Triangle_Pattern {
    public static void main(String[] args) {
        int m =3;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
