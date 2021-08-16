package hrapp;

public class Employee {
    // Criação das variáveis
    private int ID;
    private String name;
    private double salary;

    // Ciação dos métodos construtores
    public Employee() {
    }

    public Employee(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    // Criação dos métodos getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Sobreescrever o método toString para exibir os campos
    public String toString(){
        return "Employee: " + getID() + " " + getName() + ", Salary: " + getSalary();
    }

}
