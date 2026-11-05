//Q1. Student List – ArrayList
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Aman");
        students.add("Rahul");
        students.add("Priya");
        students.add("Neha");
        students.add("Rohit");
        students.add("Ankit");
        students.add("Simran");
        students.add("Karan");
        students.add("Pooja");
        students.add("Vikas");

        System.out.println("Student Names:");

        for (String name : students) {
            System.out.println(name);
        }

        System.out.println("Total Students: " + students.size());
    }
}


//Q2. Marks List – get()
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(75);
        marks.add(80);
        marks.add(65);
        marks.add(90);
        marks.add(85);

        System.out.println("First Mark: " + marks.get(0));
        System.out.println("Middle Mark: " + marks.get(2));
        System.out.println("Last Mark: " + marks.get(4));
    }
}


//Q3. Update Student Name – set() and remove()
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Aman");
        students.add("Rahul");
        students.add("Priya");
        students.add("Neha");
        students.add("Rohit");

        students.set(1, "Karan");
        students.remove(3);

        System.out.println("Updated Student List: " + students);
    }
}


//Q4. Unique Departments – HashSet
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> departments = new HashSet<>();

        departments.add("Computer Science");
        departments.add("Management");
        departments.add("IT");
        departments.add("Computer Science");
        departments.add("Commerce");
        departments.add("IT");

        System.out.println("Unique Departments:");

        for (String department : departments) {
            System.out.println(department);
        }
    }
}


//Q5. Sorted Roll Numbers – TreeSet
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> rollNumbers = new TreeSet<>();

        rollNumbers.add(105);
        rollNumbers.add(102);
        rollNumbers.add(110);
        rollNumbers.add(101);
        rollNumbers.add(108);
        rollNumbers.add(104);
        rollNumbers.add(109);
        rollNumbers.add(103);
        rollNumbers.add(107);
        rollNumbers.add(106);

        System.out.println("Sorted Roll Numbers:");

        for (int roll : rollNumbers) {
            System.out.println(roll);
        }
    }
}


//Q6. ArrayList Searching – contains()
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("HTML");
        courses.add("Database");

        System.out.print("Enter course name: ");
        String course = sc.nextLine();

        if (courses.contains(course)) {
            System.out.println("Course is available.");
        } else {
            System.out.println("Course is not available.");
        }
    }
}


//Q7. Collections Utility Methods
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(40);
        numbers.add(20);
        numbers.add(50);
        numbers.add(20);
        numbers.add(10);

        System.out.println("Original List: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        System.out.println("Maximum: " +
                Collections.max(numbers));

        System.out.println("Minimum: " +
                Collections.min(numbers));

        System.out.println("Frequency of 20: " +
                Collections.frequency(numbers, 20));
    }
}


//Q8. LinkedList Student Queue
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        students.addFirst("Aman");
        students.addLast("Rahul");
        students.addLast("Priya");
        students.addFirst("Neha");

        System.out.println("Student Queue: " + students);

        students.removeFirst();
        System.out.println("After removeFirst(): " + students);

        students.removeLast();
        System.out.println("After removeLast(): " + students);
    }
}


//Q9. ListIterator Modification
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("Aman");
        students.add("Rahul");
        students.add("Priya");

        ListIterator<String> it = students.listIterator();

        while (it.hasNext()) {
            String name = it.next();

            if (name.equals("Rahul")) {
                it.set("Karan");
                it.add("Neha");
            }
        }

        System.out.println("Updated List: " + students);
    }
}


//Q10. List vs Set Experiment
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int[] values = {10, 20, 10, 30, 20, 40};

        for (int value : values) {
            list.add(value);
            set.add(value);
        }

        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);
    }
}


Difference:
ArrayList	HashSet
Allows duplicate values.	Does not allow duplicates.
Maintains insertion order.	Does not guarantee order.
Allows index-based access using get().	Does not provide index-based access.

//Q11. Sorted Student IDs – TreeSet
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> ids = new TreeSet<>();

        ids.add(105);
        ids.add(102);
        ids.add(108);
        ids.add(101);
        ids.add(105);
        ids.add(110);
        ids.add(103);

        System.out.println("Student IDs: " + ids);

        System.out.println("First ID: " + ids.first());
        System.out.println("Last ID: " + ids.last());
        System.out.println("Higher than 103: " + ids.higher(103));
        System.out.println("Lower than 103: " + ids.lower(103));
    }
}


//Q15 Hospital Patient List
This program uses an ArrayList for patient names and a HashSet for unique patient IDs. Both collections are updated together.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        HashSet<String> ids = new HashSet<>();

        // Add patients
        names.add("Aman");
        ids.add("P101");

        names.add("Rahul");
        ids.add("P102");

        names.add("Priya");
        ids.add("P103");

        System.out.println("Patient Records:");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(ids.toArray()[i] + " - " + names.get(i));
        }

        // Search patient by ID
        System.out.print("Enter patient ID to search: ");
        String searchId = sc.nextLine();

        if (ids.contains(searchId)) {
            System.out.println("Patient ID found.");
        } else {
            System.out.println("Patient ID not found.");
        }

        // Remove patient by position
        System.out.print("Enter position to remove (1 to " +
                names.size() + "): ");
        int position = sc.nextInt();

        if (position >= 1 && position <= names.size()) {
            String removedId = (String) ids.toArray()[position - 1];

            names.remove(position - 1);
            ids.remove(removedId);

            System.out.println("Patient removed.");
        } else {
            System.out.println("Invalid position.");
        }

        System.out.println("Updated Patient Names: " + names);
        System.out.println("Updated Patient IDs: " + ids);
    }
}
