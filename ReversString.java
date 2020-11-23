package taskcode;

import java.util.Scanner;


class StringRev{
	public void Revers(String str)
	{
		
		char Arr[]=str.toCharArray();
			
	
		System.out.println("Revers string is:");
		for( int i=Arr.length-1;i>-1;i--)
		{
			System.out.print(Arr[i]);
		}
		
	}
}
public class ReversString {
	public static void main(String args[])
	{
		
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str=sobj.nextLine();
		
		StringRev obj=new StringRev();
		obj.Revers(str);

		
	}

}
