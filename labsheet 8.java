
//Q1. Student Record — Class and Object
class Student {
    String name;
    int rollNo;
    double marks;

    // No-argument constructor
    Student() {
        name = "Alex Vance";
        rollNo = 101;
        marks = 88.5;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails();
    }
}

//Q2. Medicine — Parameterized Constructor and 'this'

  {
    String medicineName;
    String batchNo;
     price;

    Medicine(String medicineName, String batchNo,  price) {
        .medicineName = medicineName;
        .batchNo = batchNo;
        .price = price;
    }

     displayMedicine() {
        System.out.println( + medicineName +  + batchNo +  + price);
    }
}

  {
     main(String[] args) {
         m1 =  (, , );
         m2 =  (, , );
        m1.displayMedicine();
        m2.displayMedicine();
    }
}

Q3. Pharmacy — Instance and Class Variables

  {
    String pharmacyName;
    String location;
     pharmacyCount = ; 

    Pharmacy(String pharmacyName, String location) {
        .pharmacyName = pharmacyName;
        .location = location;
        pharmacyCount++; 
    }

     displayPharmacy() {
        System.out.println( + pharmacyName +  + location);
    }

     displayPharmacyCount() {
        System.out.println( + pharmacyCount);
    }
}

  {
     main(String[] args) {
         p1 =  (, );
         p2 =  (, );
         p3 =  (, );

        p1.displayPharmacy();
        p2.displayPharmacy();
        p3.displayPharmacy();
        .displayPharmacyCount();
    }
}


//Q4. Patient Records — Object Array, Loop, and Local Variable
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
        System.out.println("ID: " + patientId + " | Name: " + patientName + " | Age: " + age);
    }
}

class PatientManager {
    void displayAllPatients(Patient[] patients) {
        for (int i = 0; i < patients.length; i++) { // Local loop variable i
            patients[i].displayPatient();
        }
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient[] plist = {
            new Patient(1, "John", 34), new Patient(2, "Sarah", 28),
            new Patient(3, "Michael", 52), new Patient(4, "Emma", 19),
            new Patient(5, "David", 65)
        };
        PatientManager manager = new PatientManager();
        manager.displayAllPatients(plist);
    }
}

//Q5. Medicine Eligibility — Method and Local Variable

  {
    String medicineName;
     ageLimit;

    Medicine(String medicineName,  ageLimit) {
        .medicineName = medicineName;
        .ageLimit = ageLimit;
    }

    String checkEligibility( patientAge) {
        String result; 
         (patientAge >= ageLimit) {
            result = ;
        }  {
            result = ;
        }
         result;
    }
}

  {
     main(String[] args) {
         med =  (, );
        System.out.println( + med.checkEligibility());
        System.out.println( + med.checkEligibility());
    }
}

//Q6. Encapsulated Medicine Product

  {
     String medicineName;
     String batchNo;
      price;

    MedicineProduct(String medicineName, String batchNo,  price) {
        .medicineName = medicineName;
        .batchNo = batchNo;
        .price = price;
    }

     String getMedicineName() {  medicineName; }
     setMedicineName(String medicineName) { .medicineName = medicineName; }
     String getBatchNo() {  batchNo; }
     setBatchNo(String batchNo) { .batchNo = batchNo; }
     getPrice() {  price; }
     setPrice( price) { .price = price; }

     displayProduct() {
        System.out.println( + medicineName +  + batchNo +  + price);
    }
}

  {
     main(String[] args) {
         product =  (, , );
        product.setPrice(); 
        System.out.println( + product.getMedicineName()); 
        product.displayProduct();
    }
}

//Q7. Encapsulated Patient — Validation
class Patient {
    private String patientName;
    private int age;
    private double weight;

    public Patient(String patientName, int age, double weight) {
        this.patientName = patientName;
        setAge(age);
        setWeight(weight);
    }

    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }
    public int getAge() { return age; }
    public void setAge(int age) {
        if (age >= 0) { this.age = age; } 
        else { System.out.println("Invalid Age!"); }
    }
    public double getWeight() { return weight; }
    public void setWeight(double weight) {
        if (weight > 0) { this.weight = weight; } 
        else { System.out.println("Invalid Weight!"); }
    }

    public void displayPatient() {
        System.out.println("Name: " + patientName + " | Age: " + age + " | Weight: " + weight + "kg");
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient p = new Patient("Alice", 25, 62.0);
        p.setAge(-5);   // Invalid update - rejected
        p.setWeight(65.5); // Valid update - accepted
        p.displayPatient();
    }
}

//Q8. Bank Account — Encapsulation, 'this' and Local Variable

  {
     String accountNo;
     String accountHolderName;
     balance;

     BankAccount(String accountNo, String accountHolderName,  balance) {
        .accountNo = accountNo;
        .accountHolderName = accountHolderName;
        .balance = balance;
    }

     deposit( amount) {
         (amount > ) balance += amount;
    }

     withdraw( amount) {
         success; 
         (amount >  && amount <= balance) {
            balance -= amount;
            success = ;
        }  {
            success = ;
        }
        System.out.println( + (success ?  : ));
    }

     getBalance() {  balance; }
     displayAccount() {
        System.out.println( + accountNo +  + accountHolderName +  + balance);
    }
}

  {
     main(String[] args) {
         acc =  (, , );
        acc.deposit();
        acc.withdraw(); 
        acc.withdraw(); 
        acc.displayAccount();
    }
}

