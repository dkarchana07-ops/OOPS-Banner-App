public class OopsBanner {
    public static void main(String[] args) {
        String[] banner = new String[7];
        banner[0] = "###################################################";
        for (int row = 1; row <= 5; row++) {
            // Using a single space as a separator keeps the letters aligned
            banner[row] = String.join(" ", "# ", getO(row), getO(row), getP(row), getS(row), " #");
        }
        banner[6] = "###################################################";

        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static String getO(int row) {
        if (row == 1 || row == 5) return "*****";
        return "* *"; // 3 spaces inside
    }

    public static String getP(int row) {
        if (row == 1 || row == 3) return "*****";
        if (row == 2) return "* *";
        return "* "; // padding to 5 characters
    }

    public static String getS(int row) {
        if (row == 1 || row == 3 || row == 5) return "*****";
        if (row == 2) return "* ";
        return "    *";
    }
}