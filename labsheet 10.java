//Q1. Student Record – Class and Object

class Student {
    String name;
    int rollNo;
    double marks;

    // No-argument constructor
    Student() {
        name = "Rahul";
        rollNo = 101;
        marks = 85.5;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayDetails();
    }
}


//Q2. Medicine – Parameterized Constructor and this
Filename: MedicineMain.java
class Medicine {
    String medicineName;
    String batchNo;
    double price;

    Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    void displayMedicine() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Batch Number: " + batchNo);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class MedicineMain {
    public static void main(String[] args) {
        Medicine m1 = new Medicine("Paracetamol", "B101", 25.50);
        Medicine m2 = new Medicine("Vitamin C", "B102", 40.00);

        m1.displayMedicine();
        m2.displayMedicine();
    }
}


//Q3. Pharmacy – Instance and Class Variables
//Filename: PharmacyMain.java
class Pharmacy {
    String pharmacyName;
    String location;

    // Shared class variable
    static int pharmacyCount = 0;

    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++;
    }

    void displayPharmacy() {
        System.out.println("Pharmacy: " + pharmacyName);
        System.out.println("Location: " + location);
    }

    void displayPharmacyCount() {
        System.out.println("Total Pharmacies: " + pharmacyCount);
    }
}

public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy("City Pharmacy", "Roorkee");
        Pharmacy p2 = new Pharmacy("Care Pharmacy", "Haridwar");
        Pharmacy p3 = new Pharmacy("Health Pharmacy", "Dehradun");

        p1.displayPharmacy();
        p2.displayPharmacy();
        p3.displayPharmacy();

        p1.displayPharmacyCount();
    }
}


//Q4. Patient Records – Object Array, Loop and Local Variable
Filename: PatientMain.java
class Patient {
    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

class PatientManager {
    void displayAllPatients(Patient[] patients) {
        // Local loop variable
        for (int i = 0; i < patients.length; i++) {
            patients[i].displayPatient();
        }
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient[] patients = {
            new Patient(101, "Aman", 25),
            new Patient(102, "Rahul", 30),
            new Patient(103, "Priya", 22),
            new Patient(104, "Neha", 28),
            new Patient(105, "Karan", 35)
        };

        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}


//Q5. Medicine Eligibility – Method and Local Variable
Filename: EligibilityMain.java
class Medicine {
    String medicineName;
    int ageLimit;

    Medicine(String medicineName, int ageLimit) {
        this.medicineName = medicineName;
        this.ageLimit = ageLimit;
    }

    String checkEligibility(int patientAge) {
        // Local variable
        String result;

        if (patientAge >= ageLimit)
            result = "Eligible";
        else
            result = "Not Eligible";

        return result;
    }
}

public class EligibilityMain {
    public static void main(String[] args) {
        Medicine m = new Medicine("Medicine A", 18);

        System.out.println("Medicine: " + m.medicineName);
        System.out.println("Age 25: " + m.checkEligibility(25));
        System.out.println("Age 15: " + m.checkEligibility(15));
    }
}


//Q6. Encapsulated Medicine Product
Filename: MedicineProductMain.java
class MedicineProduct {
    // Private data for encapsulation
    private String medicineName;
    private String batchNo;
    private double price;

    MedicineProduct(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    // Getters
    public String getMedicineName() {
        return medicineName;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Batch: " + batchNo);
        System.out.println("Price: " + price);
    }
}

public class MedicineProductMain {
    public static void main(String[] args) {
        MedicineProduct m =
            new MedicineProduct("Paracetamol", "B101", 25.0);

        m.setPrice(30.0);

        System.out.println("Updated Price: " + m.getPrice());
        System.out.println("Medicine Name: " + m.getMedicineName());

        m.displayProduct();
    }
}


//Q7. Encapsulated Patient – Validation
Filename: PatientMain.java
class Patient {
    private String patientName;
    private int age;
    private double weight;

    Patient(String patientName, int age, double weight) {
        this.patientName = patientName;
        setAge(age);
        setWeight(weight);
    }

    // Getters
    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    // Setters with validation
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight!");
        }
    }

