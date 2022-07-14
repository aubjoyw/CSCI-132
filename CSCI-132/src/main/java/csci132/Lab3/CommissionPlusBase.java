package csci132.Lab3;

public class CommissionPlusBase extends CommissionEmployee{

    public double base_salary;


    public CommissionPlusBase(double base, double commission, double sales, String first, String last, double id){
        super(commission, sales, first, last, id);
        base_salary = base;
    }

    public void print_info() {
        System.out.println("Employee type: Commission+Base");
        System.out.println("Commission rate: " + commission_rate);
        System.out.println("Gross sales: " + gross_sales);
        System.out.print("Base salary: " + base_salary);
    }
}
