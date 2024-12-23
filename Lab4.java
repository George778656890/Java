
import java.util.Date;

class Stack {

    //data field
    private char[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    //no-arg constructor
    public Stack() {
        size = 0;
        data = new char[DEFAULT_CAPACITY];

    }

    //overloaded constructor
    public Stack(int capacity) {
        size = 0;
        data = new char[capacity];

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public char pop() {
        if (!isEmpty()) {
            return data[--size];
        } else {
            return '\0';
        }
    }

    public void push(char element) {
        if (isFull()) {
            char[] tmp = new char[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                tmp[i] = data[i];
            }
            data = tmp;
        }
        data[size++] = element;
    }

}

class Person {

    private String name;
    private String address;
    private int phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Class name:Person  | Person name: " + getName();
    }

}

class Student extends Person {

    private String class_status;

    Student() {
    }

    public Student(String name) {
        super(name);
    }

    public String getClass_status() {
        return class_status;
    }

    public void setClass_status(String class_status) {
        this.class_status = class_status;
    }

    @Override
    public String toString() {
        return "Class name:Student  | Person name: " + getName();
    }

}

class Employee extends Person {

    private String office;
    private double salary;
    private java.util.Date hireDate;

    public Employee() {
    }

    public Employee(String name) {
        super(name);
    }

    public Employee(String office, double salary, Date hireDate) {
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Class name:Employee  | Person name: " + getName();
    }

}

class Faculty extends Employee {

    private String officeHour;
    private String rank;

    public Faculty() {
    }

    public Faculty(String name) {
        super(name);
    }

    public Faculty(String officeHour, String rank) {
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public String getRank() {
        return rank;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class name:Faculty  | Person name: " + getName();
    }

}

class Staff extends Employee {

    private String title;

    public Staff() {
    }

    public Staff(String name) {
        super(name);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Class name:Staff  | Person name: " + getName();
    }

}

public class Lab4 {

    public static void main(String[] args) {

        Person person = new Person("Peter");
        Student student = new Student("Susan");
        Employee employee = new Employee("Eva");
        Faculty faculty = new Faculty("Frank");
        Staff staff = new Staff("Shane");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
        
        Stack stackofchar1 = new Stack();

        String expression1 = "}}";
        //String expression1="{}}";
        //String expression1="{{a{b}";

        for (int i = 0; i < expression1.length(); i++) {
            if (expression1.charAt(i) == '{') {
                stackofchar1.push('{');
            } else if (expression1.charAt(i) == '}') {
                if (stackofchar1.isEmpty()) {//special case : empty stack + '}'
                    System.out.println("Opening bracket is missing");
                    return;
                } else {
                    stackofchar1.pop();
                }
            }
        }
        if (stackofchar1.isEmpty()) {
            System.out.println("This String has matching brackets ");
        } else {
            System.out.println("This String doesn't have matching brackets ");
        }

        
    }
}
