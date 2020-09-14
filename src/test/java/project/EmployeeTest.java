package project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    private Employee testEmployee;
    private Sales testSales;

    @BeforeEach
    void setUp() {
        testEmployee = new Employee(123, "Bob", "Smith", false, false, "Employee");
        testSales = new Sales(124, "Bill", "Withers", true, false, "Sales");
    }

    @Test
    public void employeeShouldHaveIdNumber(){
        int employeeId = testEmployee.getId();
        assertEquals(employeeId, 123);
    }

    @Test
    public void setCommissionWorks() {
        testSales.setCommission(50, 10);
        double commission = testSales.getCommission();
        assertEquals(commission, 500);
    }

    @Test
    public void getPaycheckTotalWorksForSalesWithBonus(){
        testSales.setCommission(50, 10);
        testSales.receiveBonus(100);
        double paycheckTotal = testSales.getPaycheckTotal();
        assertEquals(paycheckTotal, 3600);
    }

    @Test
    public void getPaycheckTotalWorksForSalesWithoutBonus(){
        testSales.setCommission(50, 10);
        double paycheckTotal = testSales.getPaycheckTotal();
        assertEquals(paycheckTotal, 3500);
    }

    @Test
    public void getPaycheckTotalWorksForHourly(){
        Hourly testHourly = new Hourly(123, "Greg", "Gregerson", false, false, "Hourly");
        testHourly.setHours(40);
        double paycheckTotal = testHourly.getPaycheckTotal();
        assertEquals(paycheckTotal, 800.00);
    }

    @Test
    public void getPaycheckWorksForDeveloper(){
        Developer testDev = new Developer(123, "John", "test", true, true, "Developer");
        testDev.receiveInsurance(80.00);
        testDev.receiveBonus(200.00);
        double paycheckTotal = testDev.getPaycheckTotal();
        assertEquals(paycheckTotal, 9120.00);
    }
}
