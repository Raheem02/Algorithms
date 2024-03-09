import java.util.Scanner;

public class BsUsingR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the key element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the key");
        int key = scanner.nextInt();
        int result = FindElement(arr, key, 0, arr.length);
        System.out.println(result != -1 ? "Element found @ index " + result : "Element not found!");

    }

    private static int FindElement(int[] arr, int key, int low, int high) {

        if (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (key < arr[mid]) {
                return FindElement(arr, key, low, mid - 1);
            } else {
                return FindElement(arr, key, mid + 1, high);
            }
        }
        return -1;
    }
}
