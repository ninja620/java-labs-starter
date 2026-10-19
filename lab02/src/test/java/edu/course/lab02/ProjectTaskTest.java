package edu.course.lab02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTaskTest {

    @Test
    void createValidTask() {
        ProjectTask task = new ProjectTask("T-1", "Отчет", 5);
        assertEquals("T-1", task.getId());
        assertEquals("Отчет", task.getTitle());
        assertEquals(5, task.getEstimatedHours());
        assertEquals(TaskStatus.TODO, task.getStatus());
        assertFalse(task.isCompleted());
    }

    @Test
    void nullId() {
        assertThrows(IllegalArgumentException.class, () -> new ProjectTask(null, "Отчет", 5));
    }

    @Test
    void blankId() {
        assertThrows(IllegalArgumentException.class, () -> new ProjectTask("  ", "Отчет", 5));
    }

    @Test
    void blankTitle() {
        assertThrows(IllegalArgumentException.class, () -> new ProjectTask("T-1", "", 5));
    }

    @Test
    void zeroHours() {
        assertThrows(IllegalArgumentException.class, () -> new ProjectTask("T-1", "Отчет", 0));
    }

    @Test
    void changeStatusToDone() {
        ProjectTask task = new ProjectTask("T-1", "Отчет", 5);
        task.changeStatus(TaskStatus.DONE);
        assertTrue(task.isCompleted());
    }

    @Test
    void changeStatusToNull() {
        ProjectTask task = new ProjectTask("T-1", "Отчет", 5);
        assertThrows(IllegalArgumentException.class, () -> task.changeStatus(null));
        assertEquals(TaskStatus.TODO, task.getStatus());
    }

    @Test
    void increaseEstimate() {
        ProjectTask task = new ProjectTask("T-1", "Отчет", 5);
        task.increaseEstimate(3);
        assertEquals(8, task.getEstimatedHours());
    }

    @Test
    void increaseEstimateByZero() {
        ProjectTask task = new ProjectTask("T-1", "Отчет", 5);
        assertThrows(IllegalArgumentException.class, () -> task.increaseEstimate(0));
        assertEquals(5, task.getEstimatedHours());
    }
}
