public class OopsBanner {
    
    // UC7: Static inner class for pattern encapsulation
    static class CharacterPattern {
        private String[] pattern;

        // UC7: Constructor for data management
        public CharacterPattern(String r1, String r2, String r3, String r4, String r5) {
            this.pattern = new String[]{r1, r2, r3, r4, r5};
        }

        // UC7: Getter for row retrieval
        public String getRow(int row) {
            return pattern[row - 1];
        }
    }

    public static void main(String[] args) {
        // UC7: Character-to-pattern mapping objects
        CharacterPattern charO = new CharacterPattern("*****", "* *", "* *", "* *", "*****");
        CharacterPattern charP = new CharacterPattern("*****", "* *", "*****", "* ", "* ");
        CharacterPattern charS = new CharacterPattern("*****", "* ", "*****", "    *", "*****");

        String[] banner = new String[7];
        banner[0] = "###########################################################";
        
        // UC7: Building the banner rows using character objects
        for (int i = 1; i <= 5; i++) {
            banner[i] = String.join("   ", "#", charO.getRow(i), charO.getRow(i), charP.getRow(i), charS.getRow(i), "#");
        }
        
        banner[6] = "###########################################################";

        // Render the final horizontal banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}