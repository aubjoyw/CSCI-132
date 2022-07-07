package csci132.Lab1;

public class PythonDemo {

    public static void checkTheNumber(int number){

        switch (number){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Neither 1 or 2");
        }
        /*
        if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else {
            System.out.println("Neither 1 or 2");
        }*/
    }

    public static String getTheSchoolName(String school){
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("User asked for the school Name for ");
        stringBuilder.append(school);
        System.out.print(stringBuilder);
        return "MSU";
    }

    public static void printNumbersFrom1To10(){
        System.out.println("Printing numbers from 1 to 10");
        for (int i = 1; i < 11; i++) {
            System.out.print(i);
        }
    }

    public static void main(String[] args){
        checkTheNumber(1);
        String schoolName = getTheSchoolName("Montana State");
        System.out.println("School Name: " + schoolName);
        checkTheNumber(2);
        checkTheNumber(5);
    }
}
