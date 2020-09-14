package project;

public class Sales extends Employee implements Bonusable{

    public Sales(int id, String firstName, String lastName, boolean receivesBonus, boolean receivesInsurance, String title) {
        super(id, firstName, lastName, receivesBonus, receivesInsurance, title);
        this.receivesBonus = receivesBonus;
        this.receivesInsurance = receivesInsurance;
        this.title = title;
    }

    String title = "Sales";

    boolean receivesBonus;

    boolean receivesInsurance;

    private double bonusAmount;

    static double payPeriodEarnings = 3000.00;

    private double salesCommission;

    public void setCommission(double salesMade, double salesRate){
        this.salesCommission = salesMade * salesRate;
    }

    public double getCommission(){
        return salesCommission;
    }

    public void receiveBonus(double bonusAmount){
        this.bonusAmount = bonusAmount;
        receivesBonus = true;
    }

    public double getPaycheckTotal(){
         return payPeriodEarnings + bonusAmount + salesCommission;
    }

}
