class Player implements Comparable<Player>{
    String name;
    int score;
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public int compareTo(Player p) {
        return p.score - this.score;
    }
    public String toString() {
        String str = "";
        str += this.name + "   " + this.score;
        return str;
    }


}