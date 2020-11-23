package taskcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
 

public class EmpById {
	
	public static void main(String[] args) {
		 
		  List<Employee> emps = new ArrayList<>();
		 
		  emps.add(new Employee(1998, "shraddha",22));
		  emps.add(new Employee(1988, "Shubhangi", 30));
		  emps.add(new Employee(1987, "Neel", 31));
		 
		  System.out.println("Before sorting custom list of employees : ");
		  Iterator<Employee> it = emps.iterator();
		  while (it.hasNext()) {
		   System.out.println(it.next());
		  }
		  Collections.sort(emps);
		 
		  System.out.println("After sorting custom list of employees in natural order: ");
		  it = emps.iterator();
		  while (it.hasNext()) {
		   System.out.println(it.next());
		  }
		 
		  Collections.sort(emps, Collections.reverseOrder());
		 
			/*
			 * System.out.
			 * println("After sorting custom list of employees in decendng order: "); it =
			 * emps.iterator(); while (it.hasNext()) { System.out.println(it.next()); }
			 */
		 
		 }

}
