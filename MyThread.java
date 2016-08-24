class MyThread{
    public static void main(String[] args){
	  
	    //Thread
	    PrimeThread pt = new PrimeThread();
		pt.setDaemon(true);//Daemon Thread will be quit when main Thread is quit
		pt.start();
		
		//Runnable Thread
		PrimeRunnable pr = new PrimeRunnable();
		new Thread(pr).start();
		new Thread(pr).start();;
		new Thread(pr).start();;
		new Thread(pr).start();;
		
		int index = 0;
		while(true){
		if(index++ == 1000) break;
	    System.out.println("main thead name = " +Thread.currentThread().getName());
		}
	}
}
class PrimeThread extends Thread{
    public void run(){
	    while(true){
		System.out.println("PrimeThead thread name = " + getName());
		//yield();
		}
		}
 }
 
 //Runnable virtue than extends Thread
 //1.Runnable is interface,so PrimeRunnable still can extends a class.
 //2.can sync the sam resource.
 //note:inner class also can impliment it
 class PrimeRunnable implements Runnable{
     int index = 0;
     public void run(){
	     while(true){
		     System.out.println("PrimeRunnable name = " +Thread.currentThread().getName() + ":" + index++);
		 }
	 }
 
 }