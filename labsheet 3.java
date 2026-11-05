
//Q1. Student Encapsulation

class Student {
    private String name;
    private int rollNo;
    private double marks;

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }

    void setRollNo(int r) {
        rollNo = r;
    }

    int getRollNo() {
        return rollNo;
    }

    void setMarks(double m) {
        marks = m;
    }

    double getMarks() {
        return marks;
    }

    void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Marks: " + getMarks());
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Rahul");
        s.setRollNo(101);
        s.setMarks(85.5);

        s.displayDetails();
    }
}


Output:
Name: Rahul
Roll No: 101
Marks: 85.5


//Q2. Bank Account with Validation
  
class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    void setAccountNumber(int n) {
        accountNumber = n;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    void setAccountHolder(String name) {
        accountHolder = name;
    }

    String getAccountHolder() {
        return accountHolder;
    }

    void setBalance(double b) {
        if (b >= 0)
            balance = b;
        else
            System.out.println("Invalid balance");
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setAccountNumber(12345);
        b.setAccountHolder("Aman");
        b.setBalance(5000);

        b.deposit(1000);
        b.withdraw(2000);
        b.withdraw(10000);

        System.out.println("Account Holder: " + b.getAccountHolder());
        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Balance: " + b.getBalance());
    }
}


Output:
Deposit successful
Withdrawal successful
Insufficient balance
Account Holder: Aman
Account Number: 12345
Balance: 4000.0


//Q3. Employee Salary Encapsulation
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    void setEmployeeId(int id) {
        employeeId = id;
    }

    int getEmployeeId() {
        return employeeId;
    }

    void setEmployeeName(String name) {
        employeeName = name;
    }

    String getEmployeeName() {
        return employeeName;
    }

    void setSalary(double s) {
        if (s >= 0 && s <= 1000000) {
            salary = s;
            System.out.println("Salary accepted");
        } else {
            System.out.println("Invalid salary");
        }
    }

    double getSalary() {
        return salary;
    }

    void display() {
        System.out.println("ID: " + getEmployeeId());
        System.out.println("Name: " + getEmployeeName());
        System.out.println("Salary: " + getSalary());
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmployeeId(101);
        e.setEmployeeName("Rahul");
        e.setSalary(50000);
        e.setSalary(1500000);

        e.display();
    }
}


Output:
Salary accepted
Invalid salary
ID: 101
Name: Rahul
Salary: 50000.0



//Q4–. Animal → Dog
Inheritance diagram
Animal
   |
   v
  Dog


class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.sleep();
        d.bark();
    }
}


Output:
Animal is eating
Animal is sleeping
Dog is barking


//Q5. Person → Student
  
class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;
    String course;

    void displayStudent() {
        displayPerson();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Aman";
        s.age = 20;
        s.rollNo = 101;
        s.course = "BCA";

        s.displayStudent();
    }
}


Output:
Name: Aman
Age: 20
Roll No: 101
Course: BCA


//Q6. Employee → Manager with Encapsulation
class Employee {
    private String name;
    private double salary;

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }

    void setSalary(double s) {
        salary = s;
    }

    double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager();

        m.setName("Rahul");
        m.setSalary(50000);
        m.department = "IT";

        m.displayManager();
    }
}


Output:
Name: Rahul
Salary: 50000.0
Department: IT




//Q7. Animal → Dog → Puppy

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Puppy is playing");
    }

    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();
    }
}


Output:
Animal is eating
Dog is barking
Puppy is playing


//Q8. Person → Employee → Manager
  
class Person {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        displayName();
        displayEmployee();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager();

        m.name = "Aman";
        m.employeeId = 101;
        m.department = "Sales";

        m.displayManager();
    }
}


Output:
Name: Aman
Employee ID: 101
Department: Sales


//Q9. Vehicle → Car → ElectricCar
  
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("Battery is charging");
    }

    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();

        e.start();
        e.drive();
        e.chargeBattery();
        e.stop();
    }
}


