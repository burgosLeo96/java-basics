package protalento.basics.heritance.example2;

public class Pawn extends ChessPiece {

    public Pawn(){
        super(1, 2);
    }

    @Override
    public void moveForward() {
        this.y += 1;
    }
}
