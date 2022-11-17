package JavaCalculator2;
import java.util.Scanner;

public class JavaCalculator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float input1;
        float input2;
        String input3;

        boolean inputValid = false;
        do {
            System.out.println("Enter a number: ");
            while (!scan.hasNextFloat()) {
                System.out.println("Invalid input. Enter a number.");
                scan.next();
            }
            input1 = scan.nextFloat();
            inputValid = true;
        } while (inputValid = false);
        do {
            inputValid = false;
            System.out.println("Enter another number: ");
            while(!scan.hasNextFloat()) {
                System.out.println("Invalid input. Enter a second number.");
                scan.next();
            }
            input2 = scan.nextFloat();
            inputValid = true;
        } while(inputValid = false);
        System.out.println("Enter an operator. Must be +, -, *, or /.");
        input3 = scan.next();

        if (input3.contains("+")) {
            System.out.println(input1 + input2);
        } else if (input3.contains("-")) {
            System.out.println(input1 - input2);
        } else if (input3.contains("*")) {
            System.out.println(input1 * input2);
        } else if (input3.contains("/")) {
            System.out.println(input1 / input2);
        } else {
            System.out.println("Invalid operator. Choose either +, -, *, or /.");
        }
        scan.close();
    }
}
