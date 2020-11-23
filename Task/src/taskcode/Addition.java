package taskcode;

import java.util.Scanner;


class DigitSum{
	int sum=0,temp=0;
	public int AddFun(int No)
	{

		while(No!=0)
		{
			temp=No%10;
			sum=sum+temp;
			No=No/10;
		}
		return sum;
	}
}
public class Addition {
	public static void main(String args[])
	{
	
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int No=sobj.nextInt();
		
		DigitSum obj=new DigitSum();
		
		int iRet=obj.AddFun(No);
		
		System.out.println("Addition is:"+iRet);
		
		
	}

}
