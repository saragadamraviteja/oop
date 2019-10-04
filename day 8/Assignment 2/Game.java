class Game {
    Piece [][] board;
    // Constructor creates an empty board
    Game() {
    board = new Piece[8][8];
    }

    public static void main(String[] args){
        Queen q = new Queen();
        Position p = new Position(5,1);
        if (q.isValidMove(p) == true) {
            System.out.println("perfect move");
        }
        else {
            System.out.println("bad move");
        }

    } 
    

}