import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * this class reads in integer values from the user, stores them in a sorted stack
 * and prints the sorted numbers.
 *
 * @author Griffin Murphy
 * @version 2.0
 */
public class MurphyGriMod5PA {

    /**
     * The main method that handles the main functions of the program including:
     * collecting user input, input error handling, appending to stack, sorting, and printing.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner used to collect user input

        Stack<Integer> numbers = new Stack<>(); //creating the Stack

        System.out.println("Enter each number. Then 'sort' to print the sorted numbers: ");

        while (true) {
            String input = scanner.nextLine(); //keeps accepting user input for stack until 'sort' is entered

            //break loop if the user enters 'sort'
            if (input.equalsIgnoreCase("sort")) {
                break;
            }

            try {
                //convert the input string to an integer
                int number = Integer.parseInt(input);

                //push the number to the stack
                numbers.push(number);

            } catch (NumberFormatException e) { //used for user invalid inputs
                System.out.println("Please enter a valid integer or 'sort' to stop: ");
            }
        }

        sortStack(numbers);

        System.out.println("Sorted numbers:");
        while (!numbers.isEmpty()) {
            System.out.println(numbers.pop());
        }
    }

    /**
     * Sorts a stack in ascending order largest on top smallest at bottom of stack utilizing the collection framework
     *
     * @param stack the stack to be sorted
     */
    private static void sortStack(Stack<Integer> stack) {
        List<Integer> tempList = new ArrayList<>(stack);
        Collections.sort(tempList);
        Collections.reverse(tempList); //reverse the list so the smallest element is at the bottom of the stack
        stack.clear();
        for (Integer number : tempList) {
            stack.push(number);
        }
    }
}
