package csci132.Lab3;

public class HourlyEmployee extends Employee{

    public double wage;
    public double hours_worked;

    public HourlyEmployee(double rate, double hours, String first, String last, double id){
        super(first, last, id);
        wage = rate;
        hours_worked = hours;
    }

    public void print_info(){
        System.out.println("Employee type: Hourly");
        System.out.println("Employee name: " + first_name + " " + last_name);
        System.out.println("ID number: " + id_number);
        System.out.println("Hourly wage: " + wage);
        System.out.print("Hours worked: " + hours_worked);
    }
}
