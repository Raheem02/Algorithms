import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter");
        for (int i =0;i< arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        int result = FindKey(arr, scanner);
        System.out.println((result != -1)?"Found at index "+result :"Not found!");
    }

    private static int FindKey(int[] arr, Scanner scanner) {
        System.out.println("key");
        int key = scanner.nextInt();
        int low = 0,high= arr.length,mid;
        while (low<=high){
            mid = (low+high)/2;
            if(key == arr[mid]){
                return mid;
            }
            if(key<arr[mid]){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }
}