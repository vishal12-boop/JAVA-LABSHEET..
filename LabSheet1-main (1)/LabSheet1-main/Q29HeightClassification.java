import java.util.Scanner;

class Program29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        if (height <= 0)
            System.out.println("Invalid height");
        else if (height < 150)
            System.out.println("Short");
        else if (height <= 170)
            System.out.println("Average");
        else
            System.out.println("Tall");

        sc.close();
    }
}
