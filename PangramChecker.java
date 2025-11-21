import java.util.HashSet;
public class PangramChecker {
    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        HashSet<Character> characters = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                characters.add(c);
            }
        }
        return characters.size() == 26;
    }
    public static void main(String[] args) {
        String input = "The brown fox jumps quickly over the lazy dog";
        System.out.println(input);
        if (isPangram(input)) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }
}
