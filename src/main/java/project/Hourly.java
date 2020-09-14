package project;

public class Hourly extends Employee{

    public Hourly(int id, String firstName, String lastName, boolean receivesBonus, boolean receivesInsurance, String title) {
        super(id, firstName, lastName, receivesBonus, receivesInsurance, title);
        this.receivesBonus = receivesBonus;
        this.receivesInsurance = receivesInsurance;
        this.title = title;
    }

    String title = "Hourly";

    boolean receivesBonus;

    boolean receivesInsurance;

    private double hoursWorked;

    public void setHours(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    public double getPaycheckTotal(){
        return hoursWorked * 20.00;
    }

}
