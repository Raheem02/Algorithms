import java.util.Scanner;

public class MergeSort1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array1 : ");
        int size1 = scanner.nextInt();
        System.out.print("Enter the size of array2 : ");
        int size2 = scanner.nextInt();
        int[] arr1 = readArray(scanner, size1);
        int[] arr2 = readArray(scanner, size2);
        mergeArray(arr1, arr2);
    }

    private static void mergeArray(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i++] + " ");
            } else {
                System.out.print(arr2[j++] + " ");
            }
        }
        while (i < arr1.length) {
            System.out.print(arr1[i++] + " ");
        }
        while (j < arr2.length) {
            System.out.print(arr2[j++] + " ");
        }

    }

    private static int[] readArray(Scanner scanner, int size) {
        System.out.println("Insert elements in the array");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
