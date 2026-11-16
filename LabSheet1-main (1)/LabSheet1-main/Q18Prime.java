import java.util.Scanner;

class Program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean prime = n >= 2;

        for (int i = 2; i <= n / i && prime; i++) {
            if (n % i == 0)
                prime = false;
        }

        if (prime)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");

        sc.close();
    }
}
