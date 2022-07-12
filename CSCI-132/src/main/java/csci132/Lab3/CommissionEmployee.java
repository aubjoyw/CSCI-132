package csci132.Lab3;

public class CommissionEmployee extends Employee{

    public double commission_rate;
    public double gross_sales;

    public CommissionEmployee(double commission, double sales, String first, String last, double id){
        super(first, last, id);
        commission_rate = commission;
        gross_sales = sales;
    }

    public void print_type() {
        System.out.print("Employee type: Commission");
    }
}
