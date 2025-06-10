public class Main {
    public static void fabonacciSeq(int i , int j , int n) {
        if(n == 0) {
            return;
        }
        int k = i+j;
        System.out.println(k);
        fabonacciSeq(j, k,n - 1);
    }
    public static void main(String[] args) {
        int i = 0, j = 1, n=7;
        System.out.println(i);
        System.out.println(j);
        fabonacciSeq(0,1,n-2);
    }
}