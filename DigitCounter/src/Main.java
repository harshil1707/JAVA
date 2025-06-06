import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
//        scanner.close();
        int count = countDigits(number);
        System.out.println("Number of digits: " + count);
    }
    public static int countDigits(int num) {
        num = Math.abs(num);
        return String.valueOf(num).length();
    }
}