//Q9. Public Access Specifier

  {
    
     String hospitalName;
     String hospitalCode;

     Hospital() {
        hospitalName = ;
        hospitalCode = ;
    }

     displayHospital() {
        System.out.println( + hospitalName +  + hospitalCode);
    }
}

  {
     main(String[] args) {
         h =  ();
        
        h.hospitalName = ;
        System.out.println( + h.hospitalCode);
        h.displayHospital();
    }
}

//Q10. Private Access Specifier

  {
     employeeId;
     String employeeName;
     salary;

     Employee( employeeId, String employeeName,  salary) {
        .employeeId = employeeId;
        .employeeName = employeeName;
        .salary = salary;
    }

     getEmployeeId() {  employeeId; }
     String getEmployeeName() {  employeeName; }
     getSalary() {  salary; }

     displayEmployee() {
        System.out.println( + employeeId +  + employeeName +  + salary);
    }
}

  {
     main(String[] args) {
         emp =  (, , );
        
        System.out.println( + emp.getEmployeeName());
        emp.displayEmployee();
    }
}

Q11. Default (Package-Private) Access Specifier

  {
    
    String medicineName;
     price;

    Pharmacy() {
        medicineName = ;
        price = ;
    }

     displayMedicine() {
        System.out.println( + medicineName +  + price);
    }
}

  {
     main(String[] args) {
         p =  ();
        
        p.medicineName = ;
        p.displayMedicine();
    }
}


//Q12. Protected Access Specifier

  {
     staffId;
     String staffName;

     HospitalStaff( staffId, String staffName) {
        .staffId = staffId;
        .staffName = staffName;
    }

     displayStaff() {
        System.out.println( + staffId +  + staffName);
    }
}

    {
     String licenseNo;

     Pharmacist( staffId, String staffName, String licenseNo) {
        (staffId, staffName);
        .licenseNo = licenseNo;
    }

     showDetails() {
        
        System.out.println( + staffId +  + staffName +  + licenseNo);
    }
}

  {
     main(String[] args) {
         ph =  (, , );
        ph.showDetails();
    }
}


//Q13. Single Inheritance — Employee → Pharmacist Demonstrates single-level inheritance and base constructor invocation using super().
class Employee { // Super Class
    protected int employeeId;
    protected String employeeName;
    protected double salary;

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Emp ID: " + employeeId + " | Name: " + employeeName + " | Salary: $" + salary);
    }
}

class Pharmacist extends Employee { // Child Class
    private String licenseNo;

    public Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    public void displayPharmacist() {
        displayEmployee();
        System.out.println("License Number: " + licenseNo);
    }
}

public class SingleInheritanceMain {
    public static void main(String[] args) {
        Pharmacist p = new Pharmacist(101, "Jane Doe", 62000.0, "PH-9002");
        p.displayPharmacist();
    }
}

//Q14. Hierarchical Inheritance — Person → Doctor & Nurse Demonstrates multiple subclasses branching off a single common superclass.
  { 
     String name;
     age;

     Person(String name,  age) {
        .name = name;
        .age = age;
    }
}

    { 
     String specialization;

     Doctor(String name,  age, String specialization) {
        (name, age);
        .specialization = specialization;
    }

     displayDoctor() {
        System.out.println( + name +  + age +  + specialization);
    }
}

    { 
     String ward;

     Nurse(String name,  age, String ward) {
        (name, age);
        .ward = ward;
    }

     displayNurse() {
        System.out.println( + name +  + age +  + ward);
    }
}

  {
     main(String[] args) {
         d =  (, , );
         n =  (, , );
        d.displayDoctor();
        n.displayNurse();
    }
}
//Q15. Multilevel Inheritance — Person → Employee → Manager

class Person { // Level 1 Super Class
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person { // Level 2 Intermediate Class
    private int employeeId;

    public Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() { return employeeId; }
}

class Manager extends Employee { // Level 3 Final Child Class
    private int teamSize;

    public Manager(String name, int age, int employeeId, int teamSize) {
        super(name, age, employeeId);
        this.teamSize = teamSize;
    }

    public void displayManager() {
        System.out.println("Manager: " + name + " | Age: " + age + " | ID: " + getEmployeeId() + " | Team Size: " + teamSize);
    }
}

public class MultilevelMain {
    public static void main(String[] args) {
        Manager m = new Manager("Arthur", 42, 3001, 12);
        m.displayManager();
    }
}

//Q16. Protected Parent + Private Child Data Contrasts inheritance accessibility between protected parent fields and private child fields.
class MedicalStaff {
    protected int staffId;
    protected String staffName;

    public MedicalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }
}

class Doctor extends MedicalStaff {
    private String specialization;

    public Doctor(int staffId, String staffName, String specialization) {
        super(staffId, staffName);
        this.specialization = specialization;
    }

