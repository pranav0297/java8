interface EmployeeEmpty {
    Employee get();
}

interface EmployeeWithName {
    Employee get(String name);
}
class Employee {
    private String name;

    Employee() {
        System.out.println("Empty Constructor");
    }

    Employee(String name) {
        System.out.println("Name Constructor");
        this.name = name;
    }
    public String toString() {
        return "name: " + name;
    }

    public static void main(String[] args) {
        EmployeeEmpty empEmpty = Employee::new;
        System.out.println("Reference-1");
        System.out.println(empEmpty.get());

        EmployeeWithName empWithName = Employee::new;
        System.out.println("Reference-2");
        System.out.println(empWithName.get("Pranav Mishra"));

    }
}

