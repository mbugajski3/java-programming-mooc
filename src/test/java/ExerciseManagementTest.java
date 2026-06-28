import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ExerciseManagementTest {
    private ExerciseManagement exerciseManagement;

    @BeforeEach
    public void initialize() {
        exerciseManagement = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeggining() {
        assertEquals(0, exerciseManagement.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        exerciseManagement.add("Write a test");
        assertEquals(1, exerciseManagement.exerciseList().size());
    }

    @Test
    public void addedExercisesIsInList() {
        exerciseManagement.add("Write a test");
        assertTrue(exerciseManagement.exerciseList().contains("Write a test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        exerciseManagement.add("New exercise");
        exerciseManagement.markAsCompleted("New exercise");
        assertTrue(exerciseManagement.isCompleted("New exercise"));
    }
}
