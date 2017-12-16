package exercise3;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* It has three classes defined – SimpleArray.java, ArrayWriter.java and SharedArrayTest.java
	There are two threads created in this example. 
	Every thread is writing three integers values in a synchronized way, in a shared array of size six.
	You need to modify the above example as follows:
	
	#1. You need to create three threads instead of two.
	#2. You need to define array size of 9
	#3. Every thread is writing three random integer values in the following manner:
	•	Thread 1 is writing any three values in the range of 0 to 10
	•	Thread 2 is writing any three  values in the range of 11 to 20
	•	Thread 3 is writing any three  values in the range of 21 to 30
	*/
public class SharedArrayTest {
   public static void main(String[] arg) {
      // construct the shared object
      SimpleArray sharedSimpleArray = new SimpleArray(9);

      // create two tasks to write to the shared SimpleArray
      ArrayWriter writer1 = new ArrayWriter(1, sharedSimpleArray);
      ArrayWriter writer2 = new ArrayWriter(11, sharedSimpleArray);

      //new
      ArrayWriter writer3 = new ArrayWriter(21, sharedSimpleArray);
      
      // execute the tasks with an ExecutorService
      ExecutorService executorService = Executors.newCachedThreadPool();
      executorService.execute(writer1);
      executorService.execute(writer2);
      
      //new
      executorService.execute(writer3);
      
      executorService.shutdown();

      try {
         // wait 1 minute for both writers to finish executing
         boolean tasksEnded = executorService.awaitTermination(1, TimeUnit.MINUTES);

         if (tasksEnded) {
            System.out.printf("%nContents of SimpleArray:%n");
            System.out.println(sharedSimpleArray); // print contents
         }   
         else {
            System.out.println("Timed out while waiting for tasks to finish.");
         } 
      } 
      catch (InterruptedException ex) {
         ex.printStackTrace();
      }
   }
}

