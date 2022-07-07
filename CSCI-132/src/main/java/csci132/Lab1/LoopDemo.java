package csci132.Lab1;


public class LoopDemo {

    public LoopDemo() {
    }

    private static final int[] values = {20, 34, 54, 100, -1, 34, 20, 23, 89, 45, 45, 99, 121, 343};

    private static void max() {
        int n = values[0];
        for (int i = 0; i < values.length; i++) {
            int y = values[i];
            if (y > n) {
                n = y;
            }
        }
        System.out.println(n);
    }

    private static void min() {
        int n = values[0];
        int counter = 0;
        while (counter < 14) {
            int i = values[counter];
            if (i < n) {
                n = i;
            }
            counter++;
        }
        System.out.println(n);
    }

    private static void average() {
        float total = 0;
        for (int i : values) {
            total += i;
        }
        float avg = total / values.length;
        System.out.println(avg);
    }

    private static void reverse() {
        for (int i = values.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(values[i] + "}");
            } else {
                System.out.print(values[i] + ", ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Maximum Value: ");
        max();
        System.out.print("Minimum Value: ");
        min();
        System.out.print("Average Value: ");
        average();
        System.out.print("Reversed Array: {");
        reverse();
    }
}
