package Part8.Recap.HashMap;

import java.util.HashMap;

public class WordCounter {
    private final HashMap<String, Integer> words;

    public WordCounter() {
        this.words = new HashMap<>();
    }

    public void addWord(String word) {
        int amount = words.getOrDefault(word, 0);
        amount++;

        this.words.put(word, amount);


    }

    public int timesAdded(String word) {
        return words.getOrDefault(word, 0);
    }

    public boolean hasWord(String word) {
        return this.words.containsKey(word);
    }
}