    void displayPatient() {
        System.out.println("Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient p = new Patient("Aman", 22, 55.5);

        // Valid updates
        p.setAge(23);
        p.setWeight(60.0);

        // Invalid updates
        p.setAge(-5);
        p.setWeight(-10);

        p.displayPatient();
    }
}


//Q8. Bank Account – Encapsulation, this and Local Variable
Filename: BankAccountMain.java
class BankAccount {
    private String accountNo;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNo, String accountHolderName,
                double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        // Local variable
        boolean success = false;

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            success = true;
        }

        if (success)
            System.out.println("Withdrawal successful");
        else
            System.out.println("Insufficient balance or invalid amount");
    }

    public double getBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account =
            new BankAccount("123456", "Rahul", 5000);

        account.deposit(2000);
        account.withdraw(1000);

        account.displayAccount();
    }
}


//Q9. Public Access Specifier
Filename: PublicAccessMain.java
class Hospital {
    // Public members can be accessed directly
    public String hospitalName;
    public String hospitalCode;

    public Hospital() {
        hospitalName = "City Hospital";
        hospitalCode = "H101";
    }

    public void displayHospital() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Hospital Code: " + hospitalCode);
    }
}

public class PublicAccessMain {
    public static void main(String[] args) {
        Hospital h = new Hospital();

        // Direct access to public variables
        System.out.println(h.hospitalName);
        System.out.println(h.hospitalCode);

        h.displayHospital();
    }
}


//Q10. Private Access Specifier
Filename: PrivateAccessMain.java
class Employee {
    // Private variables cannot be accessed directly outside this class
    private int employeeId;
    private String employeeName;
    private double salary;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    // Public getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

public class PrivateAccessMain {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Aman", 25000);

        System.out.println("ID: " + e.getEmployeeId());
        System.out.println("Name: " + e.getEmployeeName());
        System.out.println("Salary: " + e.getSalary());

        e.displayEmployee();

        // Not allowed:
        // System.out.println(e.salary);
    }
}


//Q11. Default Access Specifier
Filename: DefaultAccessMain.java
class Pharmacy {
    // Default/package-private variables
    String medicineName;
    double price;

    // Default/package-private constructor
    Pharmacy() {
        medicineName = "Paracetamol";
        price = 25.50;
    }

    // Default/package-private method
    void displayMedicine() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Price: " + price);
    }
}

public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy p = new Pharmacy();

        // Direct access because both classes are in same package
        System.out.println(p.medicineName);
        System.out.println(p.price);

        p.displayMedicine();
    }
}


//Q12. Protected Access Specifier
Filename: ProtectedAccessMain.java
class HospitalStaff {
    protected int staffId;
    protected String staffName;

    protected HospitalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }

    protected void displayStaff() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Staff Name: " + staffName);
    }
}

class Pharmacist extends HospitalStaff {
    private String licenseNo;

    Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        // Accessing inherited protected variables
        System.out.println("Staff ID: " + staffId);
        System.out.println("Staff Name: " + staffName);
        System.out.println("License Number: " + licenseNo);

        displayStaff();
    }
}

public class ProtectedAccessMain {
    public static void main(String[] args) {
        Pharmacist p =
            new Pharmacist(101, "Rahul", "LIC123");

        p.displayPharmacist();
    }
}


//Q13. Single Inheritance – Employee to Pharmacist
Filename: SingleInheritanceMain.java
// Super class
class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double salary;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

// Child class
class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(int employeeId, String employeeName,
               double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("License Number: " + licenseNo);
    }
}

public class SingleInheritanceMain {
    public static void main(String[] args) {
        Pharmacist p =
            new Pharmacist(101, "Aman", 30000, "LIC456");

        p.displayPharmacist();
    }
}


//Q14. Hierarchical Inheritance – Person to Doctor and Nurse
Filename: HierarchicalMain.java
// Super class
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// First child class
class Doctor extends Person {
    private String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayPerson();
        System.out.println("Specialization: " + specialization);
    }
}

// Second child class
class Nurse extends Person {
    private String ward;

    Nurse(String name, int age, String ward) {
        super(name, age);
        this.ward = ward;
    }

