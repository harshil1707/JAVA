public class Main {
    //1 to N
    public static void PrintNumber(int n) {
        if(n==0) {
            return;
        }
        PrintNumber(n-1);
        System.out.println(n);
    }
    //N to 1
    public static void PrintNumberRe(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        PrintNumber(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        PrintNumber(n);
        PrintNumberRe(n);
    }
}