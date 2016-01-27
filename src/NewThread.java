class NewThread implements Runnable {
   Thread t;
   boolean shouldStop = false;
   int count = 1;
   NewThread() {
     /* t = new Thread(this, "Demo Thread");
      System.out.println("Child thread: " + t);
      t.start();*/
     
   }

   // This is the entry point for the second thread.
   public void run() {
      try {
    	  while(!CalcTest2.appFound) {
    		  CalcTest2 calcTest2 = new CalcTest2();
    		  
    		  count++;
    		  System.out.println("count: " + count);
          }
         
     } catch (InterruptedException e) {
         System.out.println("Calc test couldnt be instanciated.");
     }
     
     System.out.println("Exiting child thread.");
     this.stopThread();
   }
   
   public void stopThread(){
	   shouldStop = true;
	   System.out.print("thread stop");
   }
}