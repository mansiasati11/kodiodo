package TASK;

import java.util.*;

public class Task1  {

public static void main(String[] args) {
	
	
	

	
	List<Student> al=new ArrayList();
  al.add(1 ,"ayushi", "20");
al.add(2,"bhushan","30");
al.add(3 ,"mansi","40");
 
	
	
	long as=  al.stream().sorted().count();
			
	
	System.out.println(as);

	}
	

}
