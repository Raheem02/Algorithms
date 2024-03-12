import java.util.Scanner;

public class MergeSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size1");
        int size1 = sc.nextInt();
        System.out.println("size2");
        int size2 = sc.nextInt();
        int[] arr1 = readArrya(sc, size1);
        int[] arr2 = readArrya(sc, size2);
        mergeArray(arr1,arr2);
    }

    private static void mergeArray(int[] arr1, int[] arr2) {

    }

    private static int[] readArrya(Scanner sc, int size) {
        int[] arr = new int[size];
        System.out.println("Enter");
        for (int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
            return arr;
    }
}