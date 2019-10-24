public class Playercatalog{
    int size = 0;
    Player[] players = new Player[10];
    public void show(Player[] ps) {
        System.out.println("----Leaderboard---");
        System.out.println("Name"  + "  " +"score");
        for (int i = 0; i < ps.length; i++) {
            System.out.println(ps[i]);
        }
    }
}