Output:
Vehicle started
Car is driving
Battery is charging
Vehicle stopped




//Q10. Animal → Dog and Cat

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}


Output:
Animal is eating
Dog is barking
Animal is eating
Cat is meowing


//Q11. Person → Student and Teacher
class Person {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    String course;

    void study() {
        displayName();
        System.out.println("Course: " + course);
        System.out.println("Student is studying");
    }
}

class Teacher extends Person {
    String subject;

    void teach() {
        displayName();
        System.out.println("Subject: " + subject);
        System.out.println("Teacher is teaching");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Rahul";
        s.course = "BCA";

        Teacher t = new Teacher();
        t.name = "Mr Sharma";
        t.subject = "Java";

        s.study();
        t.teach();
    }
}


Output:
Name: Rahul
Course: BCA
Student is studying
Name: Mr Sharma
Subject: Java
Teacher is teaching


//Q12. Employee → Developer and Manager
class Employee {
    String employeeName;
    int employeeId;

    void displayEmployee() {
        System.out.println("Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void writeCode() {
        displayEmployee();
        System.out.println("Language: " + programmingLanguage);
        System.out.println("Developer is writing code");
    }
}

class Manager extends Employee {
    String department;

    void conductMeeting() {
        displayEmployee();
        System.out.println("Department: " + department);
        System.out.println("Manager is conducting meeting");
    }

    public static void main(String[] args) {
        Developer d = new Developer();
        d.employeeName = "Aman";
        d.employeeId = 101;
        d.programmingLanguage = "Java";

        Manager m = new Manager();
        m.employeeName = "Rahul";
        m.employeeId = 102;
        m.department = "IT";

        d.writeCode();
        m.conductMeeting();
    }
}


Output:
Name: Aman
Employee ID: 101
Language: Java
Developer is writing code
Name: Rahul
Employee ID: 102
Department: IT
Manager is conducting meeting


//Q13. Animal Sound Overriding
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat is meowing");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.makeSound();
        c.makeSound();
    }
}


Output:
Dog is barking
Cat is meowing


//Q14. Employee Salary Calculation
class Employee {
    double calculateSalary() {
        return 30000;
    }
}

class Manager extends Employee {
    @Override
    double calculateSalary() {
        return 50000;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        System.out.println("Employee Salary: " + e.calculateSalary());
        System.out.println("Manager Salary: " + m.calculateSalary());
    }
}


Output:
Employee Salary: 30000.0
Manager Salary: 50000.0


//Q15. Shape Area Overriding
class Shape {
    void calculateArea() {
        System.out.println("Calculating area");
    }
}

class Circle extends Shape {
    double radius = 5;

    @Override
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

class Rectangle extends Shape {
    int length = 10, breadth = 5;

    @Override
    void calculateArea() {
        int area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.calculateArea();
        r.calculateArea();
    }
}


Output:
Circle Area: 78.5
Rectangle Area: 50




//Q16. Camera + MusicPlayer → Smartphone
Structure
Camera       MusicPlayer
    \           /
     \         /
      Smartphone


interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {
    public void takePhoto() {
        System.out.println("Photo captured");
    }

    public void playMusic() {
        System.out.println("Music is playing");
    }

    public static void main(String[] args) {
        Smartphone s = new Smartphone();

        s.takePhoto();
        s.playMusic();
    }
}


Output:
Photo captured
Music is playing


//Q17. Printer + Scanner → MultiFunctionMachine
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultiFunctionMachine implements Printer, Scanner {
    private String machineName;
    private int machineId;

    void setMachineName(String name) {
        machineName = name;
    }

    String getMachineName() {
        return machineName;
    }

    void setMachineId(int id) {
        machineId = id;
    }

    int getMachineId() {
        return machineId;
    }

    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }

    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine();

        m.setMachineName("HP Printer");
        m.setMachineId(101);

        System.out.println("Machine: " + m.getMachineName());
        System.out.println("Machine ID: " + m.getMachineId());

