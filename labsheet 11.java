//Q1. Student Registration Form – AWT
import java.awt.*;
import java.awt.event.*;

public class Main extends Frame implements ActionListener {
    TextField name, roll, course;
    Choice semester;
    Checkbox male, female;
    CheckboxGroup gender;
    Button submit, reset;
    TextArea output;

    Main() {
        setTitle("Student Registration Form");
        setSize(450, 450);
        setLayout(new BorderLayout());

        Panel form = new Panel(new GridLayout(6, 2, 10, 10));

        form.add(new Label("Student Name:"));
        name = new TextField();
        form.add(name);

        form.add(new Label("Roll Number:"));
        roll = new TextField();
        form.add(roll);

        form.add(new Label("Course:"));
        course = new TextField();
        form.add(course);

        form.add(new Label("Gender:"));
        gender = new CheckboxGroup();
        Panel genderPanel = new Panel();
        male = new Checkbox("Male", gender, false);
        female = new Checkbox("Female", gender, false);
        genderPanel.add(male);
        genderPanel.add(female);
        form.add(genderPanel);

        form.add(new Label("Semester:"));
        semester = new Choice();
        semester.add("First");
        semester.add("Second");
        semester.add("Third");
        semester.add("Fourth");
        semester.add("Fifth");
        semester.add("Sixth");
        form.add(semester);

        submit = new Button("Submit");
        reset = new Button("Reset");

        form.add(submit);
        form.add(reset);

        add(form, BorderLayout.NORTH);

        output = new TextArea();
        output.setEditable(false);
        add(output, BorderLayout.CENTER);

        submit.addActionListener(this);
        reset.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String g = "Not selected";

            if (gender.getSelectedCheckbox() != null) {
                g = gender.getSelectedCheckbox().getLabel();
            }

            output.setText(
                "Student Name: " + name.getText() +
                "\nRoll Number: " + roll.getText() +
                "\nCourse: " + course.getText() +
                "\nGender: " + g +
                "\nSemester: " + semester.getSelectedItem()
            );
        }

        if (e.getSource() == reset) {
            name.setText("");
            roll.setText("");
            course.setText("");
            gender.setSelectedCheckbox(null);
            semester.select(0);
            output.setText("");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}


//Q2. Simple Calculator – AWT
import java.awt.*;
import java.awt.event.*;

public class Main extends Frame implements ActionListener {
    TextField num1, num2;
    Label result;
    Button add, sub, mul, div;

    Main() {
        setTitle("AWT Calculator");
        setSize(350, 300);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new Label("First Number:"));
        num1 = new TextField();
        add(num1);

        add(new Label("Second Number:"));
        num2 = new TextField();
        add(num2);

        add = new Button("Addition");
        sub = new Button("Subtraction");
        mul = new Button("Multiplication");
        div = new Button("Division");

        add(add);
        add(sub);
        add(mul);
        add(div);

        result = new Label("Result: ");
        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            double ans = 0;

            if (e.getSource() == add) {
                ans = a + b;
            } else if (e.getSource() == sub) {
                ans = a - b;
            } else if (e.getSource() == mul) {
                ans = a * b;
            } else if (e.getSource() == div) {
                if (b == 0) {
                    result.setText("Cannot divide by zero");
                    return;
                }
                ans = a / b;
            }

            result.setText("Result: " + ans);

        } catch (NumberFormatException ex) {
            result.setText("Enter valid numbers");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}


//Q3. Student Login Form – Swing
Demo username: admin
Demo password: 1234
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    JTextField username;
    JPasswordField password;
    JButton login, reset;

    Main() {
        setTitle("Student Login Form");
        setSize(350, 220);
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("Username:"));
        username = new JTextField();
        add(username);

        add(new JLabel("Password:"));
        password = new JPasswordField();
        add(password);

        login = new JButton("Login");
        reset = new JButton("Reset");

        add(login);
        add(reset);

