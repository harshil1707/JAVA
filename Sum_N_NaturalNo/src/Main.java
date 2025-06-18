public class Main {
    public static int SumOfNumbers(int n , int sum) {
        if(n == 0) {
            return 0;
        }
        return n + SumOfNumbers(n - 1, sum);
    }
    public static void main(String[] args) {
        int sum = 0, n = 5;
        System.out.println(SumOfNumbers(n , 0));
    }
}