package streams;

public class Employee {

        private String name;
        private Address address;
        private String department;
        private double salary;

    public Employee(String name,String department,double salary, Address address) {
        this.name = name;
        this.department=department;
        this.salary=salary;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", address=").append(address);
        sb.append(", department='").append(department).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
