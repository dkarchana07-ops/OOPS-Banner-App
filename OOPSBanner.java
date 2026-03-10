import java.util.HashMap;
import java.util.Map;

public class OopsBanner {
    static class CharacterPattern {
        private String[] pattern;
        public CharacterPattern(String r1, String r2, String r3, String r4, String r5) {
            this.pattern = new String[]{r1, r2, r3, r4, r5};
        }
        public String getRow(int row) { return pattern[row - 1]; }
    }

    // UC8: Static Map for centralized pattern management
    private static final Map<Character, CharacterPattern> patternMap = new HashMap<>();

    static {
        // UC8: Storing characters as keys and patterns as values
        patternMap.put('O', new CharacterPattern("*****", "* *", "* *", "* *", "*****"));
        patternMap.put('P', new CharacterPattern("*****", "* *", "*****", "* ", "* "));
        patternMap.put('S', new CharacterPattern("*****", "* ", "*****", "    *", "*****"));
    }

    public static void main(String[] args) {
        String[] banner = new String[7];
        banner[0] = "###########################################################";
        
        for (int i = 1; i <= 5; i++) {
            // UC8: Retrieving patterns from the Map using .get()
            banner[i] = String.join("   ", "#", 
                patternMap.get('O').getRow(i), 
                patternMap.get('O').getRow(i), 
                patternMap.get('P').getRow(i), 
                patternMap.get('S').getRow(i), "#");
        }
        
        banner[6] = "###########################################################";
        for (String line : banner) { System.out.println(line); }
    }
}