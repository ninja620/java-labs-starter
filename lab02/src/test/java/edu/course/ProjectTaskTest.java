package edu.course.lab02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTaskTest {

    @Test
    void createValidTask() {
        ProjectTask task = new ProjectTask("1", "Задача", 5);
        assertEquals("1", task.getId());
        assertEquals("Задача", task.getTitle());
        assertEquals(5, task.getEstimatedHours());
        assertEquals(TaskStatus.TODO, task.getStatus());
        assertFalse(task.isCompleted());
    }

    @Test
    void nullId() {
        assertThrows(IllegalArgumentException.class, () -> new ProjectTask(null, "Задача", 5));
    }

    @Test
    void blankId() {
        assertThrows(IllegalArgumentException.class, () -> new ProjectTask("  ", "Задача", 5));
    }

    @Test
    void blankTitle() {
        assertThrows(IllegalArgumentException.class, () -> new ProjectTask("1", "", 5));
    }

    @Test
    void zeroHours() {
        assertThrows(IllegalArgumentException.class, () -> new ProjectTask("1", "Задача", 0));
    }

    @Test
    void changeStatusToDone() {
        ProjectTask task = new ProjectTask("1", "Задача", 5);
        task.changeStatus(TaskStatus.DONE);
        assertTrue(task.isCompleted());
    }

    @Test
    void changeStatusToNull() {
        ProjectTask task = new ProjectTask("1", "Задача", 5);
        assertThrows(IllegalArgumentException.class, () -> task.changeStatus(null));
        assertEquals(TaskStatus.TODO, task.getStatus());
    }

    @Test
    void increaseEstimate() {
        ProjectTask task = new ProjectTask("1", "Задача", 5);
        task.increaseEstimate(3);
        assertEquals(8, task.getEstimatedHours());
    }

    @Test
    void increaseEstimateByZero() {
        ProjectTask task = new ProjectTask("1", "Задача", 5);
        assertThrows(IllegalArgumentException.class, () -> task.increaseEstimate(0));
        assertEquals(5, task.getEstimatedHours());
    }
}
