
//Q1: Student Class (Fields & Static Counters)
class Student {
    String name;
    int age;
    static int count = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    void displayDetails() {
        String n = this.name;
        int a = this.age;
        System.out.println("Student Name: " + n + ", Age: " + a + ", Total Students: " + count);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 21);
        s1.displayDetails();
        s2.displayDetails();
    }
}

Output:
Student Name: Alice, Age: 20, Total Students: 2
Student Name: Bob, Age: 21, Total Students: 2
  
//Q2: Rectangle Class (Area Calculation)
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 1 of 25
class Rectangle {
    double length;
    double breadth;
    static String shapeName = "Rectangle";

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateAndDisplayArea() {
        double l = this.length;
        double b = this.breadth;
        double area = l * b;
        System.out.println("Shape: " + shapeName + ", Area: " + area);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 4.0);
        rect.calculateAndDisplayArea();
    }
}
Output
Shape: Rectangle, Area: 20.0

  
//Q3: Circle Class (Area & Circumference)
class Circle {
    double radius;
    static double PI = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateDetails() {
        double r = this.radius;
        double area = PI * r * r;
        double circumference = 2 * PI * r;
        System.out.println("Area: " + area + ", Circumference: " + circumference);
    }

    public static void main(String[] args) {
        Circle c = new Circle(7.0);
        c.calculateDetails();
    }
}
Output
Area: 153.86, Circumference: 43.96
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 2 of 25
  
//Q4: Employee Class (Details Display)
class Employee {
    int empId;
    double salary;
    static String companyName = "TechCorp";

    Employee(int empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    void displayDetails() {
        int id = this.empId;
        double sal = this.salary;
        System.out.println("Company: " + companyName + ", ID: " + id + ", Salary: $" + sal);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, 75000.0);
        emp.displayDetails();
    }
}
Output
Company: TechCorp, ID: 101, Salary: $75000.0
  
//Q5: Book Class (Setting & Printing Details)
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 3 of 25
class Book {
    String title;
    String author;
    double price;
    static String publisher = "Pearson";

    void setAndDisplay(String t, String a, double p) {
        this.title = t;
        this.author = a;
        this.price = p;

        String displayTitle = this.title;
        String displayAuthor = this.author;
        double displayPrice = this.price;

        System.out.println("Book: " + displayTitle + " by " + displayAuthor + " | Price: $" + displayPrice + " | Publisher: " + publisher);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.setAndDisplay("Core Java", "Cay S. Horstmann", 45.50);
    }
}
Output
Book: Core Java by Cay S. Horstmann | Price: $45.5 | Publisher: Pearson
  
//Q6: Car Class (Brand & Mileage)
class Car {
    String brand;
    double mileage;
    static int wheels = 4;

    Car(String brand, double mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    void displayDetails() {
        String b = this.brand;
        double m = this.mileage;
        System.out.println("Brand: " + b + ", Mileage: " + m + " km/l, Wheels: " + wheels);
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", 18.5);
        car.displayDetails();
    }
}
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 4 of 25
Output
Brand: Toyota, Mileage: 18.5 km/l, Wheels: 4
  
//Q7: BankAccount Class (Deposit Logic)
class BankAccount {
    String accountNumber;
    double balance;
    static String bankName = "State Bank";

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        double currentBalance = this.balance;
        double depositAmount = amount;
        this.balance = currentBalance + depositAmount;
        System.out.println("Bank: " + bankName + " | Deposited: $" + depositAmount + " | New Balance: $" + this.balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC12345", 1000.0);
        acc.deposit(500.0);
    }
}
Output
Bank: State Bank | Deposited: $500.0 | New Balance: $1500.0
  
//Q8: Pen Class (Manufacturer & Type)
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 5 of 25
class Pen {
    String color;
    String type;
    static String manufacturer = "Pilot";

    Pen(String color, String type) {
        this.color = color;
        this.type = type;
    }

