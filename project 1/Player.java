/**
 * This class assigns names and scores to the players.
 * Also sorts the scores of the players in descending order.
 * return the string which contains name and score in a single line.
 */

class Player implements Comparable<Player> {

    /**
     * name stores the name of the player.
     */

    String name;

    /**
     * score stores the score of the player.
     */
    int score;

    /**
     * Assigning name and score to the players.
     * @param name assigns name to the player.
     * @param score assigns score to the player.
     */
    public Player(final String name, final int score) {
        this.name = name;
        this.score = score;
    }
    public int compareTo(final Player p) {
        return p.score - this.score;
    }
    public String toString() {
        String str = "";
        str += this.name + "   " + this.score;
        return str;
    }
}
