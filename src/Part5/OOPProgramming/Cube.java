package Part5.OOPProgramming;

public class Cube {
    private int edgeLength;

    public Cube (int edgeLength) {
        this.edgeLength = edgeLength;
    }
    public int volume() {
        if (this.edgeLength > 0) {
            return this.edgeLength * this.edgeLength * this.edgeLength;
        } else {
            return 0;
        }
    }
    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume();
    }
}
