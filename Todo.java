// TodoList by using command line interface 
import java.util.Scanner; // for user input
import java.util.ArrayList; // data structure to store tasks
import java.util.InputMismatchException;
// exception handling 
 class TodoList{
     ArrayList<String>  tasks;
     TodoList(){
          // constructor to create object of ArrayList
          tasks = new ArrayList<>();
     }
     
     // adding Task 
     public void addTask(String task){
         tasks.add(task);
         System.out.println("Task Added : "+ task);
     }
     
     // editing task
     public void editTask(int index,String newtask){
         if(index >= 0 && index < tasks.size()){
          String oldtask  = tasks.set(index,newtask);
          System.out.println("Task edited : "+ oldtask +"->"+ newtask);
         }
          else{
              System.out.println("Invalid index");
          }
     }
     
     // marking task as completed 
     public void completedTask(int index){
       if(index >= 0 && index < tasks.size()){
           String  completed_task = tasks.get(index);
           if(completed_task.endsWith("✓") ){
               System.out.println("Task already completed");
           }
           else{
          completed_task = tasks.get(index)+" ✓";
          String oldtask  = tasks.set(index,completed_task);
          System.out.println("Task marked as Completed: "+ tasks.get(index));
         }
       
          }
       
       else{
           System.out.println("Invalid index");
     }
     }
     
     // removing task 
     public void removeTask(int index){
         if(index >= 0 && index < tasks.size()){
             String task = tasks.remove(index);
             System.out.println("Task removed: "+ task);
             
         }
         else{
             System.out.println("Invalid  index");
            }
         
     }
         // displaying task
         public void showTask (){
             if(tasks.isEmpty()){
                 System.out.println("List is empty");
             }
             else{
                 System.out.println("\nList of Tasks :");                 for(int i =0 ; i < tasks.size() ; i++){
                 System.out.println((i+1)+". "+ tasks.get(i));
                 }
             }
         }
     }
         
public class Todo{
	public static void main(String[ ] args) {
		TodoList list = new TodoList();
		Scanner sc = new Scanner(System.in);
		char choice;
		// do while loop 
		do{
		    System.out.println("\n1. Add Task \n2. Edit Task \n3. Mark as Completed \n4. Remove Task\n5. Show List\n6. Exit\n");
		    System.out.println("Enter your choice : ");             // for getting character as user input
		    choice = sc.next().charAt(0);
		    sc.nextLine(); // consume the newtline character
		    
		    // switch case block
      switch(choice){
		   case '1':
		       System.out.println("Enter your task: ");
		       String task = sc.nextLine();
		       list.addTask(task);
		       break;
		       
		    case '2':
		    if(list.tasks.isEmpty()){
		         System.out.println("List is empty");
		     }
		     else{
		       System.out.println("Enter index of task to edit");
		       try{
		       int index = sc.nextInt();
		       sc.nextLine();
		       System.out.println("Enter edited task : ");
		       String newtask = sc.nextLine();
		       list.editTask(index - 1, newtask); // adjust indexed to 0 based
		       }
		       catch(InputMismatchException e){
		           System.out.println("Input Mismatched ");
		           sc.nextLine();
		       }
		     }
		       break;
		       
		     case '3':
		     // check if list is empty 
		        if(list.tasks.isEmpty()){
		         System.out.println("List is empty");
		     }
		     else{
		        System.out.println("Enter index of task to Mark as completed");
		        // exception handling using try catch block
		           try{
		         int  index = sc.nextInt();
		       list.completedTask(index - 1); // adjust indexed to 0 based
		       }
		       catch(InputMismatchException e){
		           System.out.println("Input Mismatched ");
		           sc.nextLine();// consume the newtline character
		       }
		     }
		       break;
		     
		   case '4':
		   // check if list is empty 
		     if(list.tasks.isEmpty()){
		         System.out.println("List is already empty");
		     }
		     else{
		   System.out.println("Enter index of task to remove:");
		   // try catch block for exception handling 
		      try{
		      int  index = sc.nextInt();
		       list.removeTask(index - 1); // adjust indexed to 0 based 
		       }
		       catch(InputMismatchException e){
		           System.out.println("Input Mismatched ");
		           sc.nextLine(); // consume the newtline character 
		       }
		     }
		       break;
		    
		    case '5':
		        list.showTask();
		        break;
		        
		     case '6':
		        System.out.println("Thank you,\nsee you later");
		        break;
		        
		        // default choice 
		     default:
		        System.out.println("Invalid choice");
      }
      
		} while(choice != '6'); // do while loop to iterates the operations
		        
		
	}
}