public class Main {
    public static int calFactorial(int n) {
        if(n == 0) {
            return 1;
        }
        int m = calFactorial(n-1);
        int f = n*m;
        return f;
    }
    public static void main(String[] args) {
//        calFactorial(5);
        System.out.println(calFactorial(7));
    }
}
