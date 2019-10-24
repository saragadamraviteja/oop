import java.util.*;
/**
* this class used to store the array of word objects of movies
* along with names, level, and hints fields.
*/
class Wordcatalog {
    /**
     * words array to store the all movie objects.
     */
    Word[] words = new Word[22];
    /**
     * easy array to store the all easy level movie objects.
     */
    Word[] easy = new Word[8];
    /**
     * medium array to store the all medium level movie objects.
     */
    Word[] medium = new Word[7];
    /**
     * hard array to store the all hard level movie objects.
     */
    Word[] hard = new Word[7];
     /**
     * Taking input file text file and sending to Readtxt class and
     * storing in dataFrame array.
     * Also maintaining Easy, Medium and Hard arrays of objects.
     */

    public void catalog() {
    String[] dataFrame = Readtxt.readFile("movies.txt");
    int size = 0;
    for (int i = 1; i < dataFrame.length; i = i + 5) {
        words[size++] = new Word(dataFrame[i], dataFrame[i + 1],
         dataFrame[i + 2], dataFrame[i + 3]);
    }
    int size1 = 0;
    for (int i = 0; i < words.length; i++) {
        if (words[i].getLevel().equals("Easy")) {
            easy[size1++] = words[i];
        }
    }
    int size2 = 0;
    for (int j = 0; j < words.length; j++) {
        if (words[j].getLevel().equals("Medium")) {
            medium[size2++] = words[j];
        }
    }

    int size3 = 0;
    for (int k = 0; k < words.length; k++) {
        if (words[k].getLevel().equals("Hard")) {
            hard[size3++] = words[k];
        }
    }
}
}