    public void displayDoctor() {
        // staffId & staffName directly accessed (protected); specialization is private to child
        System.out.println("Doc ID: " + staffId + " | Name: " + staffName + " | Spec: " + specialization);
    }
}

class Pharmacist extends MedicalStaff {
    private String licenseNo;

    public Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }

    public void displayPharmacist() {
        System.out.println("Pharm ID: " + staffId + " | Name: " + staffName + " | License: " + licenseNo);
    }
}

public class MedicalStaffMain {
    public static void main(String[] args) {
        Doctor d = new Doctor(11, "Dr. Stone", "Neurology");
        Pharmacist p = new Pharmacist(12, "Frank", "PH-404");
        d.displayDoctor();
        p.displayPharmacist();
    }
}

//Q18. Shape Hierarchy — Parent Reference Array

  {
     String name;

     Shape(String name) { .name = name; }
     displayShapeName() { System.out.println( + name); }
}

    {
     radius;

     Circle(String name,  radius) {
        (name);
        .radius = radius;
    }
     calculateArea() {  Math.PI * radius * radius; }
}

    {
     length, width;

     Rectangle(String name,  length,  width) {
        (name);
        .length = length;
        .width = width;
    }
     calculateArea() {  length * width; }
}

  {
     displayAreas([] shapes) {
         ( i = ; i < shapes.length; i++) {
            shapes[i].displayShapeName();
             (shapes[i]  ) {
                 c = () shapes[i];
                System.out.println( + c.calculateArea());
            }  (shapes[i]  ) {
                 r = () shapes[i];
                System.out.println( + r.calculateArea());
            }
        }
    }
}

  {
     main(String[] args) {
        [] shapes = {  (, ),  (, , ) };
         manager =  ();
        manager.displayAreas(shapes);
    }
}

//Q19. Hospital Staff Management — Integrated OOP
  {
     String name;
     age;
     Person(String name,  age) { .name = name; .age = age; }
}

    {
     employeeId;
     salary;
     employeeCount = ;

     Employee(String name,  age,  employeeId,  salary) {
        (name, age);
        .employeeId = employeeId;
        .salary = salary;
        employeeCount++;
    }
     getEmployeeId() {  employeeId; }
     getSalary() {  salary; }
}

    {
     String specialization;
     Doctor(String name,  age,  employeeId,  salary, String specialization) {
        (name, age, employeeId, salary);
        .specialization = specialization;
    }
     String getSpecialization() {  specialization; }
}

    {
     String licenseNo;
     Pharmacist(String name,  age,  employeeId,  salary, String licenseNo) {
        (name, age, employeeId, salary);
        .licenseNo = licenseNo;
    }
     String getLicenseNo() {  licenseNo; }
}

  {
     processStaff([] staff) {
         ( i = ; i < staff.length; i++) {
             (staff[i]  ) {
                 d = () staff[i];
                System.out.println( + d.getEmployeeId() +  + d.getSpecialization());
            }  (staff[i]  ) {
                 p = () staff[i];
                System.out.println( + p.getEmployeeId() +  + p.getLicenseNo());
            }
        }
    }
}

  {
     main(String[] args) {
        [] staff = {
             (, , , , ),
             (, , , , )
        };
         processor =  ();
        processor.processStaff(staff);
        System.out.println( + .employeeCount);
    }
}

//Q20. Final Challenge — Pharmacy Employee Management System

  {
     employeeId;
     String employeeName;
     salary;
     totalEmployees = ;

     Employee( employeeId, String employeeName,  salary) {
        .employeeId = employeeId;
        .employeeName = employeeName;
        setSalary(salary);
        totalEmployees++;
    }

     getEmployeeId() {  employeeId; }
     String getEmployeeName() {  employeeName; }
     getSalary() {  salary; }
     setSalary( salary) {
         (salary >= ) .salary = salary;
    }
     getTotalEmployees() {  totalEmployees; }
}

    {
     String prescriptionLicense;

     Pharmacist( employeeId, String employeeName,  salary, String prescriptionLicense) {
        (employeeId, employeeName, salary);
        .prescriptionLicense = prescriptionLicense;
    }
     String getPrescriptionLicense() {  prescriptionLicense; }
}

    {
     monthlyBonus;

     StoreManager( employeeId, String employeeName,  salary,  monthlyBonus) {
        (employeeId, employeeName, salary);
        .monthlyBonus = monthlyBonus;
    }
     getMonthlyBonus() {  monthlyBonus; }
}

  {
     generatePayrollReport([] employees) {
        System.out.println();
         ( i = ; i < employees.length; i++) {
             e = employees[i];
             payout = e.getSalary();
            String role = ;

             (e  ) {
                role =  + (() e).getPrescriptionLicense() + ;
            }  (e  ) {
                 m = () e;
                payout += m.getMonthlyBonus();
                role = ;
            }
            System.out.println( + e.getEmployeeId() +  + e.getEmployeeName() +
                                + role +  + payout);
        }
        System.out.println( + .getTotalEmployees());
    }
}

  {
     main(String[] args) {
        [] team = {
             (, , , ),
             (, , , )
        };
         sys =  ();
        sys.generatePayrollReport(team);
    }
}
