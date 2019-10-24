import java.util.*;

class Wordcatalog {
    Word[] words = new Word[22];
    Word[] easy = new Word[8];
    Word[] medium = new Word[7];
    Word[] hard = new Word[7];
    public void catalog() {
    String[] dataFrame = Readtxt.readFile("movies.txt");
    int size = 0;
    for(int i = 1; i < dataFrame.length; i = i + 5) {
        words[size++] = new Word(dataFrame[i], dataFrame[i+1], dataFrame[i+2], dataFrame[i+3]);
    }
    int size1 = 0;
    for (int i = 0; i < words.length; i++) {
        if (words[i].level.equals("Easy")) {
            easy[size1++] = words[i];
        }
    }
    int size2 = 0;
    for (int j = 0; j < words.length; j++) {
        if (words[j].level.equals("Medium")) {
            medium[size2++] = words[j];
        }
    }

    int size3 = 0;
    for (int k = 0; k < words.length; k++) {
        if (words[k].level.equals("Hard")) {
            hard[size3++] = words[k];
        }
    }
}
}