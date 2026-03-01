public class OOPS_BANNER_APP {
    /**
     * Entry point for the banner application.  The program builds
     * the ASCII art patterns for each character (O, P, S) using
     * helper methods and then prints the word "OOPS" to the console.
     *
     * @param args command line arguments (not used)
     * @author Student
     * @version 1.0
     */
    public static void main(String[] args) {
        // build each letter pattern
        String[] oPattern = buildO();
        String[] pPattern = buildP();
        String[] sPattern = buildS();

        // compose the word OOPS (two Os, then P and S)
        String[][] letters = { oPattern, oPattern, pPattern, sPattern };

        // print each row of the banner
        for (int row = 0; row < oPattern.length; row++) {
            StringBuilder line = new StringBuilder();
            for (String[] letter : letters) {
                line.append(letter[row]).append("  "); // spacing between letters
            }
            System.out.println(line);
        }
    }

    /**
     * Constructs the 7-line pattern representing the letter 'O'.
     *
     * @return array of strings, each string is one row of the 'O'
     */
    private static String[] buildO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    /**
     * Constructs the 7-line pattern representing the letter 'P'.
     *
     * @return array of strings, each string is one row of the 'P'
     */
    private static String[] buildP() {
        return new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    /**
     * Constructs the 7-line pattern representing the letter 'S'.
     *
     * @return array of strings, each string is one row of the 'S'
     */
    private static String[] buildS() {
        return new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }
}

