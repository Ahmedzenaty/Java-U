import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TakList {
    ArrayList<Task> list = new ArrayList<Task>();
    ArrayList<String> listDates = new ArrayList<String>();


    // Method
    void addTask(Task task){
        list.add(task);
    }
    void removeTask(int taskId){
        for (Task task : list) {
            if(task.getId() == taskId){
                list.remove(taskId);
            }
        }
    }
    Task geTask(int taskId){
        return list.get(taskId);
    }
    void markTaskAsCompleted(int taskId){
       
    }
    void listTasks(){
        System.out.println("\t \t Id" + "\t Description"+"\t \t Date"+"\t \t Done");
        for (Task task : list) {
        System.out.println("\t \t "+task.getId() + "\t "+task.getDescription()+"\t \t "+task.getDueDate()+"\t \t "+task.isCompleted());
        }
    }
    public void sortTasksByDate() {
        Collections.sort(list);
        for (Task task: list) {
        System.out.println(task);
        }
    }

    void edit(int taskId,String newDescription,Date newDate){
        for (Task task : list) {
            if(taskId == task.getId()){
                task.setDescription(newDescription);
                
            }
        }
    }
}

