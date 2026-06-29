package Part7.ProgrammingParadigms.LargerProgramming;

public class Bird {

    private String name;
    private String nameLatin;
    private int observation;

    public Bird(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observation = 0;
    }

    public void addObservation() {
        this.observation++;
    }

    public String getName() {
        return this.name;
    }

    public String getNameLatin() {
        return this.nameLatin;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.nameLatin + "): " + this.observation + " observations";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bird compared)) {
            return false;
        }

        return (this.name.equals(compared.getName()));
    }
}