    void displayDetails() {
        String c = this.color;
        String t = this.type;
        System.out.println("Pen Manufacturer: " + manufacturer + ", Color: " + c + ", Type: " + t);
    }

    public static void main(String[] args) {
        Pen pen = new Pen("Blue", "Gel");
        pen.displayDetails();
    }
}
Output
Pen Manufacturer: Pilot, Color: Blue, Type: Gel
  
//Q9: Laptop Class (Brand & Operating System)
class Laptop {
    String brand;
    int RAM;
    static String os = "Windows";

    Laptop(String brand, int RAM) {
        this.brand = brand;
        this.RAM = RAM;
    }

    void displayDetails() {
        String b = this.brand;
        int r = this.RAM;
        System.out.println("Laptop Brand: " + b + ", RAM: " + r + "GB, OS: " + os);
    }

    public static void main(String[] args) {
        Laptop lap = new Laptop("Dell", 16);
        lap.displayDetails();
    }
}
Output
Laptop Brand: Dell, RAM: 16GB, OS: Windows
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 6 of 25
  
//Q10: Movie Class (Rating & Genre)
class Movie {
    String name;
    String genre;
    double rating;
    static String industry = "Hollywood";

    Movie(String name, String genre, double rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    void displayDetails() {
        String n = this.name;
        String g = this.genre;
        double r = this.rating;
        System.out.println("Industry: " + industry + " | Movie: " + n + " | Genre: " + g + " | Rating: " + r + "/10");
    }

    public static void main(String[] args) {
        Movie m = new Movie("Inception", "Sci-Fi", 8.8);
        m.displayDetails();
    }
}
Output
Industry: Hollywood | Movie: Inception | Genre: Sci-Fi | Rating: 8.8/10

//Q11: Calculator Class (Operation Tracking)
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 7 of 25
class Calculator {
    static int operationsCount = 0;

    double add(double a, double b) {
        double res = a + b;
        operationsCount++;
        return res;
    }

    double multiply(double a, double b) {
        double res = a * b;
        operationsCount++;
        return res;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Multiply: " + calc.multiply(4, 3));
        System.out.println("Total Operations Performed: " + Calculator.operationsCount);
    }
}
Output
Add: 15.0
Multiply: 12.0
Total Operations Performed: 2
  
//StudentMarks Class (Average Calculation)
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 8 of 25
class StudentMarks {
    private double marks1, marks2, marks3;
    static String universityName = "XYZ University";

    StudentMarks(double m1, double m2, double m3) {
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    void calculateAverage() {
        double m1 = this.marks1;
        double m2 = this.marks2;
        double m3 = this.marks3;
        double avg = (m1 + m2 + m3) / 3;
        System.out.println("University: " + universityName + " | Average Marks: " + avg);
    }

    public static void main(String[] args) {
        StudentMarks sm = new StudentMarks(85.0, 90.0, 80.0);
        sm.calculateAverage();
    }
}
Output
University: XYZ University | Average Marks: 85.0
  
//Q13: Temperature Class (Unit Conversion)
class Temperature {
    private double celsius;
    static String scale = "Celsius";

    Temperature(double celsius) {
        this.celsius = celsius;
    }

    void convert() {
        double c = this.celsius;
        double fahrenheit = (c * 9 / 5) + 32;
        double kelvin = c + 273.15;
        System.out.println("Current Scale: " + scale);
        System.out.println(c + "°C = " + fahrenheit + "°F = " + kelvin + "K");
    }

    public static void main(String[] args) {
        Temperature temp = new Temperature(25.0);
        temp.convert();
    }
}
Output
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 9 of 25
Current Scale: Celsius
25.0°C = 77.0°F = 298.15K
  
//Q14: Person Class (Voting Eligibility Check)
class Person {
    private String name;
    private int age;
    static String country = "India";

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void checkVotingEligibility() {
        String n = this.name;
        int a = this.age;
        if (a >= 18) {
            System.out.println(n + " from " + country + " is eligible to vote.");
        } else {
            System.out.println(n + " from " + country + " is NOT eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Rohan", 20);
        Person p2 = new Person("Maya", 16);
        p1.checkVotingEligibility();
        p2.checkVotingEligibility();
    }
}
Output
Rohan from India is eligible to vote.
Maya from India is NOT eligible to vote.
  
//Q15: SimpleInterest Class (Financial Calculation)
class SimpleInterest {
    private double principal;
    private double rate;
    private double time;
    static String bank = "National Bank";