    void displayNurse() {
        displayPerson();
        System.out.println("Ward: " + ward);
    }
}

public class HierarchicalMain {
    public static void main(String[] args) {
        Doctor d = new Doctor("Rahul", 35, "Cardiology");
        Nurse n = new Nurse("Priya", 28, "Emergency");

        System.out.println("Doctor Details:");
        d.displayDoctor();

        System.out.println("\nNurse Details:");
        n.displayNurse();
    }
}


//Q15. Multilevel Inheritance – Person to Employee to Manager
Filename: MultilevelMain.java
// Level 1: Top-level super class
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Level 2: Employee is child of Person
// Employee is also parent of Manager
class Employee extends Person {
    private int employeeId;

    Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

// Level 3: Manager is child of Employee
class Manager extends Employee {
    private int teamSize;

    Manager(String name, int age, int employeeId, int teamSize) {
        super(name, age, employeeId);
        this.teamSize = teamSize;
    }

    void displayManager() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Team Size: " + teamSize);
    }
}

public class MultilevelMain {
    public static void main(String[] args) {
        Manager m = new Manager("Aman", 35, 101, 10);

        m.displayManager();
    }
}


Q//16. Protected Parent + Private Child Data
Filename: MedicalStaffMain.java
// Super class
class MedicalStaff {
    protected int staffId;
    protected String staffName;

    MedicalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }
}

// Child class 1
class Doctor extends MedicalStaff {
    private String specialization;

    Doctor(int staffId, String staffName, String specialization) {
        super(staffId, staffName);
        this.specialization = specialization;
    }

    void displayDoctor() {
        System.out.println("Doctor ID: " + staffId);
        System.out.println("Doctor Name: " + staffName);
        System.out.println("Specialization: " + specialization);
    }
}

// Child class 2
class Pharmacist extends MedicalStaff {
    private String licenseNo;

    Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        System.out.println("Pharmacist ID: " + staffId);
        System.out.println("Pharmacist Name: " + staffName);
        System.out.println("License Number: " + licenseNo);
    }
}

public class MedicalStaffMain {
    public static void main(String[] args) {
        Doctor d = new Doctor(101, "Rahul", "Heart Specialist");
        Pharmacist p = new Pharmacist(102, "Aman", "LIC789");

        d.displayDoctor();

        System.out.println();

        p.displayPharmacist();
    }
}


//Q17. Multiple and Hybrid Inheritance – Concept Only
Filename: InheritanceConceptMain.java
public class InheritanceConceptMain {
    public static void main(String[] args) {
        System.out.println("Multiple and Hybrid Inheritance Concepts");
        System.out.println("See the comments in the program.");
    }
}



//Q18. Shape Hierarchy – Parent Reference Array
Filename: ShapeMain.java
// Super class
class Shape {
    protected String name;

    Shape(String name) {
        this.name = name;
    }

    void displayShapeName() {
        System.out.println("Shape: " + name);
    }
}

// Child class 1
class Circle extends Shape {
    private double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

// Child class 2
class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

// Separate manager class
class ShapeManager {
    void displayAreas(Shape[] shapes) {
        // Local loop variable
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].displayShapeName();

            if (shapes[i] instanceof Circle) {
                Circle c = (Circle) shapes[i];
                System.out.println("Area: " + c.calculateArea());
            } else if (shapes[i] instanceof Rectangle) {
                Rectangle r = (Rectangle) shapes[i];
                System.out.println("Area: " + r.calculateArea());
            }

            System.out.println();
        }
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Circle", 5),
            new Rectangle("Rectangle", 10, 4)
        };

        ShapeManager manager = new ShapeManager();
        manager.displayAreas(shapes);
    }
}


//Q19. Hospital Staff Management – Integrated OOP
Filename: HospitalStaffMain.java
// Top-level super class
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Employee inherits Person
class Employee extends Person {
    private int employeeId;
    private double salary;

    static int employeeCount = 0;

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        setSalary(salary);
        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

// Doctor inherits Employee
class Doctor extends Employee {
    private String specialization;

