package JavaCalculator;
import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args) {
        System.out.println("This is an newbie's take on a java calculator. After you input each item, press enter,and then continue the next one.")
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter a number: ");

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter a second number: ");

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter an operator: ");

        input1.close();
        input2.close();
        input3.close();

        int firstNum = Integer.parseInt(input1.nextLine());
        int secondNum = Integer.parseInt(input2.nextLine());
        String operatorPartOne = input3.nextLine();
        char operator=operatorPartOne.charAt(0);
        
        if (operator == '+') {
            System.out.println(firstNum + secondNum);
        }
        else if (operator == '-') {
            System.out.println(firstNum - secondNum);
        }
        else if (operator == '*') {
            System.out.println(firstNum * secondNum);
        }
        else if (operator == '/') {
            System.out.println(firstNum / secondNum);
        } else {
            System.out.println("Invalid operator. Use +, -, *, or /.");
        }
    }
}
