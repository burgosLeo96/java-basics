package protalento.basics.heritance.example2;

public class Queen extends ChessPiece {

    public Queen(){
        super(5, 1);
    }

    @Override
    public void moveForward() {
        this.x += 5;
        this.y += 5;
    }
}
