import java.util.Date;

public class Task implements Comparable<Task> {
    private int id;
    private String description;
    private boolean isCompleted;
    private Date dueDate=new Date();

    public Task(){

    }

    public Task(int id, String description, Date dueDate) {
        this.id = id;
        this.description = description;
        this.isCompleted = false;
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate2) {
        this.dueDate = dueDate2;
    }

    @Override
    public int compareTo(Task otherTask) {
        return this.dueDate.compareTo(otherTask.getDueDate());
    }
}
