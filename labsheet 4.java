
//Q1. Display name, age and college name
public class Main {
    public static void main(String[] args) {
        String name = "Himanshu";
        int age = 19;
        String college = "COER University";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }
}

Output:

Name: Himanshu
Age: 19
College: COER University

//Q2. Perform all arithmetic operations
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / (double)b));
        System.out.println("Modulus = " + (a % b));
    }
}

Output:

Enter two numbers: 20 6
Addition = 26
Subtraction = 14
Multiplication = 120
Division = 3.3333333333333335
Modulus = 2

//Q3. Check even or odd
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}

Output:

Enter a number: 7
Odd number

//Q4. Demonstrate relational operators
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }
}

Output:

Enter two numbers: 10 5
a == b: false
a != b: true
a > b: true
a < b: false
a >= b: true
a <= b: false

//Q5. Convert floating-point number into integer
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        double n = sc.nextDouble();

        int value = (int)n;

        System.out.println("Original value: " + n);
        System.out.println("Converted value: " + value);
    }
}

Output:

Enter decimal number: 25.78
Original value: 25.78
Converted value: 25

//Q6. Display ASCII value of a character
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.println("ASCII value = " + (int)ch);
    }
}

Output:

Enter a character: A
ASCII value = 65

//Q7. Check divisibility by 3 and 5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0)
            System.out.println("Divisible by both 3 and 5");
        else
            System.out.println("Not divisible by both 3 and 5");
    }
}

Output:

Enter a number: 30
Divisible by both 3 and 5

//Q8. Check vowel or consonant
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u')
            System.out.println("Vowel");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Consonant");
        else
            System.out.println("Invalid character");
    }
}

Output:

Enter a character: E
Vowel

//Q9. Calculate total, percentage and pass/fail
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of three subjects: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = a + b + c;
        double percentage = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage + "%");

        if (a >= 40 && b >= 40 && c >= 40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}

Output:

Enter marks of three subjects: 70 65 80
Total = 215
Percentage = 71.66666666666667%
Pass

//Q10. Find greatest of two numbers
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b)
            System.out.println(a + " is greater");
        else if (b > a)
            System.out.println(b + " is greater");
        else
            System.out.println("Both numbers are equal");
    }
}

Output:

Enter two numbers: 12 18
18 is greater


//Q11. Find largest of three numbers using nested if-else
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b) {
            if (a >= c)
                System.out.println("Largest = " + a);
            else
                System.out.println("Largest = " + c);
        } else {
            if (b >= c)
                System.out.println("Largest = " + b);
            else
                System.out.println("Largest = " + c);
        }
    }
}

Output:

Enter three numbers: 15 28 20
Largest = 28

//Q12. Check leap year
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0))
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}

Output:

Enter year: 2024
Leap year

//Q13. Check positive, negative or zero
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}

Output:

Enter a number: -8
Negative

//Q14. Check digit, uppercase, lowercase or special character
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
    }
}

Output:

Enter a character: G
Uppercase letter

//Q15. Check Armstrong number
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        if (n >= 100 && n <= 999) {
            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + digit * digit * digit;
                temp = temp / 10;
            }

            if (sum == n)
                System.out.println("Armstrong number");
            else
                System.out.println("Not an Armstrong number");
        } else {
            System.out.println("Enter a valid three-digit number");
        }
    }
}

Output:

Enter a three-digit number: 153
Armstrong number

//Q16. Calculate income tax using if-else
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual income: ");
        double income = sc.nextDouble();

        double tax;

        if (income <= 250000)
            tax = 0;
        else if (income <= 500000)
            tax = income * 0.05;
        else if (income <= 1000000)
            tax = income * 0.20;
        else
            tax = income * 0.30;

        System.out.println("Tax = Rs. " + tax);
    }
}

Output:

Enter annual income: 400000
Tax = Rs. 20000.0

//Q17. Check palindrome number
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (original >= 0 && original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}

Output:

Enter an integer: 1221
Palindrome

//Q18. Check prime number
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean prime = n > 1;

        for (int i = 2; i <= n / i && prime; i++) {
            if (n % i == 0)
                prime = false;
        }

        if (prime)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");
    }
}

Output:

Enter a number: 17
Prime number

