
package assignment1salarycalculator;

/**
 *
 * @author gandh
 */
public class Calculator {
    
    public int HourlyWage(int salary){
        int HourlyPay = salary/(52*40);
        System.out.println("Your Wage Per Hour is: $" + HourlyPay);
        return HourlyPay;
    }
    public int SalaryPerYear(int hourlyRate){
        int Salary = hourlyRate * (52*40);
        System.out.println("Your Yearly Salary is: $ " + Salary);
        return Salary;
    }
    public double TaxesPerMonth(int salary){
        double Taxes = ((10/100)*salary);
        System.out.println("Your Taxes Are: $" + Taxes);
        return Taxes;
    }
    public double MonthlySalaryAfterTax(int salary){
        double AfterTaxSal = salary - ((10/100)*salary);
        System.out.println("Your Monthly Salary After Tax is: $" + AfterTaxSal);
        return AfterTaxSal;
    }

    
}
