import java.util.Random;

public class MergeSort {

    public static void merge(int[] list, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                list[i] = leftArray[l];
                ++l;
            }
            else {
                list[i] = rightArray[r];
                ++r;
            }
            ++i;
        }

        while (l < leftSize) {
            list[i] = leftArray[l];
            ++l;
            ++i;
        }

        while (r < rightSize) {
            list[i] = rightArray[r];
            ++r;
            ++i;
        }

    }

    public static void mergeSort(int[] list) {
        int listLength = list.length;

        if (listLength < 2) {
            return;
        }

        int middle = listLength / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[listLength - middle];

        for (int i = 0; i < middle; ++i) {
            leftArray[i] = list[i];
        }

        for (int i = middle; i < listLength; ++i) {
            rightArray[i - middle] = list[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(list, leftArray, rightArray);

    }

    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; ++i) {
            System.out.print(list[i] + " ");
        }
    }

    public static void main(String[] args) {

        Random rand = new Random();
        int[] list = new int[50];

        for (int i = 0; i < list.length; ++i) {
            list[i] = rand.nextInt(100);
        }

        System.out.print("Before: ");
        printArray(list);

        mergeSort(list);

        System.out.print("\nAfter: ");
        printArray(list);
    }

