/**.
 * Given a string and a non-negative int n, we'll say that the front
 * of the string is the first 3 chars, or whatever is there if the
 * string is less than length 3. Return n copies of the front;
 *
 * Input : frontTimes("Chocolate", 2)
 * Output : ChoCho
 *
 * Input : frontTimes("Chocolate", 3)
 * Output : ChoChoCho
 *
 * Input : frontTimes("Abc", 3)
 * Output : AbcAbcAbc
 *
 * @author: Siva Sankar
 */

public final class FrontTimes {
    private FrontTimes() {
    }
    /**.
     * This method returns n copies of the front.
     * @param str the string to be considered.
     * @param n the non-negative integer value.
     * @return the n copies of the front string.
     */
    public static String frontTimes(final String str, final int n) {
        //  Your code goes here....
        String sum = "";
        final int x = 3;
        if (str.length() < x) {
            for (int i = 0; i < n; i++) {
                sum += str;
            }
        } else {
            String sub = str.substring(0, x);
            for (int i = 0; i < n; i++) {
                sum += sub;
            }
        }
        return sum;
    }
}

