public class Main {
    //Time Complexity: O(n)  => n is string length
    public static int first = -1;
    public static int last = -1;

    public static void occurance(String str, int idx, char ele) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr = str.charAt(idx);
        if (curr == ele) {
            if (first == -1) {
                first = idx;
            }
            else {
                last = idx;
            }
        }
        occurance(str, idx + 1, ele);
    }
    public static void main(String[] args) {
        String str = "abcdwedaafrar";
        occurance(str, 0, 'a');
    }
}