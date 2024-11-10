import java.util.Scanner;

public class AverageCalculator {

    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length; // This results in a cut-off decimal, so I gave a choice to the user between float or int.
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length; //This is the exact same thing, but will return a double. I could have defaulted to this method, 
                                    // but I'm not sure what you intended for me to do. 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to calculate the average of integers or doubles? (enter 'int' or 'double'): ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("int")) {   
            // ^^ ChatGPT optimization
            int[] intValues = new int[10];
            System.out.println("Enter ten integer values:");
            for (int i = 0; i < intValues.length; i++) {
                intValues[i] = scanner.nextInt();
            }

            int averageInt = average(intValues);
            System.out.println("The average of the integer values is: " + averageInt);

        } else if (choice.equalsIgnoreCase("double")) {
            double[] doubleValues = new double[10];
            System.out.println("Enter ten double values:");
            for (int i = 0; i < doubleValues.length; i++) {
                doubleValues[i] = scanner.nextDouble();
            }

            double averageDouble = average(doubleValues);
            System.out.println("The average of the double values is: " + averageDouble);

        } else {
            System.out.println("Invalid choice. Please enter 'int' or 'double'.");
        }

        scanner.close();
    }
}
