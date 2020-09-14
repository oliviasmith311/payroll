package project;

import java.util.ArrayList;

public class CompanyRoster {

    private ArrayList<Employee> employeeList = new ArrayList<>();
    private ArrayList<Hourly> hourlyList = new ArrayList<>();
    private ArrayList<Sales> salesList = new ArrayList<>();
    private ArrayList<Developer> developerList = new ArrayList<>();
    private ArrayList<Executive> executiveList = new ArrayList<>();

    public void addEmployee(Employee employeeToAdd) {
        employeeList.add(employeeToAdd);
    }

    public void retrieveEmployeeList(){
        for(Employee employee : employeeList){
            System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName() +
                                "\nId Number: " + employee.getId());
        }
    }

    public void calculatePay(){
        for(Employee employee : employeeList){
            if(employee.getTitle().equals("Hourly")) {
                hourlyList.add((Hourly) employee);
            } else if(employee.getTitle().equals("Sales")){
                salesList.add((Sales) employee);
            } else if(employee.getTitle().equals("Developer")){
                developerList.add((Developer) employee);
            } else if(employee.getTitle().equals("Executive")){
                executiveList.add((Executive) employee);
            }
        }
        System.out.println("Here's are your employees' paycheck totals:");
        for(Hourly hourlyemployee : hourlyList){
            System.out.println(hourlyemployee.getFirstName() + " " + hourlyemployee.getLastName() + " : $" + hourlyemployee.getPaycheckTotal());
        }
        for(Sales salesEmployee : salesList){
            System.out.println(salesEmployee.getFirstName() + " " + salesEmployee.getLastName() + " : $" + salesEmployee.getPaycheckTotal());
        }
        for(Developer devEmployee : developerList){
            System.out.println(devEmployee.getFirstName() + " " + devEmployee.getLastName() + " : $" + devEmployee.getPaycheckTotal());
        }
        for(Executive executiveEmployee : executiveList){
            System.out.println(executiveEmployee.getFirstName() + " " + executiveEmployee.getLastName() + " : $" + executiveEmployee.getPaycheckTotal());
        }
    }

}
