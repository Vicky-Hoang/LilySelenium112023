package JavaBasicExercise.Exercise5;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private int age;
    private double salary;
    private String titleJob;

    //Create a constructor for Employee class
    public Employee(String name, int age, double salary, String titleJob){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.titleJob = titleJob;
    }

    //Create method to all variable
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getSalary(){
        return salary;
    }

    public String getTitleJob(){
        return titleJob;
    }

    //Create a method to convert to String

   public String toString(){
        return "StudentName = " + name + ", age = " + age + ", salary = " + salary + ", TitleJob = " + titleJob;
    }

    private static void addNewEmployee(List<Employee> employeeList, String name, int age, double salary, String titleJob){
        Employee employee = new Employee(name, age, salary, titleJob);
        employeeList.add(employee);
    }


    public static void main(String[] args) {

        //Using array list to store employee info
        List<Employee> employeeList = new ArrayList<Employee>();

        //Create instance of the Employee class

        addNewEmployee(employeeList, "lily", 39, 48.000, "QCM");
        addNewEmployee(employeeList, "Hana", 27, 32.000, "Senior QA");
        addNewEmployee(employeeList, "Smith", 46, 56.000, "Team Lead");
        addNewEmployee(employeeList, "Anna", 50, 90.000, "Director");

        //Using for basic to show the list of employee
        int emp = employeeList.size();
        for (int i = 0; i < emp ; i++){
            Employee current = employeeList.get(i);
            System.out.println(current);
        }
    }

}
