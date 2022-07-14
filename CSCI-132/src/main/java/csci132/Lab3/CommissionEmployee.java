package csci132.Lab3;

public class CommissionEmployee extends Employee{

    public double commission_rate;
    public double gross_sales;

    public CommissionEmployee(double commission, double sales, String first, String last, double id){
        super(first, last, id);
        commission_rate = commission;
        gross_sales = sales;
    }

    public void print_info() {
        System.out.println("Employee type: Commission");
        System.out.println("Employee name: " + first_name + " " + last_name);
        System.out.println("ID number: " + id_number);
        System.out.println("Commission rate: " + commission_rate);
        System.out.print("Gross sales: " + gross_sales);
    }
}