        login.addActionListener(this);
        reset.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            String user = username.getText();
            String pass = new String(password.getPassword());

            if (user.equals("admin") && pass.equals("1234")) {
                JOptionPane.showMessageDialog(this,
                        "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(this,
                        "Invalid Username or Password");
            }
        }

        if (e.getSource() == reset) {
            username.setText("");
            password.setText("");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}


//Q4. Student Marksheet GUI – Swing
Grade rule used: A+ = 90% or above, A = 80–89%, B = 70–79%, C = 60–69%, D = 50–59%, F = below 50%. A student must score at least 40 in every subject to pass.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    JTextField english, maths, java, dbms, networks;
    JButton calculate;

    Main() {
        setTitle("Student Marksheet");
        setSize(400, 350);
        setLayout(new GridLayout(7, 2, 10, 10));

        add(new JLabel("English:"));
        english = new JTextField();
        add(english);

        add(new JLabel("Mathematics:"));
        maths = new JTextField();
        add(maths);

        add(new JLabel("Java:"));
        java = new JTextField();
        add(java);

        add(new JLabel("DBMS:"));
        dbms = new JTextField();
        add(dbms);

        add(new JLabel("Computer Networks:"));
        networks = new JTextField();
        add(networks);

        calculate = new JButton("Calculate Result");
        add(calculate);

        calculate.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(english.getText());
            int b = Integer.parseInt(maths.getText());
            int c = Integer.parseInt(java.getText());
            int d = Integer.parseInt(dbms.getText());
            int f = Integer.parseInt(networks.getText());

            if (a < 0 || a > 100 || b < 0 || b > 100 ||
                c < 0 || c > 100 || d < 0 || d > 100 ||
                f < 0 || f > 100) {
                JOptionPane.showMessageDialog(this,
                        "Marks must be between 0 and 100.");
                return;
            }

            int total = a + b + c + d + f;
            double percentage = total / 5.0;

            boolean pass = a >= 40 && b >= 40 && c >= 40
                        && d >= 40 && f >= 40;

            String grade;

            if (!pass)
                grade = "F";
            else if (percentage >= 90)
                grade = "A+";
            else if (percentage >= 80)
                grade = "A";
            else if (percentage >= 70)
                grade = "B";
            else if (percentage >= 60)
                grade = "C";
            else if (percentage >= 50)
                grade = "D";
            else
                grade = "F";

            String status = pass ? "PASS" : "FAIL";

            JOptionPane.showMessageDialog(this,
                    "Total Marks: " + total +
                    "\nPercentage: " + percentage + "%" +
                    "\nGrade: " + grade +
                    "\nResult: " + status);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid marks in all fields.");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}


//Q5. Course Selection Form – Swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    JTextField name;
    JComboBox<String> course;
    JRadioButton male, female;
    JCheckBox java, python, dbms, html;
    JButton submit, reset;

    Main() {
        setTitle("Course Selection Form");
        setSize(450, 400);
        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("Student Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Course:"));
        course = new JComboBox<>(
                new String[]{"BCA", "BBA", "B.Tech", "MCA"});
        add(course);

        add(new JLabel("Gender:"));

        JPanel genderPanel = new JPanel();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        genderPanel.add(male);
        genderPanel.add(female);
        add(genderPanel);

        add(new JLabel("Select Subjects:"));

        JPanel subjectPanel = new JPanel();
        java = new JCheckBox("Java");
        python = new JCheckBox("Python");
        dbms = new JCheckBox("DBMS");
        html = new JCheckBox("HTML");

        subjectPanel.add(java);
        subjectPanel.add(python);
        subjectPanel.add(dbms);
        subjectPanel.add(html);
        add(subjectPanel);

        submit = new JButton("Submit");
        reset = new JButton("Reset");

        add(submit);
        add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String gender = "Not selected";

            if (male.isSelected())
                gender = "Male";
            else if (female.isSelected())
                gender = "Female";

            String subjects = "";

            if (java.isSelected()) subjects += "Java ";
            if (python.isSelected()) subjects += "Python ";
            if (dbms.isSelected()) subjects += "DBMS ";
            if (html.isSelected()) subjects += "HTML ";

            JOptionPane.showMessageDialog(this,
                    "Name: " + name.getText() +
                    "\nCourse: " + course.getSelectedItem() +
                    "\nGender: " + gender +
                    "\nSubjects: " + subjects);
        }

        if (e.getSource() == reset) {
            name.setText("");
            course.setSelectedIndex(0);

            male.setSelected(false);
            female.setSelected(false);

            java.setSelected(false);
            python.setSelected(false);
            dbms.setSelected(false);
            html.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}