    SimpleInterest(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    void calculateInterest() {
        double p = this.principal;
        double r = this.rate;
        double t = this.time;
        double interest = (p * r * t) / 100;
        System.out.println("Bank: " + bank + " | Calculated Simple Interest: $" + interest);
    }

    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest(10000, 5, 2);
        si.calculateInterest();
    }
}
Output
Bank: National Bank | Calculated Simple Interest: $1000.0
  
//Q16: Triangle Class (Validation & Type Classification)
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 11 of 25
class Triangle {
    private double a, b, c;
    static String type = "Unknown";

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void checkValidityAndType() {
        double s1 = this.a;
        double s2 = this.b;
        double s3 = this.c;

        if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
            if (s1 == s2 && s2 == s3) {
                type = "Equilateral";
            } else if (s1 == s2 || s2 == s3 || s1 == s3) {
                type = "Isosceles";
            } else {
                type = "Scalene";
            }
            System.out.println("Valid Triangle of type: " + type);
        } else {
            System.out.println("Invalid Triangle sides.");
        }
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(5, 5, 5);
        t.checkValidityAndType();
    }
}
Output
Valid Triangle of type: Equilateral
  
//Q17: StudentGrade Class (Grade Evaluation)
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 12 of 25
class StudentGrade {
    private String name;
    private double marks;
    static double passingMarks = 40.0;

    StudentGrade(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    void assignGrade() {
        String studentName = this.name;
        double score = this.marks;
        char grade;

        if (score >= 90) grade = 'A';
        else if (score >= 75) grade = 'B';
        else if (score >= passingMarks) grade = 'C';
        else grade = 'F';

        System.out.println("Student: " + studentName + " | Marks: " + score + " | Grade: " + grade);
    }

    public static void main(String[] args) {
        StudentGrade sg = new StudentGrade("John", 82.5);
        sg.assignGrade();
    }
}
Output
Student: John | Marks: 82.5 | Grade: B
  
//Q18: ElectricBill Class (Tariff Rate Computation)
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 13 of 25
class ElectricBill {
    private double units;
    static double fixedCharge = 50.0;

    ElectricBill(double units) {
        this.units = units;
    }

    void calculateTotalBill() {
        double u = this.units;
        double variableCharge = 0.0;

        if (u <= 100) {
            variableCharge = u * 5;
        } else {
            variableCharge = (100 * 5) + ((u - 100) * 7);
        }

        double totalBill = variableCharge + fixedCharge;
        System.out.println("Units: " + u + " | Fixed Charge: $" + fixedCharge + " | Total Bill: $" + totalBill);
    }

    public static void main(String[] args) {
        ElectricBill bill = new ElectricBill(150);
        bill.calculateTotalBill();
    }
}
Output
Units: 150.0 | Fixed Charge: $50.0 | Total Bill: $900.0
  
//Q19: Product Class (Discount Application)
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 14 of 25
class Product {
    private int id;
    private String name;
    private double price;
    static double discountRate = 10.0;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void calculateFinalPrice() {
        double originalPrice = this.price;
        double discountAmount = (originalPrice * discountRate) / 100;
        double finalPrice = originalPrice - discountAmount;

        System.out.println("Product: " + this.name + " | Original Price: $" + originalPrice + " | Final Price: $" + finalPrice);
    }

    public static void main(String[] args) {
        Product p = new Product(101, "Headphones", 200.0);
        p.calculateFinalPrice();
    }
}
Output
Product: Headphones | Original Price: $200.0 | Final Price: $180.0
  
//Q20: BankAccount Validation (Sufficient Balance Verification)
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 15 of 25
class BankAccountValidation {
    private double balance;
    static String bankCode = "BK001";

