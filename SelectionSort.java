public class SelectionSort {
    public static void selection(int[] list) {
        // the outer method initially starts at index 0
        for (int i = 0; i < list.length - 1; ++i) {
            int smallest = i;
            // the inner loop starts one index plus the outer loop index
            for (int j = smallest + 1; j < list.length; ++j) {
                // if statement finds the smallest element seen so far
                if (list[smallest] > list[j]) {
                    smallest = j;
                }
            }
            // the outer loop index swaps with smallest element seen so far
            int temp = list[i];
            list[i] = list[smallest];
            list[smallest] = temp;
        }
    }

    public static void main(String[] args) {
        int[] list = {20, 12, 5, 0, 7, 3, 25};

        System.out.print("Unsorted list: ");
        for (int i = 0; i < list.length - 1; ++i) {
            System.out.print(list[i] + " ");
        }

        selection(list);
        System.out.print("\nSorted list: ");
        for (int i = 0; i < list.length - 1; ++i) {
            System.out.print(list[i] + " ");
        }

    }

}