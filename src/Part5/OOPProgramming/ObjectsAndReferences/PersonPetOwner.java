package Part5.OOPProgramming.ObjectsAndReferences;

public class PersonPetOwner {
    private String name;
    private Pet pet;

    public PersonPetOwner(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }
    public String toString() {
        return this.name + ", has a friend called " + this.pet;
    }
}