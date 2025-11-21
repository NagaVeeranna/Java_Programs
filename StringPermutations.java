import java.util.HashSet;
import java.util.Set;
class StringPermutations {
    public static Set<String> generatePermutations(String str) {
        Set<String> permutations = new HashSet<>();
        generatePermutations("", str, permutations);
        return permutations;
    }
    private static void generatePermutations(String prefix, String str, Set<String> permutations) {
        int n = str.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), permutations);
            }
        }
    }
    public static void main(String[] args) {
        String input = "IW4N88J12NI";
        input =input.toLowerCase();
        Set<String> permutations = generatePermutations(input);
        System.out.println("Permutations of the string are: " + permutations);
    }
}
