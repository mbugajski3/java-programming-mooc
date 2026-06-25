package Part5.OOPProgramming.ObjectsAndReferences;

public class PersonTwin {
    private String name;
    private SimpleDate date;
    private int height;
    private int weight;

    public PersonTwin(String name, SimpleDate date, int height, int weight) {
        this.name = name;
        this.date = date;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public SimpleDate getDate() {
        return this.date;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public boolean equals (Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof PersonTwin)) {
            return false;
        }
        PersonTwin comparedPerson = (PersonTwin) compared;

        return (this.name.equals(comparedPerson.name) &&
                this.date.equals(comparedPerson.date) &&
                this.height == comparedPerson.height &&
                this.weight == comparedPerson.weight);


    }
}
