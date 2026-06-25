package Part5.OOPProgramming.ObjectsAndReferences;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;

        while (newCents > 100) {
            newEuros++;
            newCents = newCents - 100;
        }

        return new Money(newEuros, newCents);
    }
    public boolean lessThan(Money compared) {
        return (this.euros < compared.euros);
    }

    public Money minus(Money decreaser) {
        int thisTotalCents = this.euros * 100 + this.cents;
        int decreaserTotalCents = decreaser.euros * 100 + decreaser.cents;

        int difference = thisTotalCents - decreaserTotalCents;

        if (difference < 0) {
            difference = 0;
        }

        int newEuros = difference / 100;
        int newCents = difference % 100;

        return new Money(newEuros, newCents);
    }
}