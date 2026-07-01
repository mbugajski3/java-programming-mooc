package Part8.SimilarityOfObjects;

import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== TEST 1: equals and ArrayList contains ===");

        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");

        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }

        System.out.println("Finnish: " + finnishPlates);
        System.out.println("Expected: [FI ABC-123, FI UXE-465]");

        System.out.println();

        System.out.println("=== TEST 2: hashCode and HashMap get ===");

        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println("Expected: Arto");

        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        System.out.println("Expected: Jürgen");

        System.out.println();

        System.out.println("=== TEST 3: VehicleRegistry add and get ===");

        VehicleRegistry registry = new VehicleRegistry();

        System.out.println(registry.add(new LicensePlate("FI", "ABC-123"), "Arto"));
        System.out.println("Expected: true");

        System.out.println(registry.add(new LicensePlate("FI", "UXE-465"), "Matti"));
        System.out.println("Expected: true");

        System.out.println(registry.add(new LicensePlate("D", "B WQ-431"), "Jürgen"));
        System.out.println("Expected: true");

        System.out.println(registry.get(new LicensePlate("FI", "ABC-123")));
        System.out.println("Expected: Arto");

        System.out.println(registry.get(new LicensePlate("FI", "UXE-465")));
        System.out.println("Expected: Matti");

        System.out.println(registry.get(new LicensePlate("D", "B WQ-431")));
        System.out.println("Expected: Jürgen");

        System.out.println(registry.get(new LicensePlate("PL", "GD-123")));
        System.out.println("Expected: null");

        System.out.println();

        System.out.println("=== TEST 4: adding duplicate plate ===");

        System.out.println(registry.add(new LicensePlate("FI", "ABC-123"), "Someone else"));
        System.out.println("Expected: false");

        System.out.println(registry.get(new LicensePlate("FI", "ABC-123")));
        System.out.println("Expected: Arto");

        System.out.println();

        System.out.println("=== TEST 5: remove ===");

        System.out.println(registry.remove(new LicensePlate("FI", "UXE-465")));
        System.out.println("Expected: true");

        System.out.println(registry.get(new LicensePlate("FI", "UXE-465")));
        System.out.println("Expected: null");

        System.out.println(registry.remove(new LicensePlate("FI", "UXE-465")));
        System.out.println("Expected: false");

        System.out.println();

        System.out.println("=== TEST 6: printLicensePlates ===");

        registry.add(new LicensePlate("PL", "GD-123"), "Michał");
        registry.add(new LicensePlate("PL", "GA-999"), "Michał");
        registry.add(new LicensePlate("FI", "ZZZ-999"), "Arto");

        System.out.println("License plates in registry:");
        registry.printLicensePlates();

        System.out.println("Expected: should print all license plates currently in registry");
        System.out.println("Order can be different because HashMap does not guarantee order.");

        System.out.println();

        System.out.println("=== TEST 7: printOwners ===");

        System.out.println("Owners in registry:");
        registry.printOwners();

        System.out.println("Expected: each owner only once");
        System.out.println("For example: Arto, Jürgen, Michał");
        System.out.println("Order can be different because HashMap does not guarantee order.");
    }
}

