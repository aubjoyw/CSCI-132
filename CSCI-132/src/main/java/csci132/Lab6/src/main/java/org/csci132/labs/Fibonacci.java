package csci132.Lab6.src.main.java.org.csci132.labs;

/**
 * @author : Adiesha
 * @created : 7/27/2022, Wednesday
 **/
public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 1){
            return 0;
        } else if (n == 2){
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }


}
