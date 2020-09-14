package project;

public class Developer extends Employee implements Bonusable, ReceivesInsurance{

    public Developer(int id, String firstName, String lastName, boolean receivesBonus, boolean receivesInsurance, String title) {
        super(id, firstName, lastName, receivesBonus, receivesInsurance, title);
        this.receivesBonus = receivesBonus;
        this.receivesInsurance = receivesInsurance;
        this.title = title;
    }

    boolean receivesBonus;

    boolean receivesInsurance;

    String title;

    private double bonusAmount;

    private double insurancePrice;

    static double payPeriodEarnings = 9000.00;

    public void receiveBonus(double bonusAmount){
        this.bonusAmount = bonusAmount;
        receivesBonus = true ;
    }

    public void receiveInsurance(double insurancePrice){
        this.insurancePrice = insurancePrice;
        receivesInsurance = true;
    }

    public double getPaycheckTotal(){
        return payPeriodEarnings + bonusAmount - insurancePrice;
    }
}
