package protalento.basics.heritance.example2;

public abstract class ChessPiece {
    protected int x;
    protected int y;

    public ChessPiece(int x, int y){
        this.x = x;
        this.y = y;
    }
    public abstract void moveForward();

    public void retrievePosition() {
        System.out.printf("My position is: x: %d, y: %d. %n", this.x, this.y);
    }

}
