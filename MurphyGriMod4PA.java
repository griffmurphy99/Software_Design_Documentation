import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

/**
 * This class reads in integer values from the user then stores them in the sorted linked list
 * and prints the sorted list.
 *
 * @author Griffin Murphy
 * @version 1.0
 */
public class MurphyGriMod4PA {

    /**
     * The main method that handles the main fuctions of the program including:
     * collecting user input, input error handling, appending to list, sorting, and printing
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner used to collect user input

        LinkedList<Integer> numbers = new LinkedList<>(); //creating the Linked List

        System.out.println("Enter each number. Then 'sort' to sort and print linked list: ");

        while (true) {
            String input = scanner.nextLine(); //keeps excepting user input for linkedlist until 'sort' is entered

            //break loop if the user enters 'exit'
            if (input.equalsIgnoreCase("sort")) {
                break;
            }

            try {
                //convert the input string to an integer
                int number = Integer.parseInt(input);

                //add the number to the list
                numbers.add(number);
            }

            catch (NumberFormatException e) { //used for user invalid inputs
                System.out.println("Please enter a valid integer or 'exit' to stop: ");
            }
        }

        //sorting the LinkedList
        Collections.sort(numbers);

        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.println(num);

        }
    }
}
