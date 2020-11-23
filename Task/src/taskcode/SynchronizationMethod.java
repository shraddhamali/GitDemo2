package taskcode;


class MathClass1 
{
    synchronized void printNumbers(int n) throws InterruptedException 
    {
        for (int i = 1; i <= n; i++) 
        {
            System.out.println(Thread.currentThread().getName() + " :: "+  i);
            Thread.sleep(500);
        }
    }
}	  
	public class SynchronizationMethod{  
	    public static void main(String args[]) 
	    {
	        final MathClass1 mathClass = new MathClass1();
	 
	        //first thread
	        Runnable r = new Runnable() 
	        {
	            public void run() 
	            {
	                try {
	                    mathClass.printNumbers(3);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        };
	       
	        new Thread(r, "ONE").start();
	        new Thread(r, "TWO").start();
	    }	}  

