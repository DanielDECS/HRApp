package hrapp;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("HRApp start");

        //Criando novos empregados
        Employee e1 = new Employee(1, "Tomas", 15356);
        Employee e2 = new Employee(2, "Sara", 10356);

        //Criando novo departamento
        Department dept = new Department("Education");

        //Adicionando empregados ao Departamento
        dept.addEmp(e1);
        dept.addEmp(e2);
        dept.addEmp(new Employee(3, "Jhon", 7555));

        //Exibindo os empregados criados, empregado por ID, total e média do campo salary
        Employee[] emps = dept.getEmployees();
        for (Employee emp: emps){
            System.out.println("Employee " + emp);
        }
        System.out.println("Employee by ID " + dept.getEmployeeByID(4));
        System.out.println("Total salary " + dept.getTotalSalary());
        System.out.println("Salary avarage " + dept.getAverageSalary());
    }
}
