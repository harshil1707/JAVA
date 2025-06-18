public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int d = 2;

        for (int j = 0; j < d; j++) {
            int first = arr[0]; // Store the first element
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1]; // Shift elements left
            }
            arr[n - 1] = first;
        }
        System.out.print("Array after left rotation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
import java.util.Scanner;
public class LeftRotateByD {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the size of the array: ");
int n = scanner.nextInt();
int[] arr = new int[n];
System.out.println("Enter " + n + " elements:");
for (int i = 0; i < n; i++) {
arr[i] = scanner.nextInt();
}
System.out.print("Enter the number of rotations (D): ");
int d = scanner.nextInt();
scanner.close();
leftRotateByD(arr, n, d);
System.out.print("Array after " + d + " left rotations: ");
for (int num : arr) {
System.out.print(num + " ");
}
}
public static void leftRotateByD(int[] arr, int n, int d) {
// Handle if D is greater than the array length
d = d % n;
if (d == 0) {
return; // No need to rotate if D is 0 or a multiple of n}
// Reverse the first part of the array (from index 0 to d-1)
reverse(arr, 0, d - 1);
// Reverse the second part of the array (from index d to n-1)reverse(arr, d, n - 1);
// Reverse the whole array
reverse(arr, 0, n - 1);
}
// Helper method to reverse a portion of the array
public static void reverse(int[] arr, int start, int end) {
while (start < end) {
// Swap the elements at start and end
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;
// Move the pointers
start++;
end--;
}
}
}
 */