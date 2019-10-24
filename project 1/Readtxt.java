/*.
 * we are reading the text from the text file by
 * using this class Readtext.
 * Given a txt file, we will read the data from the txt file and parses each
 * line of the file.
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class Readtxt {
    /**
     * This is a static method.
     *
     * @param filename the name of the CSV file. Should be located in the same
     *                 directory.
     * @return null if the file cannot be read.
     */

    public static String[] readFile(final String filename) {
    /**
     * Taking input parameter as filename and performing
     * operations. It returns null when the file is cannot be read.
     */
        ArrayList<String> lines = new ArrayList<String>();
        Scanner scan = null;
        try {
            scan = new Scanner(new File(filename));
            while (scan.hasNext()) {
                lines.add(scan.nextLine());
            }
            String[] linesArray = lines.toArray(new String[lines.size()]);
            return linesArray;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (scan != null) {
                scan.close();
            }
        }
        return null;
    }
}

