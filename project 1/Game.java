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
    String lett ="";
    Scanner sd = new Scanner(System.in);
    String hint1;
    String hint2;
    int hintcount = 2;
    int y = 0;
    String h;
    

    public void hint() {
        // Wordcatalog r = new Wordcatalog();
        System.out.println("press yes for hint, else press no");
        h = sd.nextLine();
        h = h.toLowerCase();
        System.out.println(w.words[2].word);
        if ((h.equals("yes")) && hintcount > y) {
        for(int i = 0; i < w.words.length; i++) {
            if(secretword.equals(w.words[i].word)) {
                if(hintcount == 2){
                    System.out.println(w.words[i].hint1);
                    hintcount--;
                } else {
                    System.out.println(w.words[i].hint2);
                    hintcount--;
            }
        }
        } 
        } else if (h.equals("no")) {
            
        }
    }
    public void letters() {
        System.out.println("letters available:");
        alphabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(alphabet);
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
        System.out.println(dis);
        System.out.println("chances left: " + cnt);
        System.out.println("letters available:");
        
        String x = "";
        for(int j = 0; j < alphabet.length(); j++) {
            if(alphabet.charAt(j) != s1) {
                x += alphabet.charAt(j);
            }
       
        }
        alphabet = x;
         System.out.println(alphabet);
         System.out.println("alphabets used so far:" + lett);
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
    public static void main(String[] args) {

        Game g = new Game();
        System.out.println("please select the difficulty level: Easy or Medium or Hard or Random");
        // Scanner sd = new Scanner(System.in);
        String s = g.sd.nextLine();
        s = s.toLowerCase();
        w = new Wordcatalog();
        w.catalog();
        if (s.equals("easy")) {
            int randomnumber = new Random().nextInt(8);
            g.secretword = w.easy[randomnumber].toLowerCase();   
        } else if (s.equals("medium")) {
            int randomnumber = new Random().nextInt(7);
            g.secretword = w.medium[randomnumber].toLowerCase();
        } else if(s.equals("hard")) {
            int randomnumber = new Random().nextInt(7);
            g.secretword = w.hard[randomnumber].toLowerCase();
        } else {
            int randomnumber = new Random().nextInt(7);
            int randomnum = new Random().nextInt(3);
            if(randomnum == 1) {
                g.secretword = w.easy[randomnumber].toLowerCase();
            } else if(randomnum == 2) {
                g.secretword = w.medium[randomnumber].toLowerCase();
            } else {
                g.secretword = w.hard[randomnumber].toLowerCase();
            }       
        }
        System.out.println(g.secretword);
        g.letters();
        g.cnt = g.secretword.length()-2;
        while (g.cnt > 0) {
        if (g.wordguess()) {
            for(int i = 0; i < g.secretword.length(); i++) {
                if(g.secretword.charAt(i) == g.s1) {
                    g.display[i] = g.s1;
                }
            }
            g.print(); 
            if(g.secretword.equals(new String(g.display))) {
                System.out.println("congrats! you have won");
                break;
            }
            
        } else {
            System.out.println("wrong entry");
            String x = "";
            System.out.println("letters available :");
            for(int j = 0; j < g.alphabet.length(); j++) {
                if(g.alphabet.charAt(j) != g.s1) {
                    x += g.alphabet.charAt(j);
                }
            }
        g.alphabet = x;
        System.out.println(g.alphabet);
        System.out.println("letters used so far :"+ g.lett);
        g.cnt--;
        System.out.println("changes Left: " + g.cnt);
        System.out.println(g.dis);
        }
        if(g.cnt == 0) {

        System.out.println("you have failed exceeded number of changes");
        
        }
    }
        g.sd.close();
    }
}
