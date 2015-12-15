class NewThread implements Runnable {
   Thread t;
   boolean shouldStop = false;
   NewThread() {
      // Create a new, second thread
      t = new Thread(this, "Demo Thread");
      System.out.println("Child thread: " + t);
      t.start(); // Start the thread
   }

   // This is the entry point for the second thread.
   public void run() {
      try {
    	  while(!shouldStop) {
    		  CalcTest calcTest = new CalcTest();
          }
         
     } catch (InterruptedException e) {
         System.out.println("Calc test couldnt be instanciated.");
     }
     System.out.println("Exiting child thread.");
   }
   
   public void stopThread(){
	   shouldStop = true;
	   System.out.print("thread stop");
   }
}