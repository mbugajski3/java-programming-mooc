package Part5.OOPProgramming.ObjectsAndReferences;

public class HealthStation {

    int weighCount = 0;

    public int weigh(Person person) {
        weighCount++;
        return person.getWeight();
    }
    public void feed(Person person) {
        int actualWeight = this.weigh(person);
        int newWeight = actualWeight + 1;
        person.setWeight(newWeight);
    }
    public int weighings() {
        return weighCount;
    }
}