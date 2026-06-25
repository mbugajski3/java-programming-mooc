package Part5.OOPProgramming.ObjectsAndReferences;

public class HealthStation {

    public int weigh(Person person) {
        return person.getWeight();
    }
    public void feed(Person person) {
        int actualWeight = this.weigh(person);
        int newWeight = actualWeight + 1;
        person.setWeight(newWeight);
    }
}