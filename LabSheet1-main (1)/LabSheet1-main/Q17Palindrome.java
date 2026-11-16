import java.util.Scanner;

class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Not a palindrome");
        } else {
            int original = n;
            long reverse = 0;

            while (n > 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n /= 10;
            }

            if (reverse == original)
                System.out.println("Palindrome");
            else
                System.out.println("Not a palindrome");
        }

        sc.close();
    }
}
