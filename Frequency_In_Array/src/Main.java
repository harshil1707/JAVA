import java.util.*;
public class Main {
    public static void countFrequencies(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Element Frequencies:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {System.out.println(entry.getKey() + " → " + entry.getValue()+" times");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,1,4,2,3,4,4};
        countFrequencies(arr);
    }
}