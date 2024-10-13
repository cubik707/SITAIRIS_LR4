package task;

public class Task {
    private String title;
    private boolean isCompleted;

    public Task(String title) {
        changeTitle(title);
        this.isCompleted = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void completeTask() {
        this.isCompleted = true;
    }

    public void changeTitle(String newTitle) {
        if (newTitle != null && !newTitle.isEmpty()) {
            this.title = newTitle;
        } else {
            throw new IllegalArgumentException("Название не может быть пустым");
        }
    }
}

