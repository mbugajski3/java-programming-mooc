package Part7.ProgrammingParadigms.LargerProgramming;

import java.util.ArrayList;

public class Birds {

    private ArrayList<Bird> birds;

    public Birds() {
        this.birds = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        this.birds.add(bird);
    }

    public ArrayList<Bird> getBirds() {
        return this.birds;
    }
}
