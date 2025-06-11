import java.util.HashSet;

public class Main {
    public static void uniqueSubSequence(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char ch = str.charAt(idx);

        //want to add
        uniqueSubSequence(str, idx + 1, newString + ch, set);

        //don't want to add
        uniqueSubSequence(str, idx + 1 ,newString, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubSequence(str, 0, "", set);
    }
}