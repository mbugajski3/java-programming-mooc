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
    public int getPricePerSquare() {
        return this.pricePerSquare;
    }
    public int getPrice() {
        return this.squares * this.pricePerSquare;
    }
    public int priceDifference(Apartment compared) {
        if (this.getPrice() > compared.getPrice()) {
            return this.getPrice() - compared.getPrice();
        } else if (this.getPrice() < compared.getPrice()) {
            return compared.getPrice() - this.getPrice();
        } else {
            return 0;
        }
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.getSquares()) {
            return true;
        } else {
            return false;
        }
    }
    public boolean moreExpensiveThan(Apartment compared) {
        if (this.getPrice() > compared.getPrice()) {
            return true;
        } else {
            return false;
        }
    }
}