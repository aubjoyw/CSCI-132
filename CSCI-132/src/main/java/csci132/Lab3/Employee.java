package csci132.Lab3;

public class Employee {

    public String first_name;
    public String last_name;
    public double id_number;

    public Employee(){}


    public Employee(String first, String last, double id) {
        first_name = first;
        last_name = last;
        id_number = id;
    }

    public void print_info(){
        System.out.println("Employee name: " + first_name + " " + last_name);
        System.out.print("ID number: " + id_number);
    }



}
