public class OOPS_BANNER_APP {
    /**
     * UC2 - display a decorative banner for "OOPS" using a sequence
     * of print statements.  Each line is manually assembled via
     * string concatenation to practice literal handling.
     *
     * @param args unused
     * @author Shivam Kumar
     * @version 1.0
     */
    public static void main(String[] args) {
        String[] oPattern = buildO();
        String[] pPattern = buildP();
        String[] sPattern = buildS();
        String[][] letters = { oPattern, oPattern, pPattern, sPattern };
        for (int row = 0; row < oPattern.length; row++) {
            StringBuilder line = new StringBuilder();
            for (String[] letter : letters) {
                line.append(letter[row]).append("  ");
            }
            System.out.println(line);
        }
    }

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

