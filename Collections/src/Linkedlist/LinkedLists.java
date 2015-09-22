package Linkedlist;
		/*
		 * LinkedLists consist of elements where each elements has a referennce to the previous and next element
		 * [0]<=>[1]<=>[2]<=>[3]<=>[4]=>......
		 */
		
import java.util.*;  
public class LinkedLists{  
	
 public static void main(String args[]){  

  LinkedList<String> al=new LinkedList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  