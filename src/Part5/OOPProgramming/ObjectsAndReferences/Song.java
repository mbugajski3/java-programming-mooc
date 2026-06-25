package Part5.OOPProgramming.ObjectsAndReferences;

public class Song {
    private String songName;
    private String authorName;
    private int songDuration;

    public Song(String songName, String authorName, int songDuration) {
        this.songName = songName;
        this.authorName = authorName;
        this.songDuration = songDuration;
    }
    public String getSongName() {
        return this.songName;
    }
    public String getAuthorName() {
        return this.authorName;
    }
    public int getSongDuration() {
        return this.songDuration;
    }
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Song)) {
            return false;
        }

        Song comparedSong = (Song) compared;

        return this.songName.equals(comparedSong.songName)
                && this.authorName.equals(comparedSong.authorName)
                && this.songDuration == comparedSong.songDuration;

    }
}
