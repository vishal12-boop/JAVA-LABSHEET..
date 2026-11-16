import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        } else {
            System.out.println("Invalid alphabet");
        }

        sc.close();
    }
}
