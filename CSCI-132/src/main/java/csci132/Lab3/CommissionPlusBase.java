package csci132.Lab3;

public class CommissionPlusBase extends CommissionEmployee{

    public double base_salary;


    public CommissionPlusBase(double base, double commission, double sales, String first, String last, double id){
        super(commission, sales, first, last, id);
        base_salary = base;
    }

    public void print_type() {
        System.out.print("Employee type: Commission+Base");
    }
}
