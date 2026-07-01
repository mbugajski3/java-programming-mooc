package Part8.GroupingDataUsingHash;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private final HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (!dictionary.containsKey(word)) {
            dictionary.put(word, new ArrayList<>());
        }

        dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> translations = new ArrayList<>();

        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        return new ArrayList<>();
    }

    public void remove(String word) {
        if (this.dictionary.containsKey(word)) {
            dictionary.remove(word);
        }
    }
}
