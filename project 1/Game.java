import java.util.*;
public class Game{   
    static Wordcatalog w;
    String secretword;
    char[] display;
    String dis;
    Character s1;
    String alphabet;
    int count = 0;
    int cnt;
    String lett = "";
    Scanner sd = new Scanner(System.in);
    String hint1;
    String hint2;
    int hintcount =2;
    int y = 0;
    String h;
    int score = 0;
    int flag = 0;
    int size = 0;
    

    public void hint() {
        if (hintcount > 0 && secretword.equals(new String(display))) {
        System.out.println("press yes for hint, else press no");
        h = sd.nextLine();
        } 
        h = h.toLowerCase();
        if ((h.equals("yes")) && hintcount > 0) {
        for(int i = 0; i < w.words.length; i++) {
            if(secretword.equals(w.words[i].word.toLowerCase())) {
                if(hintcount == 2){
                    System.out.println(w.words[i].hint1);
                    hintcount--;
                } else if(hintcount == 1) {
                    System.out.println(w.words[i].hint2);
                    hintcount--;
            }
        }
        } 
        } else if (h.equals("no")) {
            
        }
    }
    public void letters() {
        // System.out.println("letters available:");
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
        
        if(count == 0) {
        dis = " ";
        for(int i = 0; i < secretword.length(); i++) {
            if (secretword.charAt(i) == '\'' || secretword.charAt(i) == ' ') {
                display[i] = secretword.charAt(i);
            }
            dis = dis + " "+ display[i];
        }
        System.out.println(dis);
        hint();
        count++;
    } else {
        dis = " ";
        for(int i = 0; i < secretword.length(); i++) {
            if (secretword.charAt(i) == '\'' || secretword.charAt(i) == ' ') {
                display[i] = secretword.charAt(i);
            }
            dis = dis + " "+ display[i];
        }
        // System.out.println(dis);
        // hint();
        System.out.println("chances left: " + cnt);
        //System.out.println("letters available:");
        
        String x = "";
        for(int j = 0; j < alphabet.length(); j++) {
            if(alphabet.charAt(j) != s1) {
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
       // Scanner sd = new Scanner(System.in);
       System.out.println("Guess character");
        s1 = sd.nextLine().charAt(0);
       // System.out.println(s1);
        s1 = Character.toLowerCase(s1);
        lett += s1;
        // System.out.println(s1);
       for(int i = 0; i < secretword.length(); i++) {
        if(s1.equals(secretword.charAt(i))) {
            return true;
        }
        // sd.close();
       }
        return false;
        
    }
    public void playGame() {

        // Game g = new Game();
        int playerss = 0; // take input from the user
        System.out.println("Enter the number of players");
        playerss = Integer.parseInt(sd.nextLine());
        Playercatalog ee = new Playercatalog();
        while (playerss > 0) {
        System.out.println("enter the name of the player :");
        String name = sd.nextLine();
        ee.players[size++] = new Player(name, 0);
        System.out.println("please select the difficulty level: Easy or Medium or Hard or Random");
        // Scanner sd = new Scanner(System.in);
        String s = sd.nextLine();
        s = s.toLowerCase();
        w = new Wordcatalog();
        w.catalog();
        if (s.equals("easy")) {
            int randomnumber = new Random().nextInt(8);
            secretword = w.easy[randomnumber].word.toLowerCase();   
        } else if (s.equals("medium")) {
            int randomnumber = new Random().nextInt(7);
            secretword = w.medium[randomnumber].word.toLowerCase();
        } else if(s.equals("hard")) {
            int randomnumber = new Random().nextInt(7);
            secretword = w.hard[randomnumber].word.toLowerCase();
        } else {
            int randomnumber = new Random().nextInt(7);
            int randomnum = new Random().nextInt(3);
            if(randomnum == 1) {
                secretword = w.easy[randomnumber].word.toLowerCase();
            } else if(randomnum == 2) {
                secretword = w.medium[randomnumber].word.toLowerCase();
            } else {
                secretword = w.hard[randomnumber].word.toLowerCase();
            }       
        }
        System.out.println(secretword);
        letters();
        cnt = secretword.length()-2;

        while (cnt > 0) {
        if (wordguess()) {
            for(int i = 0; i < secretword.length(); i++) {
                if(secretword.charAt(i) == s1) {
                    display[i] = s1;
                }
            }
            print(); 
            if(secretword.equals(new String(display))) {
                System.out.println("congrats! you have won");
                flag = 1; 
                break;
            }
            
        } else {
            System.out.println("wrong entry");
            String x = "";
            System.out.println("letters available :");
            for(int j = 0; j < alphabet.length(); j++) {
                if(alphabet.charAt(j) != s1) {
                    x += alphabet.charAt(j);
                }
            }
        alphabet = x;
        System.out.println(alphabet);
        System.out.println("letters used so far :"+ lett);
        cnt--;
        System.out.println("changes Left: " + cnt);
        System.out.println(dis);
        hint();
        }
        if(cnt == 0) {

        System.out.println("you have failed exceeded number of chances");
        
        }
        // assign scores
    }
    playerss--;
    if (flag == 1) {
    score = hintcount *10 + cnt;
    }
    System.out.println("score" +" " + score);
    ee.players[size - 1].score = score;
    lett = "";
    hintcount = 2;
    flag = 0;
  }
        sd.close();
    }
}