//Q19. Perform operation using operator
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+')
            System.out.println("Result = " + (a + b));
        else if (op == '-')
            System.out.println("Result = " + (a - b));
        else if (op == '*')
            System.out.println("Result = " + (a * b));
        else if (op == '/') {
            if (b != 0)
                System.out.println("Result = " + (a / b));
            else
                System.out.println("Cannot divide by zero");
        } else
            System.out.println("Invalid operator");
    }
}

Output:

Enter first number: 12
Enter second number: 4
Enter operator (+, -, *, /): *
Result = 48.0

Q//20. Marriage eligibility using nested if-else
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter gender (M/F): ");
        char gender = Character.toUpperCase(sc.next().charAt(0));

        if (gender == 'M') {
            if (age >= 21)
                System.out.println("Eligible");
            else
                System.out.println("Not eligible");
        } else if (gender == 'F') {
            if (age >= 18)
                System.out.println("Eligible");
            else
                System.out.println("Not eligible");
        } else {
            System.out.println("Invalid gender");
        }
    }
}

Output:

Enter age: 22
Enter gender (M/F): M
Eligible

//Q21. Check valid triangle using angles
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three angles: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b + c == 180)
            System.out.println("Valid triangle");
        else
            System.out.println("Invalid triangle");
    }
}

Output:

Enter three angles: 60 60 60
Valid triangle

//Q22. Check square or rectangle
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        if (length == breadth)
            System.out.println("It is a square");
        else
            System.out.println("It is a rectangle");
    }
}

Output:

Enter length and breadth: 8 8
It is a square

//Q23. Convert Celsius into Fahrenheit
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        int result = (int)fahrenheit;

        System.out.println("Fahrenheit = " + fahrenheit);
        System.out.println("After type casting = " + result);
    }
}

Output:

Enter temperature in Celsius: 25
Fahrenheit = 77.0
After type casting = 77

//Q24. Check perfect number
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n > 0 && n % i == 0)
                sum = sum + i;
        }

        if (n > 0 && sum == n)
            System.out.println("Perfect number");
        else
            System.out.println("Not a perfect number");
    }
}

Output:

Enter a number: 28
Perfect number

//Q25. Perform logical operation using character
import java.util.Scanner;

public class Main {
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
            System.out.println("Invalid operator");
    }
}

Output:

Enter two integers: 5 0
Enter operator (& or |): &
Result = false

//Q26. Check first and last digits of five-digit number
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int n = sc.nextInt();

        if (n >= 10000 && n <= 99999) {
            int first = n / 10000;
            int last = n % 10;

            if (first == last)
                System.out.println("First and last digits are same");
            else
                System.out.println("First and last digits are different");
        } else {
            System.out.println("Enter a valid five-digit number");
        }
    }
}

Output:

Enter a five-digit number: 12341
First and last digits are same

//Q27. Calculate profit or loss
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter selling price: ");
        double sp = sc.nextDouble();

        if (sp > cp)
            System.out.println("Profit = Rs. " + (sp - cp));
        else if (cp > sp)
            System.out.println("Loss = Rs. " + (cp - sp));
        else
            System.out.println("No profit, no loss");
    }
}

Output:

Enter cost price: 500
Enter selling price: 650
Profit = Rs. 150.0

//Q28. Count number of digits
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        long value = Math.abs((long)n);
        int count = 0;

        if (value == 0)
            count = 1;
        else {
            while (value > 0) {
                count++;
                value = value / 10;
            }
        }

        System.out.println("Number of digits = " + count);
    }
}

Output:

Enter an integer: -4567
Number of digits = 4

//Q29. Classify height of a person
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        if (height < 150)
            System.out.println("Short");
        else if (height <= 170)
            System.out.println("Average");
        else
            System.out.println("Tall");
    }
}

Output:

Enter height in cm: 165
Average

//Q30. Simple calculator using if-else
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+')
            System.out.println("Addition = " + (a + b));
        else if (op == '-')
            System.out.println("Subtraction = " + (a - b));
        else if (op == '*')
            System.out.println("Multiplication = " + (a * b));
        else if (op == '/') {
            if (b != 0)
                System.out.println("Division = " + (a / b));
            else
                System.out.println("Cannot divide by zero");
        } else
            System.out.println("Invalid operator");
    }
}

Output:

Enter first number: 15
Enter second number: 3
Enter operator (+, -, *, /): /
Division = 5.0
