public class Main {
    public static void RecursionPrinter(int n, String str) {
        if (n == 0) {
            return;
        }
        System.out.println(str);
        RecursionPrinter(n - 1, str);
    }
    public static void main(String[] args) {
        String str = "Hello World";
        int n = 5;
        RecursionPrinter(n, str);
    }
}