//Q6. Employee Registration Form – AWT
import java.awt.*;
import java.awt.event.*;

public class Main extends Frame implements ActionListener {
    TextField id, name, designation, salary;
    Choice department;
    Checkbox male, female;
    CheckboxGroup gender;
    Button submit, clear;
    TextArea output;

    Main() {
        setTitle("Employee Registration Form");
        setSize(500, 500);
        setLayout(new BorderLayout());

        Panel form = new Panel(new GridLayout(7, 2, 10, 10));

        form.add(new Label("Employee ID:"));
        id = new TextField();
        form.add(id);

        form.add(new Label("Employee Name:"));
        name = new TextField();
        form.add(name);

        form.add(new Label("Department:"));
        department = new Choice();
        department.add("IT");
        department.add("HR");
        department.add("Finance");
        department.add("Marketing");
        department.add("Sales");
        form.add(department);

        form.add(new Label("Designation:"));
        designation = new TextField();
        form.add(designation);

        form.add(new Label("Salary:"));
        salary = new TextField();
        form.add(salary);

        form.add(new Label("Gender:"));
        Panel genderPanel = new Panel();

        gender = new CheckboxGroup();
        male = new Checkbox("Male", gender, false);
        female = new Checkbox("Female", gender, false);

        genderPanel.add(male);
        genderPanel.add(female);
        form.add(genderPanel);

        submit = new Button("Submit");
        clear = new Button("Clear");

        form.add(submit);
        form.add(clear);

        add(form, BorderLayout.NORTH);

        output = new TextArea();
        output.setEditable(false);
        add(output, BorderLayout.CENTER);

        submit.addActionListener(this);
        clear.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            try {
                String employeeId = id.getText().trim();
                String employeeName = name.getText().trim();
                String employeeDesignation = designation.getText().trim();
                double employeeSalary =
                        Double.parseDouble(salary.getText());

                if (employeeId.isEmpty() || employeeName.isEmpty()
                        || employeeDesignation.isEmpty()
                        || employeeSalary < 0) {
                    output.setText("Enter valid employee details.");
                    return;
                }

                String g = "Not selected";

                if (gender.getSelectedCheckbox() != null) {
                    g = gender.getSelectedCheckbox().getLabel();
                }

                output.setText(
                    "Employee ID: " + employeeId +
                    "\nName: " + employeeName +
                    "\nDepartment: " + department.getSelectedItem() +
                    "\nDesignation: " + employeeDesignation +
                    "\nSalary: " + employeeSalary +
                    "\nGender: " + g
                );

            } catch (NumberFormatException ex) {
                output.setText("Please enter a valid salary.");
            }
        }

        if (e.getSource() == clear) {
            id.setText("");
            name.setText("");
            designation.setText("");
            salary.setText("");
            department.select(0);
            gender.setSelectedCheckbox(null);
            output.setText("");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}


//Q7. Temperature Converter – Swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    JTextField temperature;
    JRadioButton cToF, fToC;
    JButton convert, clear;
    JLabel result;

    Main() {
        setTitle("Temperature Converter");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("Enter Temperature:"));
        temperature = new JTextField();
        add(temperature);

