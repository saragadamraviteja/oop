/**
 * we are maintaining the players objects in a players array.
 * we are displaying the leader board of different players
 * with their scores and names in descending order.
 */
public class Playercatalog {

    /**
     * size it represents the size of an array.
     */

    int size = 0;

    /**
     * Players array stores the objects of an players.
     */

    Player[] players = new Player[10];
    /**
     * Leader board of names of the players with their scores.
     * @param ps taking input parameter which the array of players.
     */
    public void show(final Player[] ps) {
        System.out.println("----Leaderboard---");
        System.out.println("Name"  + "  " + "score");
        for (int i = 0; i < ps.length; i++) {
            System.out.println(ps[i]);
        }
    }
}
