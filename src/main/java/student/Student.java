package student;

public class Student {
    private String name;
    private byte age;
    private float grade;

    public Student(String name, byte age, float grade) {
        this.name = name;
        setAge(age);
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setAge(byte age) {
        if(age< 18){
            throw new RuntimeException("Возраст не может быть меньше 18");
        } else {
            this.age = age;
        }
    }

    public void setGrade(float grade) {
        if (grade >= 0 || grade <= 10) {
            this.grade = grade;
        } else {
            throw new RuntimeException("Оценка должна быть в промежутке от 0 до 10");
        }
    }

    public boolean hasPassed() {
        return grade >= 4.0;
    }

}
