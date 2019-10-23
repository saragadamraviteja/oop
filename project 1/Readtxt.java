import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class Readtxt {

    public static String[] readFile(String filename) {
        ArrayList<String> lines = new ArrayList<String>();
        Scanner scan = null;
        try {
            scan = new Scanner(new File(filename));
            while (scan.hasNext()) {
                lines.add(scan.nextLine());
            }
            String linesArray[] = lines.toArray(new String[lines.size()]);
            return linesArray;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (scan != null)
                scan.close();
        }
        return null;
    }
}
