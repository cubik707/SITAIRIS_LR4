package task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    public void testTaskIsNotCompletedInitially() {
        Task task = new Task("Отчислиться из универа");
        assertFalse(task.isCompleted());
    }

    @Test
    public void testCompleteTask() {
        Task task = new Task("Лаба 4 по сито и рису");
        task.completeTask();
        assertTrue(task.isCompleted());
    }

    @Test
    public void testChangeTaskTitle() {
        Task task = new Task("Прочитать книгу");
        task.changeTitle("Прочитать НОВУЮ книгу");
        assertEquals("Прочитать НОВУЮ книгу", task.getTitle());
    }

    @Test
    public void testChangeTaskTitleToInvalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("");
        });
    }

    @Test
    public void testGetTaskTitle() {
        Task task = new Task("Пойти в GYM");
        assertEquals("Пойти в GYM", task.getTitle());
    }
}