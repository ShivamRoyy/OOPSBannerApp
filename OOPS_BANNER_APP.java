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
        String[] lines = {
            String.join("", " ", "*****", "  ", "*****", "  ", "******", "  ", "*****"),
            String.join("", "*", "     *", "  ", "*", "     *", "  ", "*", "     *", "  ", "*", "     *"),
            String.join("", "*", "     *", "  ", "*", "     *", "  ", "*", "     *", "  ", "*", "     *"),
            String.join("", "*", "     *", "  ", "*", "     *", "  ", "*", "******", "  ", "*****"),
            String.join("", "*", "     *", "  ", "*", "     *", "  ", "*", "     *", "  ", "*", "     *"),
            String.join("", "*", "     *", "  ", "*", "     *", "  ", "*", "     *", "  ", "*", "     *"),
            String.join("", " ", "*****", "  ", "*****", "  ", "*", "     ", "  ", "*****")
        };
        for (String line : lines) {
            System.out.println(line);
        }
    }
}

