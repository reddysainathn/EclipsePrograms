//TreeMap can not contain any null key.
//TreeMap maintains ascending order.

package treeMap;

import java.util.*;  
 public class TreeMapp{  
 public static void main(String args[]){  
   
  TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
  
  hm.put(100,"Amit");  
  hm.put(102,"Ravi");  
  hm.put(101,"Vijay");  
  hm.put(103,"Rahul");  
  
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  