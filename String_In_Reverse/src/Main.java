public class Main {
    public static void reverseString(String str, int idx) {
        if(idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseString(str, idx - 1);
    }
    public static void main(String[] args) {
        String str = "Hello";
        reverseString(str, str.length() - 1);
    }
}