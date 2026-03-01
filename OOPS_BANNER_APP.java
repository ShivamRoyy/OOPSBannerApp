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
    public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] lines = new String[5];

        lines[0] = String.join("  ", " *** ", " *** ", "**** ", " ****");
        lines[1] = String.join("  ", "*   *", "*   *", "*   *", "*    ");
        lines[2] = String.join("  ", "*   *", "*   *", "**** ", " *** ");
        lines[3] = String.join("  ", "*   *", "*   *", "*    ", "    *");
        lines[4] = String.join("  ", " *** ", " *** ", "*    ", "**** ");

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
 

