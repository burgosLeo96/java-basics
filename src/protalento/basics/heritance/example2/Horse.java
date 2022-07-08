package protalento.basics.heritance.example2;

public class Horse extends ChessPiece {

    public Horse() {
        super(2, 1);
    }

    @Override
    public void moveForward() {
        this.x += 1;
        this.y += 2;
    }
}
