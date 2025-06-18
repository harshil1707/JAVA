import java.util.*;
public class Main {
//    public static int[] removeElement(int[] originalArray, int elementToRemove) {
//        // Count occurrences of the element to remove
//        int count = 0;
//        for (int x : originalArray) {
//            if (x == elementToRemove) {
//                count++;
//            }
//        }
//
//        // If the element is not found or array becomes empty, handle it
//        if (count == 0) {
//            return originalArray; // Element not found, return original array
//        }
//        if (originalArray.length == count) {
//            return new int[0]; // All elements are the one to remove, return empty array
//        }
//
//        int[] newArray = new int[originalArray.length - count];
//        int newArrayIndex = 0;
//        for (int i = 0; i < originalArray.length; i++) {
//            if (originalArray[i] != elementToRemove) {
//                newArray[newArrayIndex] = originalArray[i];
//                newArrayIndex++;
//            }
//        }
//        return newArray;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the size of the array: ");
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter " + n + " elements:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        scanner.close();
//        int max = arr[0];
//        for (int i = 1; i <n; i++) {
//            if(arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        int[] resultTen = removeElement(arr,max);
//        int secmax = resultTen[0];
//        for (int i = 1; i <resultTen.length; i++) {
//            if(resultTen[i] > secmax) {
//                secmax = resultTen[i];
//            }
//        }
//        System.out.println("Second Largest element: " + secmax);
//    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            scanner.close();
            int secondLargest = findSecondLargest(arr, n);
            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("No second largest element found.");
            } else {
                System.out.println("Second largest element: " + secondLargest);}
        }
        public static int findSecondLargest(int[] arr, int n) {
            if (n < 2) {
                return Integer.MIN_VALUE; // If there are fewer than 2 elements,no second largest
            }
            int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                }
                else if (arr[i] > secondLargest && arr[i] != largest)
                {
                    secondLargest = arr[i];
                }
            }
            return secondLargest;
        }
}