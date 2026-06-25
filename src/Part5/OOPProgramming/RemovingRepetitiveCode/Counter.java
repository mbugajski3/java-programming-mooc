package Part5.OOPProgramming.RemovingRepetitiveCode;

public class Counter {
    private int startValue;

    public Counter(int startValue) {
        this.startValue = startValue;
    }
    public Counter() {
        this.startValue = 0;
    }
    public int value() {
        return this.startValue;
    }
    public void increase() {
        this.startValue = this.startValue + 1;
    }
    public void decrease() {
        this.startValue = this.startValue - 1;
    }
}
