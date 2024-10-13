package student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void testStudentIsAdult() {
        assertDoesNotThrow(() -> {
            new Student("Владик", (byte) 20, 10);
        });
    }

    @Test
    public void testStudentIsNotAdult() {
        assertThrows(RuntimeException.class, () -> {
            new Student("Владик в прошлом", (byte) 10, 8.5f);
        });
    }

    @Test
    public void testStudentHasPassed() {
        Student student = new Student("Леон SSS Кеннеди", (byte) 22, 4.2f);
        assertTrue(student.hasPassed());
    }

    @Test
    public void testStudentHasNotPassed() {
        Student student = new Student("JDH", (byte) 19, 3.0f);
        assertFalse(student.hasPassed());
    }

    @Test
    public void testUpdateGradeValid() {
        Student student = new Student("Ирка", (byte) 19, 4.9f);
        student.setGrade(9.9f);
        assertEquals(9.9f, student.getGrade());
    }
}