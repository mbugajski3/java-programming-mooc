package Part8.Recap.HashMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        WordCounter counter = new WordCounter();

        counter.addWord("java");
        counter.addWord("java");
        counter.addWord("map");
        counter.addWord("code");
        counter.addWord("code");
        counter.addWord("code");

        System.out.println(counter.timesAdded("java"));
        System.out.println(counter.timesAdded("map"));
        System.out.println(counter.timesAdded("code"));
        System.out.println(counter.timesAdded("python"));

        System.out.println(counter.hasWord("java"));
        System.out.println(counter.hasWord("python"));
    }
}
