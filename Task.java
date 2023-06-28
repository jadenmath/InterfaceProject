//*****************************************************************
//  Task.java (Interface Project)       Created by: Jaden Mathew
//
//  This class implements the Priority, Complexity, and Comparable interfaces and represents a task with a priority, complexity, and name. It contains methods to get and set the priority, complexity, and name of a task and also has a compareTo() method which compares the priority of the task to another task.
//*****************************************************************
public class Task implements Priority, Complexity, Comparable<Task>{
  // Declare variables
   private int priority;
   private int complexity;
   private String taskName;
   
   // Default constructor
   public Task(){
      this.priority = 0;
      this.complexity = 0;
      this.taskName = "";
   }
   
   // Overloaded constructor
   public Task(int priority, int complexity, String taskName){
      this.priority = priority;
      this.complexity = complexity;
      this.taskName = taskName;
   }
   
   // Getters and Setters
   public int getPriority(){
      return this.priority;
   }
   
   public void setPriority(int priority){
      this.priority = priority;
   }
   
   public int getComplexity(){
      return this.complexity;
   }
   
   public void setComplexity(int complexity){
      this.complexity = complexity;
   }
   
   public String getName(){
      return this.taskName;
   }
   
   public void setName(String taskName){
      this.taskName = taskName;
   }
   
   // Implements Comparable interface
   public int compareTo(Task other){
      if(this.priority > other.priority){
         return 1;
      }
      else if(this.priority < other.priority){
         return -1;
      }
      else{
         return 0;
      }
   }
}