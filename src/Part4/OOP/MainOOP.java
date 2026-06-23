package Part4.OOP;

public class MainOOP {
    public static void main (String[] args) {
        Statistics statistics = new Statistics(0);
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
    }
}