        cToF = new JRadioButton("Celsius to Fahrenheit", true);
        fToC = new JRadioButton("Fahrenheit to Celsius");

        ButtonGroup group = new ButtonGroup();
        group.add(cToF);
        group.add(fToC);

        add(cToF);
        add(fToC);

        convert = new JButton("Convert");
        clear = new JButton("Clear");

        add(convert);
        add(clear);

        result = new JLabel("Result: ");
        add(result);

        convert.addActionListener(this);
        clear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convert) {
            try {
                double value =
                        Double.parseDouble(temperature.getText());

                if (cToF.isSelected()) {
                    double f = (value * 9 / 5) + 32;
                    result.setText("Fahrenheit: " + f);
                } else {
                    double c = (value - 32) * 5 / 9;
                    result.setText("Celsius: " + c);
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Please enter a valid temperature.");
            }
        }

        if (e.getSource() == clear) {
            temperature.setText("");
            cToF.setSelected(true);
            result.setText("Result: ");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}


//Q8. Simple Notepad – Swing
This program supports creating a new document, opening a text file, saving changes and exiting the application.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;

public class Main extends JFrame implements ActionListener {
    JTextArea textArea;
    JMenuItem newItem, openItem, saveItem, exitItem;
    File currentFile = null;

    Main() {
        setTitle("Simple Notepad");
        setSize(600, 450);

        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));

        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newItem) {
            textArea.setText("");
            currentFile = null;
            setTitle("Simple Notepad");
        }

        if (e.getSource() == openItem) {
            JFileChooser chooser = new JFileChooser();

            int choice = chooser.showOpenDialog(this);

            if (choice == JFileChooser.APPROVE_OPTION) {
                try {
                    currentFile = chooser.getSelectedFile();

                    String content = Files.readString(
                            currentFile.toPath());

                    textArea.setText(content);
                    setTitle(currentFile.getName());

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                            "Unable to open file.");
                }
            }
        }

        if (e.getSource() == saveItem) {
            if (currentFile == null) {
                JFileChooser chooser = new JFileChooser();

                int choice = chooser.showSaveDialog(this);

                if (choice == JFileChooser.APPROVE_OPTION) {
                    currentFile = chooser.getSelectedFile();
                } else {
                    return;
                }
            }

            try {
                Files.writeString(
                        currentFile.toPath(),
                        textArea.getText());

                JOptionPane.showMessageDialog(this,
                        "File saved successfully.");

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,
                        "Unable to save file.");
            }
        }

        if (e.getSource() == exitItem) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}


