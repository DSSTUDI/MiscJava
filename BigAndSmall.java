import java.util.Scanner;

public class BigAndSmall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 999999999;
        int max = 0;

        String temp = scanner.nextLine();
        for (String s : temp.split("\\s")) {
            int current = Integer.parseInt(s);
            if (current > max) {
                max = current;
            }
            if (current < min) {
                min = current;
            }
        }
        scanner.close();
        System.out.println("Min Value: " + min);
        System.out.println("Max value: " + max);


    }
}
