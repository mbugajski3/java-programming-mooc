package Part8.SimilarityOfObjects;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private final HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.owners.containsKey(licensePlate)) {
            this.owners.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(LicensePlate licensePlate) {
        return this.owners.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.owners.containsKey(licensePlate)) {
            this.owners.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.owners.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> carOwners = new ArrayList<>();

        for (String owner : this.owners.values()) {
            if (!carOwners.contains(owner)) {
                System.out.println(owner);
                carOwners.add(owner);
            }
        }
    }
}
