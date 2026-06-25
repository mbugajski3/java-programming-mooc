package Part5.OOPProgramming.ObjectsAndReferences;

public class Item {
    private String itemIdentifier;
    private String itemName;

    public Item(String itemIdentifier, String itemName) {
        this.itemIdentifier = itemIdentifier;
        this.itemName = itemName;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Item)) {
            return false;
        }

        Item comparedItem = (Item) compared;

        return (this.itemIdentifier.equals(comparedItem.itemIdentifier));
    }

    @Override
    public String toString() {
        return this.itemIdentifier + ": " + this.itemName;
    }
}
