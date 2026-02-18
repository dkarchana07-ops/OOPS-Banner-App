public class OopsBanner {
    public static void main(String[] args) {
        // UC4: Centralized data structure (String Array) to store banner lines
        // Each line is exactly 26 characters wide to ensure perfect alignment
        String[] banner = new String[7];

        banner[0] = "#####  #####  #####  #####";
        banner[1] = "#   #  #   #  #   #  #    ";
        banner[2] = "#   #  #   #  #   #  #    ";
        banner[3] = "#   #  #   #  #####  #####";
        banner[4] = "#   #  #   #  #          #";
        banner[5] = "#   #  #   #  #          #";
        banner[6] = "#####  #####  #      #####";

        // UC4: Enhanced for-loop to iterate and print the banner
        // This eliminates repetitive print statements and improves code modularity
        for (String line : banner) {
            System.out.println(line);
        }
    }
}