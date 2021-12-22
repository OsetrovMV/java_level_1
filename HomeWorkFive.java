/**
 * Java 1. Lesson 5.
 *
 * @author Mikhail Osetrov
 * @version 21.12.2021 - 22.12.2021
 */
import java.util.Arrays;

class HomeWorkFive {
    public static void main(String[] args) {
        Employee employee = new Employee ("Petrov Petr", "Engineer", "petrptorv@mailbox.com", "+79165553322", 110000, 35);
        employee.setFull_name ("Konopatov Igor");
        System.out.println(employee);
        Employee employee_1 = new Employee ("Ivanov Ivan", "Driver", "ivivan@mailbox.com", "+79256785623", 70000, 75);
        System.out.println(employee_1);
    }
}

class Employee {
    private String full_name;
    private String post;
    private String email;
    private String phone;
    private int salaries;
    private int age;

    Employee (String full_name, String post, String email, String phone, int salaries, int age){
        this.full_name = full_name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salaries = salaries;
        this.age = age;
    }


    public void setFull_name(String full_name) {
        if (full_name != null){
            this.full_name = full_name;
        }
    }

    public int getAge() {
        return age;
    }

    public String toString () {
        return full_name + ", " + post + ", " + email + ", " + phone + "," + salaries + ", " + age;
    }
}

class Persons {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
            employees[0] = new Employee("Sidorov Ivan", "Cabbie", "sidorov@mailbox.com", "+79258672321", 80000, 35);
            employees[1] = new Employee("Prozorov Roman", "Manager", "prozorov@mailbox.com", "+79254561232", 90000, 42);
            employees[2] = new Employee("Galka Irina", "Accountant", "galka@mailbox.com", "+79105896235", 70000, 25);
            employees[3] = new Employee("Proklova Elena", "Economist", "proklova@mailbox.com", "+7032574596", 100000, 45);
            employees[4] = new Employee("Koloroltsev Egor", "Chief", "koloroltsev@mailbox.com", "+79015985423", 120000, 40);
        for (Employee employee : employees)
            if (employee.getAge() > 40)
            System.out.println(employee);
    }
}