//Q9. Student Feedback Form – Swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    JTextField name, roll, course;
    JRadioButton excellent, veryGood, good, average, poor;
    JCheckBox teaching, laboratory, material, assignments;
    JTextArea comments;
    JButton submit, reset;
    ButtonGroup ratingGroup;

    Main() {
        setTitle("Student Feedback Form");
        setSize(500, 600);
        setLayout(new GridLayout(8, 2, 8, 8));

        add(new JLabel("Student Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Roll Number:"));
        roll = new JTextField();
        add(roll);

        add(new JLabel("Course:"));
        course = new JTextField();
        add(course);

        add(new JLabel("Rating:"));

        JPanel ratingPanel = new JPanel();
        excellent = new JRadioButton("Excellent");
        veryGood = new JRadioButton("Very Good");
        good = new JRadioButton("Good");
        average = new JRadioButton("Average");
        poor = new JRadioButton("Poor");

        ratingGroup = new ButtonGroup();
        ratingGroup.add(excellent);
        ratingGroup.add(veryGood);
        ratingGroup.add(good);
        ratingGroup.add(average);
        ratingGroup.add(poor);

        ratingPanel.add(excellent);
        ratingPanel.add(veryGood);
        ratingPanel.add(good);
        ratingPanel.add(average);
        ratingPanel.add(poor);

        add(ratingPanel);

        add(new JLabel("Feedback Topics:"));

        JPanel feedbackPanel = new JPanel();
        teaching = new JCheckBox("Teaching");
        laboratory = new JCheckBox("Laboratory");
        material = new JCheckBox("Course Material");
        assignments = new JCheckBox("Assignments");

        feedbackPanel.add(teaching);
        feedbackPanel.add(laboratory);
        feedbackPanel.add(material);
        feedbackPanel.add(assignments);

        add(feedbackPanel);

        add(new JLabel("Comments:"));
        comments = new JTextArea(4, 20);
        add(new JScrollPane(comments));

        submit = new JButton("Submit");
        reset = new JButton("Reset");

        add(submit);
        add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String rating = "Not selected";

            if (excellent.isSelected()) rating = "Excellent";
            else if (veryGood.isSelected()) rating = "Very Good";
            else if (good.isSelected()) rating = "Good";
            else if (average.isSelected()) rating = "Average";
            else if (poor.isSelected()) rating = "Poor";

            String topics = "";

            if (teaching.isSelected()) topics += "Teaching, ";
            if (laboratory.isSelected()) topics += "Laboratory, ";
            if (material.isSelected()) topics += "Course Material, ";
            if (assignments.isSelected()) topics += "Assignments, ";

            if (topics.isEmpty()) {
                topics = "None selected";
            }

            String feedback =
                    "Student Name: " + name.getText() +
                    "\nRoll Number: " + roll.getText() +
                    "\nCourse: " + course.getText() +
                    "\nRating: " + rating +
                    "\nFeedback Topics: " + topics +
                    "\nComments: " + comments.getText();

            JOptionPane.showMessageDialog(this, feedback);
        }

        if (e.getSource() == reset) {
            name.setText("");
            roll.setText("");
            course.setText("");
            ratingGroup.clearSelection();

            teaching.setSelected(false);
            laboratory.setSelected(false);
            material.setSelected(false);
            assignments.setSelected(false);

            comments.setText("");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}


//Q10. Mini Banking GUI Application – Swing
This example starts with a demo balance of ₹5,000. Deposits and withdrawals update the balance. Withdrawals are allowed only when sufficient balance is available.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    JTextField account, name, balanceField, amount;
    JButton deposit, withdraw, check, clear;

    double balance = 5000.0;

    Main() {
        setTitle("Mini Banking Application");
        setSize(400, 350);
        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("Account Number:"));
        account = new JTextField();
        add(account);

        add(new JLabel("Customer Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Current Balance:"));
        balanceField = new JTextField("5000.0");
        balanceField.setEditable(false);
        add(balanceField);

        add(new JLabel("Amount:"));
        amount = new JTextField();
        add(amount);

        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        check = new JButton("Check Balance");
        clear = new JButton("Clear");

        add(deposit);
        add(withdraw);
        add(check);
        add(clear);

        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        check.addActionListener(this);
        clear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            account.setText("");
            name.setText("");
            amount.setText("");
            balanceField.setText(String.valueOf(balance));
            return;
        }

        if (e.getSource() == check) {
            JOptionPane.showMessageDialog(this,
                    "Current Balance: Rs. " + balance);
            return;
        }

        if (account.getText().trim().isEmpty()
                || name.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Enter account number and customer name.");
            return;
        }

        try {
            double value = Double.parseDouble(amount.getText());

            if (value <= 0) {
                JOptionPane.showMessageDialog(this,
                        "Amount must be greater than zero.");
                return;
            }

            if (e.getSource() == deposit) {
                balance = balance + value;

                JOptionPane.showMessageDialog(this,
                        "Amount deposited successfully.");
            }

            else if (e.getSource() == withdraw) {
                if (value <= balance) {
                    balance = balance - value;

                    JOptionPane.showMessageDialog(this,
                            "Amount withdrawn successfully.");
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Insufficient balance.");
                }
            }

            balanceField.setText(String.valueOf(balance));
            amount.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a valid amount.");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
