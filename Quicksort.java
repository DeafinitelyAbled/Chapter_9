import java.util.Arrays;

public class Quicksort {

    public static int partition(int[] list, int lowIndex, int highIndex) {

        // Select a middle index value for pivot value
        int midIndex = lowIndex + (highIndex - lowIndex) / 2;
        int pivot = list[midIndex];

        boolean done = false;
        while (!done) {
            // Increment low while numbers[low] < pivot
            while (list[lowIndex] < pivot) {
                ++lowIndex;
            }
            // Decrement high while pivot < numbers[high]
            while (list[highIndex] > pivot) {
                --highIndex;
            }

            // If low and high have crossed each other, the loop is done.
            if (lowIndex >= highIndex) {
                done = true;
            }
            // If not, the elements are swapped,
            // low is incremented and high is decremented.
            else {
                int temp = list[lowIndex];
                list[lowIndex] = list[highIndex];
                list[highIndex] = temp;

                ++lowIndex;
                --highIndex;
            }
        }

        // lowEndIndex is the last index in the left segment.
        int lowEndIndex = highIndex;
        return lowEndIndex;
    }

    public static void quicksort(int[] list, int lowIndex, int highIndex) {

        // Only attempt to sort the array segment if there are at least 2 elements
        if (lowIndex >= highIndex) {
            return;
        }
        // Partition the array segment
        int lowEndIndex = partition(list, lowIndex, highIndex);

        // Recursively sort the left segment
        quicksort(list, lowIndex, lowEndIndex);

        // Recursively sort the right segment
        quicksort(list, lowEndIndex + 1, highIndex);
    }

    public static void main(String[] args) {

        int[] list = { 12, 18, 3, 7, 32, 14, 91, 16, 8, 57 };

        System.out.println("Unsorted: " + Arrays.toString(list));

        quicksort(list, 0, list.length - 1);

        System.out.println("Sorted:   " + Arrays.toString(list));

    }
}