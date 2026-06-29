import Part7.ProgrammingParadigms.Alghoritms.MainProgram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MainProgramTest {

    @Test
    public void smallestReturnsSmallestValue() {
        int [] numbers = {2, 4, 6, 8, 10, 12, 14};

        assertEquals(2, MainProgram.smallest(numbers));
    }

    @Test
    public void indexOfSmallestResult() {
        int [] numbers = {2, 4, 6, 8, 10, 12, 14};

        assertEquals(0, MainProgram.indexOfSmallest(numbers));
    }

    @Test
    public void findIndexOfSmallestFrom() {
        int [] numbers = {2, 4, 6, 8, 10, 12, 14};

        assertEquals(2, MainProgram.indexOfSmallestFrom(numbers, 2));
    }

}
