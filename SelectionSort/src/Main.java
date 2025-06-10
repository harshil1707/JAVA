class SelectionSort {
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {7,8,3,2,1};

        //Time complexity: O(n^2)
        for (int i = 0; i < arr.length-1; i++) {
            int sma = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[sma]  > arr[j]) {
                    sma = j;
                }
            }
            int temp = arr[sma];
            arr[sma] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}