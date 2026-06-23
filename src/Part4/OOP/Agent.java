package Part4.OOP;

public class Agent {
    private String name;
    private String lastName;

    public Agent(String agentName, String agentLastName) {
        this.name = agentName;
        this.lastName = agentLastName;
    }
    public String toString() {
        return "My name is " + this.lastName + ", " + this.name + " " + this.lastName;
    }
}
