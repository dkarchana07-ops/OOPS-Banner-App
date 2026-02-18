public class OopsBanner {
    public static void main(String[] args) {
        // UC5: Declaring and initializing the array in one concise statement
        // This eliminates separate assignment lines and uses String.join() directly
        String[] banner = {
            "#######################################",
            String.join("", "#", "                                   ", "#"),
            String.join("", "#", "           ", "OOPS BANNER APP", "           ", "#"),
            String.join("", "#", "                                   ", "#"),
            "#######################################"
        };

        // UC5: Using an enhanced for loop to iterate through the array
        for (String line : banner) {
            System.out.println(line);
        }
    }
}