import java.util.*;
/**
 * In this class we are taking the inputs from user like
 * no of number of players, alphabets guessing, whether to
 * choose hint or not . to choose level of difficulty either
 * easy or hard or medium or random.  
 */
public class Game {
    /**
     * declaring wordcatalog to store objects of the movies. 
     */
    Wordcatalog w;
    /**
     * secretword to store the secret movie name. 
     */
    String secretword;
    /**
     * display array used for the display of secret word with random alphabets.
     */
    char[] display;
    /**
     * dis string shows the secret word with guessed alphabets.
     */
    String dis;
    /**
     * s1 is to store the input from the user.
     */
    Character s1;
    /**
     * alphabets used for showing the available letters. 
     */
    String alphabet;
    /**
     * count is used for letters method for availablitity.
     */
    int count = 0;
    /**
     * cnt is used for showing the guesses of the user.
     */
    int cnt;
    /**
     * lett is used for showing already used alphabets.
     */
    String lett = "";
    /**
     * scanner input from the user.
     */
    Scanner sd = new Scanner(System.in);
    /**
     * hintcount for counting the hints taken by the user. 
     */
    int hintcount = 2;
    /**
     * h for to take input from user whether to want hint or not.
     */
    String h;
    /**
     * score maintains the score of the each player. 
     */
    int score = 0;
    /**
     * flag is used  
     */
    int flag = 0;
    int size = 0;
    String s;
    public void hint() {
        if (hintcount > 0) {
            if (secretword.equals(new String(display))) {
            } else {
        System.out.println("press yes for hint, else press no");
        h = sd.nextLine();
            }
        }
        h = h.toLowerCase();
        if ((h.equals("yes")) && hintcount > 0) {
        for (int i = 0; i < w.words.length; i++) {
            if (secretword.equals(w.words[i].getWord().toLowerCase())) {
                if (hintcount == 2) {
                    System.out.println(w.words[i].getHint1());
                    hintcount--;
                } else if (hintcount == 1) {
                    System.out.println(w.words[i].getHint2());
                    hintcount--;
            }
        }
        }
        } else if (h.equals("no")) {
        }
    }
    public void letters() {
        alphabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("letters available:"  +  alphabet);
        System.out.println("alphabets used so far:");
        System.out.println(" ");
        System.out.println("chances left: " + (secretword.length() - 2));
        display = new char[secretword.length()];
        System.out.println(secretword);
        for (int i = 0; i < secretword.length(); i++) {
            display[i] = '_';
         }
        int x1 = new Random().nextInt(secretword.length());
        int x2 = new Random().nextInt(secretword.length());
        char[] secret = secretword.toCharArray();
        display[x1] = secret[x1];
        display[x2] = secret[x2];
         print();
    }
    public void print() {
        if (count == 0) {
        dis = " ";
        for (int i = 0; i < secretword.length(); i++) {
            if (secretword.charAt(i) == '\'' || secretword.charAt(i) == ' ') {
                display[i] = secretword.charAt(i);
            }
            dis = dis + " " + display[i];
        }
        System.out.println(dis);
        hint();
        count++;
    } else {
        dis = " ";
        for (int i = 0; i < secretword.length(); i++) {
            if (secretword.charAt(i) == '\'' || secretword.charAt(i) == ' ') {
                display[i] = secretword.charAt(i);
            }
            dis = dis + " " + display[i];
        }
        System.out.println("chances left: " + cnt);
        String x = "";
        for (int j = 0; j < alphabet.length(); j++) {
            if (alphabet.charAt(j) != s1) {
                x += alphabet.charAt(j);
            }
        }
        alphabet = x;
         System.out.println("letters available:"     + alphabet);
         System.out.println("alphabets used so far:" + lett);
         System.out.println(dis);
         hint();
    }
    }
    public boolean wordguess() {
       System.out.println("Guess character");
        s1 = sd.nextLine().charAt(0);
        s1 = Character.toLowerCase(s1);
        lett += s1;
       for (int i = 0; i < secretword.length(); i++) {
        if (s1.equals(secretword.charAt(i))) {
            return true;
        }
       }
        return false;
    }
    public void playGame() {
        int playerss = 0; // take input from the user
        System.out.println("Enter the number of players");
        while (true) {
        try {
        playerss = Integer.parseInt(sd.nextLine());
        break;
        } catch (NumberFormatException e) {
            System.out.println("please enter positive integers only");
        }
    }
        Playercatalog ee = new Playercatalog();
        while (playerss > 0) {
        System.out.println("enter the name of the player :");
        String name = sd.nextLine();
        ee.players[ee.size++] = new Player(name, 0);
        System.out.println("please select the difficulty level:");
        System.out.println("Easy or Medium or Hard or any key for Random");
        s = sd.nextLine();
        s = s.toLowerCase();
        w = new Wordcatalog();
        w.catalog();
        if (s.equals("easy")) {
            int randomnumber = new Random().nextInt(8);
            secretword = w.easy[randomnumber].getWord().toLowerCase();
        } else if (s.equals("medium")) {
            int randomnumber = new Random().nextInt(7);
            secretword = w.medium[randomnumber].getWord().toLowerCase();
        } else if (s.equals("hard")) {
            int randomnumber = new Random().nextInt(7);
            secretword = w.hard[randomnumber].getWord().toLowerCase();
        } else {
            int randomnumber = new Random().nextInt(7);
            int randomnum = new Random().nextInt(3);
            if (randomnum == 1) {
                secretword = w.easy[randomnumber].getWord().toLowerCase();
            } else if (randomnum == 2) {
                secretword = w.medium[randomnumber].getWord().toLowerCase();
            } else {
                secretword = w.hard[randomnumber].getWord().toLowerCase();
            }
        }
        System.out.println(secretword);
        letters();
        cnt = secretword.length() - 2;

        while (cnt > 0) {
        if (wordguess()) {
            for (int i = 0; i < secretword.length(); i++) {
                if (secretword.charAt(i) == s1) {
                    display[i] = s1;
                }
            }
            print();
            if (secretword.equals(new String(display))) {
                System.out.println("congrats! you have won");
                flag = 1;
                break;
            }
        } else {
            System.out.println("wrong entry");
            String x = "";
            System.out.println("letters available :");
            for (int j = 0; j < alphabet.length(); j++) {
                if (alphabet.charAt(j) != s1) {
                    x += alphabet.charAt(j);
                }
            }
        alphabet = x;
        System.out.println(alphabet);
        System.out.println("letters used so far :" + lett);
        cnt--;
        System.out.println("changes Left: " + cnt);
        System.out.println(dis);
        hint();
        }
        if (cnt == 0) {

        System.out.println("you have failed exceeded number of chances");
        }
    }
    playerss--;
    if (flag == 1) {
    score = hintcount * 10 + cnt;
    }
    System.out.println("score" + " " + score);
    ee.players[ee.size - 1].score = score;
    lett = "";
    hintcount = 2;
    flag = 0;
  }
  Player[] finl = new Player[ee.size];
  for (int g = 0; g < ee.size; g++) {
      finl[g] = ee.players[g];
  }
  System.out.println(finl[0].name);
  Arrays.sort(finl);
  ee.show(finl);
        sd.close();
    }
}

