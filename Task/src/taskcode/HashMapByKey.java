package taskcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapByKey {
	public static void main(String args[])  
	{  
	//implementation of HashMap  
	HashMap<Integer, String> hm=new HashMap<Integer, String>();  
	//addding keys and values to HashMap  
	hm.put(10, "Shraddha");  
	hm.put(1, "abhi");  
	hm.put(2, "bhakti");  
	hm.put(9, "Neel");  
	Iterator <Integer> it = hm.keySet().iterator();         
	System.out.println("Before Sorting");  
	while(it.hasNext())  
	{  
	int key=(int)it.next();  
	System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));  
	}  
	System.out.println("\n");  
	Map<Integer, String> map=new HashMap<Integer, String>();  
	System.out.println("After Sorting");  
	//using TreeMap constructor to sort the HashMap  
	TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (hm);  
	Iterator itr=tm.keySet().iterator();               
	while(itr.hasNext())    
	{    
	int key=(int)itr.next();  
	System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));  
	}    
	}  
}
