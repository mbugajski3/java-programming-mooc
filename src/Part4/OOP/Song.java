package Part4.OOP;

public class Song {
    String name;
    int length;

    public Song(String songName, int lengthInSec) {
        this.name = songName;
        this.length = lengthInSec;
    }
    public String name() {
        return this.name;
    }
    public int length() {
        return this.length;
    }
}
