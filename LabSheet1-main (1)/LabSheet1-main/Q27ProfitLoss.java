import java.util.Scanner;

class Program27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter selling price: ");
        double sp = sc.nextDouble();

        if (cp < 0 || sp < 0) {
            System.out.println("Invalid price");
        } else if (sp > cp) {
            System.out.println("Profit = " + (sp - cp));
        } else if (cp > sp) {
            System.out.println("Loss = " + (cp - sp));
        } else {
            System.out.println("No profit, no loss");
        }

        sc.close();
    }
}
