package taskcode;
public class ThreadDemo1 extends Thread {
	 
public void run() {
for(int i=0;i<10;i++) {
System.out.println("Music Playing ...... ");
}
}
 
public static void main(String Args[])
{
 
	ThreadDemo1 p=new ThreadDemo1();
p.start();
 
for(int i=0;i<10;i++) {
System.out.println("coding");
}
}
}
