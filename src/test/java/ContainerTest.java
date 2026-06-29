import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerTest {
    private Container container;

    @BeforeEach
    public void initialize() {
        container = new Container();
    }

    @Test
    public void containerAmount() {
        assertEquals(0, container.contains());
    }

    @Test
    public void containerAddAmount() {
        container.add(50);
        assertEquals(50, container.contains());
    }

    @Test
    public void containerRemoveAmount() {
        container.add(50);
        assertEquals(50, container.contains());
        container.remove(60);
        assertEquals(0, container.contains());
    }

    @Test
    public void containerToString() {
        container.add(20);
        container.remove(10);
        assertEquals("10/100", container.toString());
        container.add(200);
        assertEquals("100/100", container.toString());
    }
}
