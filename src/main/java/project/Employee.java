package project;

public class Employee {
    
    private int id;
    private String firstName;
    private String lastName;
    protected boolean receivesBonus;
    protected boolean receivesInsurance;
    private String title;
    private double paycheckTotal;

    public Employee(int id, String firstName, String lastName, boolean receivesBonus, boolean receivesInsurance, String title){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.receivesBonus = receivesBonus;
        this.receivesInsurance = receivesInsurance;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle(){
        return title;
    }

//    public double getPaycheckTotal(){
//        return paycheckTotal;
//    }

}
