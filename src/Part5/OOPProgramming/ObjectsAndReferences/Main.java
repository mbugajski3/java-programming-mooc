package Part5.OOPProgramming.ObjectsAndReferences;

public class Main {
    public static void main(String[] args) {
        Pet lucy = new Pet("Lucy", "golden retriever");
        PersonPetOwner leo = new PersonPetOwner("Leo", lucy);

        System.out.println(leo);
    }
}