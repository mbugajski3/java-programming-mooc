package Part8.SimilarityOfObjects;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        SimpleDate date1 = new SimpleDate(1, 7, 2026);
        SimpleDate date2 = new SimpleDate(1, 7, 2026);
        SimpleDate date3 = new SimpleDate(2, 7, 2026);
        SimpleDate date4 = new SimpleDate(1, 8, 2026);
        SimpleDate date5 = new SimpleDate(1, 7, 2027);

        System.out.println(date1.equals(date2));
        System.out.println(date1.hashCode() == date2.hashCode());

        System.out.println(date1.equals(date3));
        System.out.println(date1.hashCode() == date3.hashCode());

        System.out.println(date1.equals(date4));
        System.out.println(date1.hashCode() == date4.hashCode());

        System.out.println(date1.equals(date5));
        System.out.println(date1.hashCode() == date5.hashCode());

        System.out.println("---");

        HashMap<SimpleDate, String> events = new HashMap<>();

        events.put(date1, "Java study");

        System.out.println(events.get(date1));
        System.out.println(events.get(date2));
        System.out.println(events.get(date3));
        
    }
}