    BankAccountValidation(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        double currentBal = this.balance;
        double reqAmount = amount;

        if (reqAmount <= currentBal) {
            this.balance = currentBal - reqAmount;
            System.out.println("[" + bankCode + "] Withdrawal of $" + reqAmount + " successful. Remaining balance: $" + this.balance);
        } else {
            System.out.println("[" + bankCode + "] Transaction failed: Insufficient funds. Available balance: $" + currentBal);
        }
    }

    public static void main(String[] args) {
        BankAccountValidation acc = new BankAccountValidation(500.0);
        acc.withdraw(200.0);
        acc.withdraw(400.0);
    }
}
Output
[BK001] Withdrawal of $200.0 successful. Remaining balance: $300.0
[BK001] Transaction failed: Insufficient funds. Available balance: $300.0
  
//Q21: Palindrome Class (Number Reversal Algorithm)
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 16 of 25
class Palindrome {
    static int countChecks = 0;

    boolean isPalindrome(int number) {
        countChecks++;
        int original = number;
        int reversed = 0;
        int temp = number;

        while (temp > 0) {
            int remainder = temp % 10;
            reversed = reversed * 10 + remainder;
            temp /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        int num = 121;
        System.out.println(num + " is Palindrome? " + p.isPalindrome(num));
        System.out.println("Total checks performed: " + Palindrome.countChecks);
    }
}
Output
121 is Palindrome? true
Total checks performed: 1
  
//Q22: Armstrong Class (Power Sum Verification)
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 17 of 25
class Armstrong {
    static int totalChecks = 0;

    boolean isArmstrong(int number) {
        totalChecks++;
        int original = number;
        int sum = 0;
        int digits = 0;
        int temp = number;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = number;
        while (temp > 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        int num = 153;
        System.out.println(num + " is Armstrong? " + a.isArmstrong(num));
        System.out.println("Total Armstrong checks: " + Armstrong.totalChecks);
    }
}
Output
153 is Armstrong? true
Total Armstrong checks: 1
  
//Q23: PrimeChecker Class (Primality Loop)
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 18 of 25
class PrimeChecker {
    static int totalPrimeChecks = 0;

    boolean checkPrime(int n) {
        totalPrimeChecks++;
        if (n <= 1) return false;

        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        PrimeChecker pc = new PrimeChecker();
        int num = 29;
        System.out.println(num + " is Prime? " + pc.checkPrime(num));
        System.out.println("Total Prime Checks: " + PrimeChecker.totalPrimeChecks);
    }
}
Output
29 is Prime? true
Total Prime Checks: 1
  
//Q24: Fibonacci Class (Sequence Generation)
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 19 of 25
class Fibonacci {
    static int seriesCount = 0;

    void displayFibonacci(int n) {
        seriesCount++;
        int first = 0, second = 1;
        System.out.print("Fibonacci Series (" + n + " terms): ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        fib.displayFibonacci(7);
        System.out.println("Series generated count: " + Fibonacci.seriesCount);
    }
}
Output
Fibonacci Series (7 terms): 0 1 1 2 3 5 8 
Series generated count: 1
  
//Q25: Factorial Class (Iterative Factorial Computation)
class Factorial {
    static int totalCalls = 0;

    long computeFactorial(int n) {
        totalCalls++;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        int num = 5;
        System.out.println("Factorial of " + num + " = " + f.computeFactorial(num));
        System.out.println("Total method calls: " + Factorial.totalCalls);
    }
}
Output
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 20 of 25
Factorial of 5 = 120
Total method calls: 1
  
//Q26: Matrix Class (2x2 Addition & Subtraction)
class Matrix {
    int[][] mat = new int[2][2];
    static String matrixType = "2x2 Square Matrix";

    Matrix(int a, int b, int c, int d) {
        this.mat[0][0] = a;
        this.mat[0][1] = b;
        this.mat[1][0] = c;
        this.mat[1][1] = d;
    }

