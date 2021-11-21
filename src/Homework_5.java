/**
 * Java_1.Homework_5
 *
 * @author natalichenkova
 * @version 21.11.21
 */
class Homework_5 {
    public static void main(String[] ags) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Antohova Maria", "Dentist","123@mail.ru","89111234567", 100000, 28);
        empArray[1] = new Employee("Kolesnik Egor", "Intern","1234@mail.ru","89119876543", 15000, 23);
        empArray[2] = new Employee("Petrova Darina", "Nurse","456@mail.ru","89116457834", 40000, 53);
        empArray[3] = new Employee("Sidorova Valeria", "Therapist","9876@mail.ru","89635678324", 70000, 44);
        empArray[4] = new Employee("Gromova Anna", "Neurologist","7564@mail.ru","89956784455", 650000, 37);
        for (Employee employee : empArray) {
            if (employee.age > 40) employee.printInfo();
        }

    }

}

class Employee {
    String name;
    String position;
    String email;
    String telephone;
    int wage;
    int age;

    Employee(String name, String position, String email, String telephone, int wage, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.wage = wage;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name + "\n" + "Position: " + position + "\n" + "Email: " + email + "\n" + "Telelphone: " + telephone + "\n" + "Wage: " + wage + "\n" + "Age: " + age+ "\n");
    }

}
