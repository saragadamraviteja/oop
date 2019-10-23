import java.util.*;

class Wordcatalog {
    Word[] words = new Word[22];
    String[] easy;
    String[] medium;
    String[] hard;
    public void catalog() {
    String[] dataFrame = Readtxt.readFile("movies.txt");
   // System.out.println(Arrays.toString(dataFrame));
    int size = 0;
    for(int i = 1; i < dataFrame.length; i = i + 5) {
        words[size++] = new Word(dataFrame[i], dataFrame[i+1], dataFrame[i+2], dataFrame[i+3]);
    }
    easy = new String[8];
    medium = new String[7];
    hard = new String[7];
    // System.out.println(words[1].level);
    int j = 0;
    int k = 0;
    int l = 0;
    for(int i = 0; i < words.length; i++) {
        if(words[i].level.equals("Easy")) {
            easy[l++] = words[i].word;
        } else if (words[i].level.equals("Medium")) {
            medium[j++] = words[i].word;
        } else {
            hard[k++] = words[i].word;
        }
    }
    // System.out.println(Arrays.toString(hard));
}
}