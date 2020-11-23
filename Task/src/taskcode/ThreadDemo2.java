package taskcode;

//Implementing Runnable Interface:
class ThreadDemo2 implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
	ThreadDemo2 m1=new ThreadDemo2();  
Thread t1 =new Thread(m1);  
t1.start();  
 }  
}  