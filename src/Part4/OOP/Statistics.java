package Part4.OOP;

public class Statistics {
    private int count;

    public Statistics(int numberCount) {
        this.count = numberCount;
    }

    public void addNumber(int number) {
        this.count = this.count + 1;
    }

    public int getCount() {
        return this.count;
    }
}