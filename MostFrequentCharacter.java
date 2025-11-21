import java.util.HashMap;
import java.util.Map;
public class MostFrequentCharacter {
    public static char mostFrequentChar(String str) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toUpperCase(c);
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }
        char mostFrequent = '\0';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }        
        return mostFrequent;
    }
    public static void main(String[] args) {
        String input = "IW4N88J12NI";
        System.out.println("Most frequent character: " + mostFrequentChar(input));
    }
}
