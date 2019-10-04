public class Queen extends Piece{
   public  Queen() {
    this.position.row = 7;
    this.position.column = 4;
   }
   boolean isValidMove(Position newPosition) {
       if (super.isValidMove(newPosition) == true){
       if (newPosition.row == this.position.row || newPosition.column == this.position.column || 
       Math.abs(newPosition.row - this.position.row) == Math.abs(newPosition.column - this.position.column)) {
           return true;
    }
   } 
    return false;
  }
}

