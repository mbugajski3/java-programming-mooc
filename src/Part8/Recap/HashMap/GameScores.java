package Part8.Recap.HashMap;

import java.util.HashMap;

public class GameScores {
    private final HashMap<String, Integer> scores;

    public GameScores() {
        this.scores = new HashMap<>();
    }

    public void addScore(String player, int score) {
        if (!this.scores.containsKey(player)) {
            this.scores.put(player, score);
        } else {
            int oldScore = this.scores.get(player);

            if (score > oldScore) {
                this.scores.put(player, score);
            }
        }
    }

    public int getScore(String player) {
        return this.scores.getOrDefault(player, 0);
    }

    public boolean hasPlayer(String player) {
        return this.scores.containsKey(player);
    }
}
