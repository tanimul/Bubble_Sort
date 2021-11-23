package bubble_sort;

import java.util.Arrays;

/**
 *
 * @author Fuad
 */
public class Bubble_sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numbers[] = {15, 2, 13, 4, 8, 10, 50, 40};

        for (int i = 0; i < numbers.length - 1; i++) 
        {
            for (int j = 0; j < numbers.length - i - 1; j++)
            {
                if (numbers[j] > numbers[j + 1]) {

                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted Array in Ascending Order: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

}
