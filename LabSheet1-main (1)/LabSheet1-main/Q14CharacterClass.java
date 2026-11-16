import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isDigit(ch))
            System.out.println("Digit");
        else if (Character.isUpperCase(ch))
            System.out.println("Uppercase letter");
        else if (Character.isLowerCase(ch))
            System.out.println("Lowercase letter");
        else
            System.out.println("Special character");

        sc.close();
    }
}
