package Part8.SimilarityOfObjects;

public class LicensePlate {

    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof LicensePlate)) {
            return false;
        }


        LicensePlate plate = (LicensePlate) compared;

        return (this.liNumber.equals(plate.liNumber) &&
                this.country.equals(plate.country));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.liNumber.hashCode();
        hash = 31 * hash + this.country.hashCode();
        return hash;
    }
}