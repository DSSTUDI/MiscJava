import java.util.Scanner;
import java.util.Random;

public class Randomiser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int second = s.nextInt();
        int third = s.nextInt();
        int fourth = s.nextInt();

        s.close();
        Random r = new Random();

        for (int c = 0; c < third; c++) {
            for (int i = 0; i < fourth; i++) {
                int num = r.nextInt(second - first) + first;
                System.out.print(num + " ");
            }
            System.out.println("");
        }


    }
}
