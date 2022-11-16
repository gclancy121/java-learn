package JavaNameInputter;
import java.util.Scanner;


public class JavaNameInputter {
    public static void main(String[] args) {
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Enter Username");

        String userName = nameInput.nextLine();
        System.out.println("User's name is: " + userName);
    }
}