    void add(Matrix m) {
        int[][] res = new int[2][2];
        System.out.println("Matrix Addition (" + matrixType + "):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                res[i][j] = this.mat[i][j] + m.mat[i][j];
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    void subtract(Matrix m) {
        int[][] res = new int[2][2];
        System.out.println("Matrix Subtraction (" + matrixType + "):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                res[i][j] = this.mat[i][j] - m.mat[i][j];
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix m1 = new Matrix(5, 8, 3, 4);
        Matrix m2 = new Matrix(1, 2, 1, 1);

        m1.add(m2);
        m1.subtract(m2);
    }
}

//Output
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 21 of 25
Matrix Addition (2x2 Square Matrix):
6 10 
4 5 
Matrix Subtraction (2x2 Square Matrix):
4 6 
2 3 
  
//Q27: StringReverse Class (Character Loop Reversal)
class StringReverse {
    static int totalReversals = 0;

    String reverseString(String input) {
        totalReversals++;
        String rev = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            rev += input.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        StringReverse sr = new StringReverse();
        String str = "Java";
        System.out.println("Original: " + str + " | Reversed: " + sr.reverseString(str));
        System.out.println("Total Reversals: " + StringReverse.totalReversals);
    }
}

//Output
Original: Java | Reversed: avaJ
Total Reversals: 1
  
//Q28: WordCounter Class (Sentence Word Splitting)
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 22 of 25
class WordCounter {
    static String language = "English";

    int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        WordCounter wc = new WordCounter();
        String text = "Java is a popular programming language";
        System.out.println("Language Context: " + WordCounter.language);
        System.out.println("Word Count: " + wc.countWords(text));
    }
}

//Output
Language Context: English
Word Count: 6
  
//Q29: Employee Object Comparison (Salary Comparison)
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
Page 23 of 25
class EmployeeComparison {
    String name;
    double salary;
    static String organization = "Global Tech";

    EmployeeComparison(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void compareSalary(EmployeeComparison other) {
        String name1 = this.name;
        double sal1 = this.salary;
        String name2 = other.name;
        double sal2 = other.salary;

        System.out.println("Organization: " + organization);
        if (sal1 > sal2) {
            System.out.println(name1 + " ($" + sal1 + ") earns more than " + name2 + " ($" + sal2 + ")");
        } else if (sal2 > sal1) {
            System.out.println(name2 + " ($" + sal2 + ") earns more than " + name1 + " ($" + sal1 + ")");
        } else {
            System.out.println(name1 + " and " + name2 + " earn the exact same salary.");
        }
    }

    public static void main(String[] args) {
        EmployeeComparison e1 = new EmployeeComparison("Alice", 85000.0);
        EmployeeComparison e2 = new EmployeeComparison("Bob", 92000.0);
        e1.compareSalary(e2);
    }
}

//Output
Organization: Global Tech
Bob ($92000.0) earns more than Alice ($85000.0)
  
//Q30: Library Class (Issue and Return State Tracking)

class Library {
    int booksAvailable;
    static String libraryName = "Central Library";

    Library(int booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    void issueBook(int count) {
        int req = count;
        if (req <= this.booksAvailable) {
            this.booksAvailable -= req;
            System.out.println("[" + libraryName + "] Issued " + req + " book(s). Available: " + this.booksAvailable);
        } else {
            System.out.println("[" + libraryName + "] Not enough books available to issue.");
        }
    }

    void returnBook(int count) {
        int ret = count;
        this.booksAvailable += ret;
        System.out.println("[" + libraryName + "] Returned " + ret + " book(s). Available: " + this.booksAvailable);
    }

    public static void main(String[] args) {
        Library lib = new Library(10);
        lib.issueBook(3);
        lib.returnBook(2);
    }
}

//Output
[Central Library] Issued 3 book(s). Available: 7
[Central Library] Returned 2 book(s). Available: 9
Foundations of Java Development (BCA201P) — Lab Sheet 04 Solutions
