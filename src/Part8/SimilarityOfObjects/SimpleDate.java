package Part8.SimilarityOfObjects;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof SimpleDate)) {
            return false;
        }

        SimpleDate comparedObject = (SimpleDate) compared;

        return (this.day == comparedObject.day &&
                this.month == comparedObject.month &&
                this.year == comparedObject.year);
    }

    @Override
    public int hashCode() {
        return this.year + this.month + this.day;
    }
}