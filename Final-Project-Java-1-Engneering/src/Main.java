import java.util.Scanner;
public class Main {

   static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        run();


    }

public static void run() {
    screen();
   int num =  input();
   choice(num);
}
public static void screen() {
    System.out.println("\t \t \t <!=== Hello World , choose number ===!>");
    System.out.println("1. Add a new task");
    System.out.println("2. Remove an existing task");
    System.out.println("3. Edit a task");
    System.out.println("4. Mark a task as completed");
    System.out.println("5. List all tasks");
    System.out.println("6. Sort tasks by date");
    System.out.println("7. Exit");
}
public static int input() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int num = input.nextInt();
    if(num <=1 && num >= 6)
        input();
        return num;
    }

public static void choice(int num) {
    switch(num){
        case 1:
       /// add();
        break;
        case 2:
        //remove();
        break;
        case 3:
       // edit();
        break;
        case 4:
       // Mark();
        break;
        case 5:
       // obj.listasks();
        case 6:
     //   Sort();
        break;
        case 7:
      //  System.exit(0);
        
        
    }

}
public void add(){
    System.out.print("Enter task description: ");
        input.nextLine(); // Consume the newline character
        String description = input.nextLine();

        System.out.print("Enter due date (MM DD YYYY): ");
        int month = input.nextInt();
        int day = input.nextInt();
        int year = input.nextInt();
        Date dueDate = new Date(day, month, year);
        Task task = new Task();
        task.setDescription(description);
        task.setDueDate(dueDate);

        int taskId = Task.size() + 1;
        Task task = new Task(taskId, description, dueDate);
        taskList.addTask(task);
        System.out.println("Task added successfully.");

}
    }


