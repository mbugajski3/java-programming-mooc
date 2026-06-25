package Part5.OOPProgramming.ObjectsAndReferences;

public class NullPointerException {
    public static void main(String[] args) {
        Person person = new Person("John");
        person = null;
        person.growOlder();
    }
}
