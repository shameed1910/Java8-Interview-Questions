package streams;

public class Employee {

        private String name;
        private String department;
        private double salary;

    public Employee(String name,String department,double salary) {
        this.name = name;
        this.department=department;
        this.salary=salary;

    }

        public String getName() {
        return name;
    }
        public String getEmployees(){
        return getName();
    }

        public void setName(String name) {
        this.name = name;
    }

        public String getDepartment() {
        return department;
    }

        public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
