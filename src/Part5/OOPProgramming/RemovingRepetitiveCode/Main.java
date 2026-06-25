package Part5.OOPProgramming.RemovingRepetitiveCode;

public class Main {
    public static void main (String[] args) {
        Counter counter = new Counter(20);
        System.out.println(counter);

        counter.increase();
        System.out.println(counter);

        counter.decrease();
        System.out.println(counter);

        counter.increase(100);
        System.out.println(counter);

        counter.decrease(25);
        System.out.println(counter);
    }
}
