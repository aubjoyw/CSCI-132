package csci132.Lab3;

public class HourlyEmployee extends Employee{

    public double wage;
    public double hours_worked;

    public HourlyEmployee(double rate, double hours, String first, String last, double id){
        super(first, last, id);
        wage = rate;
        hours_worked = hours;
    }

    public void print_type(){
        System.out.print("Employee type: Hourly");
    }
}