    Doctor(String name, int age, int employeeId,
           double salary, String specialization) {
        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayEmployee();
        System.out.println("Specialization: " + specialization);
    }
}

// Pharmacist inherits Employee
class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(String name, int age, int employeeId,
               double salary, String licenseNo) {
        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("License Number: " + licenseNo);
    }
}

// Manager class for processing staff
class StaffManager {
    void displayStaff(Employee[] staff) {
        int doctorCount = 0;
        int pharmacistCount = 0;

        for (int i = 0; i < staff.length; i++) {
            if (staff[i] instanceof Doctor) {
                System.out.println("\nDoctor Details:");
                ((Doctor) staff[i]).displayDoctor();
                doctorCount++;
            } else if (staff[i] instanceof Pharmacist) {
                System.out.println("\nPharmacist Details:");
                ((Pharmacist) staff[i]).displayPharmacist();
                pharmacistCount++;
            }
        }

        System.out.println("\nTotal Employees: " + Employee.employeeCount);
        System.out.println("Doctors: " + doctorCount);
        System.out.println("Pharmacists: " + pharmacistCount);
    }
}

public class HospitalStaffMain {
    public static void main(String[] args) {
        Employee[] staff = {
            new Doctor("Rahul", 35, 101, 60000, "Cardiology"),
            new Pharmacist("Aman", 28, 102, 30000, "LIC123"),
            new Doctor("Priya", 32, 103, 55000, "Neurology")
        };

        StaffManager manager = new StaffManager();
        manager.displayStaff(staff);
    }
}


//Q20. Final Challenge – Pharmacy Employee Management System
Final Program
Filename: PharmacyEmployeeMain.java
// Super class
class Employee {
    // Private variables for encapsulation
    private int employeeId;
    private String employeeName;
    private double salary;

    // Shared class variable
    static int employeeCount = 0;

    // Protected member accessible through inheritance
    protected String branch = "Main Pharmacy";

    // Default access member
    String employmentType = "Permanent";

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        setSalary(salary);
        employeeCount++;
    }

    // Public getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    // Public setters
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary!");
        }
    }

    // Default access method
    void displayEmploymentType() {
        System.out.println("Employment Type: " + employmentType);
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Branch: " + branch);
    }
}

// Child class 1
class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(int employeeId, String employeeName,
               double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("License Number: " + licenseNo);
    }
}

// Child class 2
class StoreManager extends Employee {
    private int storeSection;

    StoreManager(int employeeId, String employeeName,
                 double salary, int storeSection) {
        super(employeeId, employeeName, salary);
        this.storeSection = storeSection;
    }

    void displayStoreManager() {
        displayEmployee();
        System.out.println("Store Section: " + storeSection);
    }
}

// Separate manager class
class EmployeeManager {

    void processEmployees(Employee[] employees) {
        // Local variables
        double totalSalary = 0;
        int pharmacistCount = 0;
        int managerCount = 0;

        for (int i = 0; i < employees.length; i++) {
            System.out.println("\nEmployee Details:");

            if (employees[i] instanceof Pharmacist) {
                ((Pharmacist) employees[i]).displayPharmacist();
                pharmacistCount++;
            } else if (employees[i] instanceof StoreManager) {
                ((StoreManager) employees[i]).displayStoreManager();
                managerCount++;
            }

            employees[i].displayEmploymentType();
            totalSalary += employees[i].getSalary();
        }

        System.out.println("\n--- Employee Summary ---");
        System.out.println("Total Employees: " + Employee.employeeCount);
        System.out.println("Pharmacists: " + pharmacistCount);
        System.out.println("Store Managers: " + managerCount);
        System.out.println("Total Salary: " + totalSalary);
    }
}

// Public Main class
public class PharmacyEmployeeMain {
    public static void main(String[] args) {

        // Parent reference array containing child objects
        Employee[] employees = {
            new Pharmacist(101, "Rahul", 30000, "LIC101"),
            new StoreManager(102, "Aman", 45000, 1),
            new Pharmacist(103, "Priya", 32000, "LIC103"),
            new StoreManager(104, "Karan", 50000, 2)
        };

        EmployeeManager manager = new EmployeeManager();
        manager.processEmployees(employees);
    }
}
