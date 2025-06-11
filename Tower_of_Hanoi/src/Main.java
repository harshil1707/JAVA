public class Main {
    //Time Complexity: O(2^n)
    public static void towerOfHanoi(int n, String src, String helper, String des) {
        if (n == 1) {
            System.out.println("transfer disk"+ n + " from " + src + " to " + des);
            return;
        }
        towerOfHanoi(n-1, src, des, helper);
        System.out.println("transfer disk"+ n + " from " + src + " to " + des);
        towerOfHanoi(n-1, helper, src, des);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }
}