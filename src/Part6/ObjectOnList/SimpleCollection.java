package Part6.ObjectOnList;
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String elementsInCollection = "";

        for (String element : elements) {
            elementsInCollection = elementsInCollection + element + "\n";
        }

        if (this.elements.size() == 1) {
            return "The collection " + this.name + " has " + this.elements.size() +
                    " element: " + "\n" + elementsInCollection;
        } else {
            return "The collection alphabet has " + this.elements.size() +
                    " elements: " + "\n" + elementsInCollection;
        }
    }

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }

        String longestElement = this.elements.get(0);

        for (String element : elements) {
            if (element.length() > longestElement.length()) {
                longestElement = element;
            }
        }
        return longestElement;
    }
}