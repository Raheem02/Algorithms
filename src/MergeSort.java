import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array 1");
        int size1 = scanner.nextInt();
        System.out.println("Enter the size of Array 2");
        int size2 = scanner.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        System.out.println("Insert elements in the array 1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Insert elements in the array 2");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        mergeArrays(arr1, arr2);
    }

    private static void printArrays(int[] result) {
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    private static void mergeArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0, resultantLength = arr1.length + arr2.length;
        int[] result = new int[resultantLength];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        printArrays(result);
    }

}
