public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int first = arr[0]; // Store the first element
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1]; // Shift elements left
        }
        arr[n - 1] = first;
        System.out.print("Array after left rotation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}