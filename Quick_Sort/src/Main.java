public class Main {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void quiclSort(int arr[], int low, int high) {
        if(low < high) {
            int pivot = partition(arr, low, high);
            quiclSort(arr, low, pivot - 1);
            quiclSort(arr, pivot + 1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] ={6,3,9,5,2,8};
        int n = arr.length;
        quiclSort(arr, 0 ,n-1);
        for(int i =0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// Time Complexity: Worst --> O(n^2)
// Time Complexity: Average --> O(nlogn)