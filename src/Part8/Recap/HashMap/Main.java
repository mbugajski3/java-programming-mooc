package Part8.Recap.HashMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();

        names.put("Matthew", "Matt");
        names.put("Michael", "Mix");
        names.put("Arthur", "Artie");

        System.out.println(names.get("Matthew"));
    }
}
