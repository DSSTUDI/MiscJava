import java.util.Scanner;
import java.lang.Math;

public class submission2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double a = 1;
        double dif = 100;

        while (dif >= 0.0000001) {
            double temp = a;
            a = (a + (n/a)) / 2;
            dif = Math.abs(((a - temp)/temp));
            System.out.println(a);
        }

        int ans = (int) a;

        System.out.println(ans);

    }
}
