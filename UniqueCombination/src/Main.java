public class Main {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void comb(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }

        char ch = str.charAt(idx);
        String mapping = keypad[ch - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            comb(str, idx+1, combination + mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "253";
        comb(str, 0, "");
    }
}