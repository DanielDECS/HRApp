package hrapp;

public class Department {
    // Criação das variáveis e listas
    private String name;
    private Employee[] employees = new Employee[10];
    private int lastAddedEmployeeIndex = -1;

    // Ciação dos métodos construtores
    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    // Criação dos métodos getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Criação de método de validação
    public void addEmp(Employee anEmployee){
        if (lastAddedEmployeeIndex < employees.length){
            lastAddedEmployeeIndex++;
            employees[lastAddedEmployeeIndex] = anEmployee;
        }
    }
    // Criação de método que retorna os elementos da lista
    public Employee[] getEmployees(){
        Employee[] actualEmployees = new Employee[lastAddedEmployeeIndex + 1];
        for (int i = 0; i < actualEmployees.length; i++ ) {
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }

    // Criação de método que retorna o total de elementos na lista
    public int getEmployeeCount() {
        return lastAddedEmployeeIndex + 1;
    }

    // Criação de método para identificar um elemento pelo ID
    public Employee getEmployeeByID(int empId) {
        for (Employee emp: employees) {
            if (emp != null) {
                if (emp.getID() == (empId)) {
                    return emp;
                }
            }
        }
        return null;
    }
    // Criação de método que retorna o valor total do campo salary
    public double getTotalSalary() {
        double totalSalary = 0.0;
        for (int i=0; i <= lastAddedEmployeeIndex; i++){
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }

    // Criação de método que retorna o valor a média do campo salary
    public double getAverageSalary() {
        if (lastAddedEmployeeIndex > -1){
            return getTotalSalary() / (lastAddedEmployeeIndex + 1);
        }
        return 0.0;
    }
    // Sobreescrever o método toString para exibir os campos
    public String toString(){
        return name;
    }

}
