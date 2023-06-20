public class InsertionSort {

    public static void insertion(int[] numbers) {
        // for loop starts at index 1 initially, assuming index 0 is sorted
        for (int i = 1; i < numbers.length; ++i) {
            int j = i;
            // while loop compares current index with previous elements
            // until the right position is found and elements are swapped
            while (j > 0 && numbers[j] < numbers[j - 1]) {
                int temp = numbers[j];
                numbers[j] = numbers[j - 1];
                numbers[j - 1] = temp;
                --j;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {50, 30, 60, 10, 40, 20, 90, 70, 80, 100};

        System.out.print("Unsorted numbers: ");
        for (int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + " ");
        }

        insertion(numbers);

        System.out.print("\nSorted numbers: ");
        for (int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + " ");
        }
    }

}