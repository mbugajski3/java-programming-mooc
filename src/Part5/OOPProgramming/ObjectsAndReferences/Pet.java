package Part5.OOPProgramming.ObjectsAndReferences;

public class Pet {
    private String petName;
    private String petBreed;

    public Pet(String petName, String petBreed) {
        this.petName = petName;
        this.petBreed = petBreed;
    }
    public String toString() {
        return this.petName + " (" + this.petBreed + ")";
    }
}
