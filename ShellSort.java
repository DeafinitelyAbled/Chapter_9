public class ShellSort {
    public static int insertionSortingInterleaved(int[] list, int index, int gap) {
        int swaps = 0;
        for (int i = index + gap; i < list.length; i += gap) {
            int j = i;

            while (j - gap >= index && list[j] < list[j - gap]) {
                int temp = list[j];
                list[j] = list[j - gap];
                list[j - gap] = temp;
                j -= gap;
                swaps++;
            }
        }
        return swaps;

    }

    public static int shellSorting(int[] list, int[] gap) {
        int swaps = 0;
        for (int j = 0; j < gap.length; ++j) {
            int totalSwaps = 0;
            for (int i = 0; i < gap[j]; ++i) {
                totalSwaps += insertionSortingInterleaved(list, i, gap[j]);
            }
            swaps += totalSwaps;
        }
        return swaps;
    }

    public static void main(String[] args) {

        int[] list = {55, 99, 87, 54, 31, 17, 28, 18};
        int[] numbers = {55, 99, 87, 54, 31, 17, 28, 18};
        int[] gap = {4, 2, 1};
        int swaps = 0;
        //-------------------------------------------------------
        System.out.println("---Shell Sorting Algorithm---");
        System.out.print("Unsorted numbers: ");
        for (int i = 0; i < list.length; ++i) {
            System.out.print(list[i] + " ");
        }

        System.out.println();
        swaps = shellSorting(list, gap);

        System.out.print("Sorted numbers: ");
        for (int i = 0; i < list.length; ++i) {
            System.out.print(list[i] + " ");
        }
        System.out.println("\nTotal number of swaps: " + swaps);
        System.out.println();
        //-------------------------------------------------------
        System.out.println("---Insertion Sorting Algorithm---");
        System.out.print("Unsorted numbers: ");
        for (int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        swaps = insertionSortingInterleaved(numbers, 0, 1);

        System.out.print("Sorted numbers: ");
        for (int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nTotal number of swaps: " + swaps);


    }

}
