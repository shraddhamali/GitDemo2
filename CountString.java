package taskcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class StringCnt{
	public void Cnt(String str)
	{
		HashMap<Character, Integer> my_map = new HashMap<Character, Integer>();
	      char[] str_array = str.toCharArray();
	      for (char c : str_array){
	         if (my_map.containsKey(c)){
	            my_map.put(c, my_map.get(c) + 1);
	         }else{
	            my_map.put(c, 1);
	         }
	      }
	      for (Map.Entry entry : my_map.entrySet()){
	         System.out.println(entry.getKey() + " " + entry.getValue());
	      }
}
}
public class CountString {
	public static void main(String args[]) {
		
	
	System.out.println("Its program is count the string");
	Scanner sobj = new Scanner(System.in);
	System.out.println("Enter the string");
	
	String str=sobj.nextLine();
	
	StringCnt obj=new StringCnt();
	obj.Cnt(str);
	}
}