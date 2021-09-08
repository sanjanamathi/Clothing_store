
import java.util.Scanner;

public class Main {
    public static  double[] getInput(int size)
    {
        Scanner input = new Scanner(System.in);
        double[] inputArray = new double[size];

        System.out.println("Enter the Numbers");

        for(int i = 0; i< inputArray.length;i++)
        {
            inputArray[i] = input.nextDouble();
        }

        return inputArray;

    }

    public static void display(double[] arrayToDisplay)
    {
        System.out.println("The numbers are...");
        for(int i =0; i<arrayToDisplay.length;i++)
        {
            System.out.println(arrayToDisplay[i]);
        }

    }
    public static int sum(int a, int b)
    {
        //int c = a+ 2*b;
        return (a+2*b);
        //return a-b;
    }
    public static void main(String[] args) {
        int size_of_array = 5;
        double[] array_data = new double[size_of_array];
	    array_data = getInput(size_of_array);
        display(array_data);
        array_data = getInput(size_of_array);
        display(array_data);
        System.out.println(sum(1,2));
    }
}
