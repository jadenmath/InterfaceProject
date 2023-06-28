//*****************************************************************
//  Main.java (Interface Project)       Created by: Jaden Mathew
//
//  This program creates 3 Task objects and assigns values to each one. It then uses the getter and setter methods to print the name, priority, and complexity of each task. It uses a try-with-resources block to get user input for the first task.
//*****************************************************************
// Import Scanner
import java.util.Scanner;

public class Main {
   public static void main(String[] args){

     // Initialize Variables
     String taskName;
     int priority, complexity;

     // Asks user input for the first task name, priority, and complexity on a scale of 1-3
     
     try(Scanner scan = new Scanner(System.in)) {
       System.out.println("What is the name of your first task?");
       taskName = scan.nextLine();

       System.out.println("What is the priority of your first task? (Enter value from 1-3)");
       priority = scan.nextInt();

       System.out.println("What is the complexity of your first task (Enter value from 1-3)");
       complexity = scan.nextInt();
     }

     // Creates 3 new Tasks, one using user input and 2 using hardcoded values
     
      Task task1 = new Task();
      Task task2 = new Task(2, 2, "Meet Mr. Moynihan @ Servite");
      Task task3 = new Task(1, 1, "Go to Mass and Pray the Rosary");

     // Utilizes setter and sets task1 values to user input
      task1.setPriority(priority);
      task1.setComplexity(complexity);
      task1.setName(taskName);

     // Utilizes getter and outputs all tasks
      System.out.println("Task 1 Name: " + task1.getName());
      System.out.println("Task 1 Priority: " + task1.getPriority());
      System.out.println("Task 1 Complexity: " + task1.getComplexity());

      System.out.println("Task 2 Name: " + task2.getName());
      System.out.println("Task 2 Priority: " + task2.getPriority());
      System.out.println("Task 2 Complexity: " + task2.getComplexity());
     
      System.out.println("Task 3 Name: " + task3.getName());
      System.out.println("Task 3 Priority: " + task3.getPriority());
      System.out.println("Task 3 Complexity: " + task3.getComplexity());
   }
}