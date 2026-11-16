import java.util.Scanner;

class Program25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter operator (& or |): ");
        char op = sc.next().charAt(0);

        boolean x = a != 0;
        boolean y = b != 0;

        if (op == '&')
            System.out.println("Result = " + (x && y));
        else if (op == '|')
            System.out.println("Result = " + (x || y));
        else
            System.out.println("Invalid logical operator");

        sc.close();
    }
}
