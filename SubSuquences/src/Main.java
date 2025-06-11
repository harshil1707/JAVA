public class Main {
    //Time Complexity: O(2^n)
    public static void subSequence(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char ch = str.charAt(idx);

        //want to add
        subSequence(str, idx + 1, newString + ch);

        //don't want to add
        subSequence(str, idx + 1 ,newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subSequence(str, 0, "");
    }
}