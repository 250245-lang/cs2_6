import java.time.LocalDate;

class Person {
    protected String name, address, phoneNumber, email;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Class: Person, Name: " + name;
    }
}

class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";
    
    private String status;

    public Student(String name, String status) {
        super(name);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class: Student, Name: " + name;
    }
}

class Employee extends Person {
    protected String office;
    protected double salary;
    protected LocalDate dateHired;

    public Employee(String name) {
        super(name);
        this.dateHired = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Class: Employee, Name: " + name;
    }
}

class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Class: Faculty, Name: " + name;
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Class: Staff, Name: " + name;
    }
}
public class Problem1 {
    public static void main(String[] args) {
        Person person = new Person("Dr. Doom");
        Student student = new Student("Muxammad Suyunov", Student.FRESHMAN);
        Employee employee = new Employee("Tony Stank");
        Faculty faculty = new Faculty("Dr. Strange");
        Staff staff = new Staff("The Hulk");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
          }
