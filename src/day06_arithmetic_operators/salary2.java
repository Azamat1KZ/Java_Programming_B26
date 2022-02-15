package day06_arithmetic_operators;

public class salary2 {
    public static void main(String[] args) {
        double salary = 100_000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = federalTax + stateTax;
        double salaryAfterTax = salary - totalTax;

        System.out.println("State tax rate is: " + (int)(stateTaxRate * 100) + "%" );
        System.out.println("Federal tax rate is: " + (int)(federalTaxRate * 100) + "%" );
        System.out.println();
        System.out.println("Total salary is $" + salary);
        System.out.println("State tax $" + stateTax);
        System.out.println("Federal tax $" + federalTax);
        System.out.println("Total tax amount paid $" + totalTax);
        System.out.println("TOTAL SALARY PAID AFTER TAXES $" + salaryAfterTax);
    }
}
