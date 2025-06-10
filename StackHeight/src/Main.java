public class Main {
    public static int printHeight(int x , int n) {
        if(n == 0 || x == 0) {
            return 1;
        }
        int c = printHeight(x , n-1);
        int ans = x * c ;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(printHeight(2,10));
    }
}