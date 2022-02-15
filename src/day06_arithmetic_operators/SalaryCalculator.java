package day06_arithmetic_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        /*
        create a class SalaryCalculator
        add a main method
        declare and assign these variables:

        salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

        Sample date:
        100000 (salary)
        0.08 (state tax rate)
        0.21 (federal tax rate)

        Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

        Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
         */

        int salary = 100_000;
        double str = 0.08, ftr = 0.21;
        int totalSalary = salary + ((int) ((salary * str) + (salary * ftr)));
        int strAmount = (int) (salary * str), ftrAmount = (int) (salary * ftr), totalTaxAmount = strAmount + ftrAmount;
        System.out.println("State tax rate: " + str * 100 + "%");
        System.out.println("Federal tax rate: " + ftr * 100 + "%");
        System.out.println("My salary is $" + salary + ".\nThe amount of state tax would be $" + strAmount + " and amount of federal tax: $" + ftrAmount + ".\nThe total tax amount would be $" + totalTaxAmount + ".\nMy salary after all taxes is $" + (salary - totalTaxAmount) + ".");


    }
}
