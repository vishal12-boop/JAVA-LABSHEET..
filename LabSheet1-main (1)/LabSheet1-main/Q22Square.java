import java.util.Scanner;

class Program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        if (length > 0 && breadth > 0 && length == breadth)
            System.out.println("It is a square");
        else
            System.out.println("It is not a square");

        sc.close();
    }
}
