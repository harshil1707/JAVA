public class Main {
    public static void merge(int arr[], int sp, int mid, int ep) {
        int newArr[] = new int[ep - sp + 1];
        int i = sp, j = mid + 1 , x = 0;
        while (i <= mid && j <= ep) {
            if (arr[i] < arr[j]) {
                newArr[x++] = arr[i++];
            }
            else {
                newArr[x++] = arr[j++];
            }
        }
        while (i <= mid) {
            newArr[x++] = arr[i++];
        }
        while (j <= ep) {
            newArr[x++] = arr[j++];
        }
        for (int k = 0; k < newArr.length; k++) {
            arr[sp + k] = newArr[k];
        }
    }
    public static void divide(int arr[], int sp ,int ep) {
        if (sp >= ep) {
            return;
        }
        int mid = sp + (ep - sp)/2;
        divide(arr, sp, mid);
        divide(arr, mid+1, ep);
        merge(arr, sp, mid ,ep);
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        divide(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// Time Complexity: Worst --> O(nlogn)