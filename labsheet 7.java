//Q1. Handling ArithmeticException
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}


Output:
Enter first number: 20
Enter second number: 0
Cannot divide by zero!


//Q2. Handling ArrayIndexOutOfBoundsException
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter array index (0-4): ");
            int index = sc.nextInt();

            System.out.println("Element = " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}


Output:
Enter array index (0-4): 7
Invalid array index!


//Q3. Handling NumberFormatException
public class Q3 {
    public static void main(String[] args) {
        String number = "Hello";

        try {
            int n = Integer.parseInt(number);
            System.out.println("Number = " + n);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
    }
}


Output:
Invalid number format!


//Q4. Multiple catch Blocks
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter first number: ");
            int a = Integer.parseInt(sc.nextLine());

            System.out.print("Enter second number: ");
            int b = Integer.parseInt(sc.nextLine());

            System.out.println("Division = " + (a / b));

            System.out.print("Enter array index (0-4): ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Array element = " + arr[index]);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers!");
        }
    }
}


Output:
Enter first number: 20
Enter second number: 0
Cannot divide by zero!


Note: The program stops the remaining statements when an exception occurs.
//Q5. Using finally
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Result = " + (a / b));

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}


Output:
Enter first number: 10
Enter second number: 0
Cannot divide by zero!
Program execution completed.


//Q6. Using throw
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student marks: ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                throw new Exception("Marks must be between 0 and 100.");
            }

            System.out.println("Valid marks: " + marks);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


Output:
Enter student marks: 120
Error: Marks must be between 0 and 100.


//Q7. Using throws
import java.util.Scanner;

public class Q7 {

    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        }

        System.out.println("You are eligible.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            checkAge(age);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


Output:
Enter your age: 16
Error: Age must be 18 or above.


//Q8. Nested try-catch
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Division = " + (a / b));

            try {
                System.out.print("Enter array index (0-4): ");
                int index = sc.nextInt();

                System.out.println("Element = " + arr[index]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}


Output:
Enter first number: 20
Enter second number: 2
Division = 10
Enter array index (0-4): 8
Invalid array index!


//Q9. Exception Propagation
public class Q9 {

    static void method3() {
        int result = 10 / 0;
    }

    static void method2() {
        method3();
    }

    static void method1() {
        method2();
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main().");
        }
    }
}


Output:
Exception handled in main().


//Q10. User-Defined Exception
import java.util.Scanner;

class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException(
                    "Marks must be between 0 and 100."
                );
            }

            System.out.println("Valid marks: " + marks);

        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


Output:
Enter marks: 150
Error: Marks must be between 0 and 100.



//Q11. Bank Withdrawal System
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account balance: ");
            double balance = Double.parseDouble(sc.nextLine());

            System.out.print("Enter withdrawal amount: ");
            double amount = Double.parseDouble(sc.nextLine());

            if (amount < 0) {
                throw new IllegalArgumentException(
                    "Withdrawal cannot be negative."
                );
            }

            if (amount > balance) {
                throw new InsufficientBalanceException(
                    "Insufficient account balance!"
                );
            }

            balance = balance - amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric values.");
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bank transaction completed.");
        }
    }
}


Output:
Enter account balance: 5000
Enter withdrawal amount: 6000
Insufficient account balance!
Bank transaction completed.


//Q12. Hospital Patient Age Validation
import java.util.Scanner;

class InvalidPatientAgeException extends Exception {
    InvalidPatientAgeException(String message) {
        super(message);
    }
}

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter patient age: ");
            int age = Integer.parseInt(sc.nextLine());

            if (age < 0 || age > 120) {
                throw new InvalidPatientAgeException(
                    "Age must be between 0 and 120."
                );
            }

            System.out.println("Patient registered successfully.");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

        } catch (NumberFormatException e) {
            System.out.println("Please enter age in numbers.");
        } catch (InvalidPatientAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


Output:
Enter patient name: Rahul
Enter patient age: 150
Error: Age must be between 0 and 120.


//Q13. Pharmaceutical Drug Dosage Validation
import java.util.Scanner;

class InvalidDosageException extends Exception {
    InvalidDosageException(String message) {
        super(message);
    }
}

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String patient = sc.nextLine();

            System.out.print("Enter drug name: ");
            String drug = sc.nextLine();

            System.out.print("Enter dosage in mg: ");
            int dosage = Integer.parseInt(sc.nextLine());

            if (dosage <= 0 || dosage > 1000) {
                throw new InvalidDosageException(
                    "Dosage must be between 1 and 1000 mg."
                );
            }

            System.out.println("Dosage is valid.");
            System.out.println("Patient: " + patient);
            System.out.println("Drug: " + drug);
            System.out.println("Dosage: " + dosage + " mg");

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid dosage.");
        } catch (InvalidDosageException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Dosage validation completed.");
        }
    }
}


Output:
Enter patient name: Rahul
Enter drug name: Paracetamol
Enter dosage in mg: 1200
Error: Dosage must be between 1 and 1000 mg.
Dosage validation completed.


//Q14. Online Examination System
import java.util.Scanner;

class InvalidExamMarksException extends Exception {
    InvalidExamMarksException(String message) {
        super(message);
    }
}

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student marks: ");
            int marks = Integer.parseInt(sc.nextLine());

            if (marks < 0 || marks > 100) {
                throw new InvalidExamMarksException(
                    "Marks must be between 0 and 100."
                );
            }

            if (marks >= 40) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }

        } catch (NumberFormatException e) {
            System.out.println("Please enter marks in numbers.");
        } catch (InvalidExamMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Exam evaluation completed.");
        }
    }
}


Output:
Enter student marks: 75
PASS
Exam evaluation completed.


//Q15. Pharmacy Inventory System
import java.util.Scanner;

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String message) {
        super(message);
    }
}

class InsufficientMedicineStockException extends Exception {
    InsufficientMedicineStockException(String message) {
        super(message);
    }
}

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter medicine name: ");
            String medicine = sc.nextLine();

            System.out.print("Enter available quantity: ");
            int available = Integer.parseInt(sc.nextLine());

            System.out.print("Enter required quantity: ");
            int required = Integer.parseInt(sc.nextLine());

            if (available < 0 || required < 0) {
                throw new InvalidQuantityException(
                    "Quantity cannot be negative."
                );
            }

            if (required > available) {
                throw new InsufficientMedicineStockException(
                    "Required medicine is not available in stock."
                );
            }

            System.out.println("Medicine: " + medicine);
            System.out.println("Medicine issued successfully.");
            System.out.println("Remaining quantity: "
                               + (available - required));

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric quantities.");
        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientMedicineStockException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Inventory transaction completed.");
        }
    }
}


Output:
Enter medicine name: Paracetamol
Enter available quantity: 20
Enter required quantity: 30
Error: Required medicine is not available in stock.
Inventory transaction completed.