        m.print();
        m.scan();
    }
}


Output:
Machine: HP Printer
Machine ID: 101
Printing document
Scanning document




//Q18. Vehicle → Car → ElectricCar + Electric
Structure
Vehicle
   |
   v
  Car       Electric
    \         /
     \       /
    ElectricCar


class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

interface Electric {
    void chargeBattery();
}

class ElectricCar extends Car implements Electric {
    public void chargeBattery() {
        System.out.println("Battery is charging");
    }

    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();

        e.start();
        e.drive();
        e.chargeBattery();
    }
}


Output:
Vehicle started
Car is driving
Battery is charging


//Q19. Employee → Developer + Programmer + Researcher
Structure
       Employee
           |
           v
        Developer
         /     \
        v       v
  Programmer  Researcher


class Employee {
    private String name;
    private int employeeId;

    void setDetails(String n, int id) {
        name = n;
        employeeId = id;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

interface Programmer {
    void writeCode();
}

interface Researcher {
    void conductResearch();
}

class Developer extends Employee implements Programmer, Researcher {
    public void writeCode() {
        System.out.println("Developer is writing code");
    }

    public void conductResearch() {
        System.out.println("Developer is conducting research");
    }

    public static void main(String[] args) {
        Developer d = new Developer();

        d.setDetails("Rahul", 101);
        d.displayEmployee();

        d.writeCode();
        d.conductResearch();
    }
}


Output:
Name: Rahul
Employee ID: 101
Developer is writing code
Developer is conducting research



//Q20. University Employee System – Integrated OOP


Java Program:
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    Employee(int id, String name, double salary) {
        this.employeeId = id;
        this.employeeName = name;
        this.salary = salary;
    }

    void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
    }

    double getSalary() {
        return salary;
    }

    int getEmployeeId() {
        return employeeId;
    }

    String getEmployeeName() {
        return employeeName;
    }

    void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }

    double calculateSalary() {
        return salary;
    }
}

interface Researcher {
    void conductResearch();
}

class Teacher extends Employee implements Researcher {
    String subject;

    Teacher(int id, String name, double salary, String subject) {
        super(id, name, salary);
        this.subject = subject;
    }

    void teach() {
        System.out.println("Teaching Subject: " + subject);
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() + 5000;
    }

    public void conductResearch() {
        System.out.println("Teacher is conducting research");
    }
}

class VisitingTeacher extends Teacher {
    int hoursWorked;

    VisitingTeacher(int id, String name, double salary,
                    String subject, int hours) {
        super(id, name, salary, subject);
        hoursWorked = hours;
    }

    @Override
    double calculateSalary() {
        double hourlyRate = 500;
        return hoursWorked * hourlyRate;
    }
}

class Admin extends Employee {
    String department;

    Admin(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
    }

    void manageDepartment() {
        System.out.println("Managing Department: " + department);
    }
}

class UniversitySystem {
    public static void main(String[] args) {

        Teacher t = new Teacher(101, "Rahul", 30000, "Java");

        System.out.println("Teacher Details:");
        t.displayDetails();
        t.teach();
        t.conductResearch();
        System.out.println("Teacher Salary: " + t.calculateSalary());

        System.out.println();

        VisitingTeacher v = new VisitingTeacher(
            102, "Aman", 0, "Python", 20
        );

        System.out.println("Visiting Teacher Details:");
        v.displayDetails();
        System.out.println("Visiting Teacher Salary: " +
                           v.calculateSalary());

        System.out.println();

        Admin a = new Admin(103, "Rohit", 25000, "Administration");

        System.out.println("Admin Details:");
        a.displayDetails();
        a.manageDepartment();
        System.out.println("Admin Salary: " + a.calculateSalary());
    }
}


Output:
Teacher Details:
ID: 101
Name: Rahul
Salary: 30000.0
Teaching Subject: Java
Teacher is conducting research
Teacher Salary: 35000.0
