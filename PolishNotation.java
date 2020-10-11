import java.util.Scanner;

public class PolishNotation {
    public static void main(String[] args) {

        // Initialises the Scanner and the Stack.
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        // Reads line input and places all elements speparated by spaces into the stack.
        String temp = scanner.nextLine();
        scanner.close();
        for (String s : temp.split("\\s")) {
            stack.push(s);
        }

        while (!stack.empty()) {
            String temp = stack.pop();
            if (temp != "+" && temp != "-" && temp != "x") {
                int num1 = Integer.parseInt(temp);
            }
        }

    }


    // Preforms an operation using the given operator and numbers.
    public int op(String operator, int num1, int num2) {
        switch(operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "x":
                return num1 * num2;
        }
    }
}

class Stack {
    private Array<String> data;

}