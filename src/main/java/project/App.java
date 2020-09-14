package project;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        populateEmployeeList();
        receiveBonusAmount();
        receiveExecutiveInfo();
        receiveDeveloperInfo();
        receiveSalesInfo();
        receiveHourlyInfo();
        roster.calculatePay();
    }

    public String getGreeting() {
        return "This is my payroll application, it kicks ass!";
    }
    private static final Scanner input = new Scanner(System.in);
    private static CompanyRoster roster = new CompanyRoster();
    private static Executive executive1 = new Executive(1, "Bill", "Smith", true, true, "Executive");
    private static Developer developer1 = new Developer(2, "Greg", "Johnson", true, true, "Developer");
    private static Developer developer2 = new Developer(3, "John", "Gregson", true,true, "Developer");
    private static Developer developer3 = new Developer(4, "Sam", "Withers", true, true, "Developer");
    private static Sales sales1 = new Sales(5, "Amanda", "Coney", true,false, "Sales");
    private static Hourly hourly1 = new Hourly(6, "Jennifer", "Coolidge", false, false, "Hourly");
    private static Hourly hourly2 = new Hourly(7, "Trisha", "Miller", false, false, "Hourly");

    private static double bonusAmount;
    private static double executiveInsuranceAmount;
    private static double developerInsuranceAmount;
    private static double salesCommissionAmount;
    private static double salesCommissionNumber;
    private static double hourly1Hours;
    private static double hourly2Hours;

    public static void populateEmployeeList(){
        roster.addEmployee(executive1);
        roster.addEmployee(developer1);
        roster.addEmployee(developer2);
        roster.addEmployee(developer3);
        roster.addEmployee(sales1);
        roster.addEmployee(hourly1);
        roster.addEmployee(hourly2);
        roster.retrieveEmployeeList();
    }

    public static void receiveBonusAmount(){
        System.out.println("First, how much are your employee's bonuses?");
        bonusAmount = input.nextDouble();
    }

    public static void receiveExecutiveInfo() {
        System.out.println("Radical! That's a cool number. How much does your executive pay for insurance?");
        executiveInsuranceAmount = input.nextDouble();
        System.out.println("Wow, that sure isn't a lot!");
        executive1.receiveBonus(bonusAmount);
        executive1.receiveInsurance(executiveInsuranceAmount);
    }

    public static void receiveDeveloperInfo(){
        System.out.println("How much do your developers pay for insurance?");
        developerInsuranceAmount = input.nextDouble();
        System.out.println("Wow, I couldn't help but notice that's 8 times more than your executive pays! Don't you think that's a little messed up?");
        String answer = input.nextLine();
        if(answer.equals("yes")){
            System.out.println("Well, at least you recognize that.");
        } else if (answer.equals("no")){
            System.out.println("Dang, you're kinda a bad person! Anyways, we'll move on.");
        }
        developer1.receiveBonus(bonusAmount);
        developer2.receiveBonus(bonusAmount);
        developer3.receiveBonus(bonusAmount);
        developer1.receiveInsurance(developerInsuranceAmount);
        developer2.receiveInsurance(developerInsuranceAmount);
        developer3.receiveInsurance(developerInsuranceAmount);
    }
    public static void receiveSalesInfo(){
        System.out.println("How many sales did " + sales1.getFirstName() + " " + sales1.getLastName() + " make?");
        salesCommissionNumber = input.nextDouble();
        System.out.println("Lit! And how much is " + sales1.getFirstName() + "'s commission?");
        salesCommissionAmount = input.nextDouble();
        System.out.println("Radical!");
        sales1.setCommission(salesCommissionNumber, salesCommissionAmount);
        sales1.receiveBonus(bonusAmount);
    }

    public static void receiveHourlyInfo(){
        System.out.println("How many hours did " + hourly1.getFirstName() + " " + hourly1.getLastName() + " work this week?");
        hourly1Hours = input.nextDouble();
        System.out.println("Gnarly. And how many hours did " + hourly2.getFirstName() + " " + hourly2.getLastName() + " work this week?");
        hourly2Hours = input.nextDouble();
        System.out.println("Killin it!");
        hourly1.setHours(hourly1Hours);
        hourly2.setHours(hourly2Hours);
    }

}
