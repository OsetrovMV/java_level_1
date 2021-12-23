/**
 * Java 1. Lesson 5.
 *
 * @author Mikhail Osetrov
 * @version 21.12.2021 - 22.12.2021
 */

class HomeWorkFive {
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

class Employee {
    private String fullName;
    private String post;
    private String email;
    private String phone;
    private int salaries;
    private int age;

    Employee (String fullName, String post, String email, String phone, int salaries, int age){
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salaries = salaries;
        this.age = age;
    }

    public void setFull_name(String fullName) {
        if (fullName != null){
            this.fullName = fullName;
        }
    }

    public int getAge() {
        return age;
    }
    
    public String toString () {
        return "Name: " + fullName + ", " + "Post: " + post + ", " + "Email: " + email + ", " + "Phone: "  + phone + ", " + "Salaries: "  + salaries + ", " + "Age: "  + age;
    }
}