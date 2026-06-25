package Part5.OOPProgramming.ObjectsAndReferences;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public int getSquares() {
        return this.squares;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.getSquares()) {
            return true;
        } else {
            return false;
        }
    }
}