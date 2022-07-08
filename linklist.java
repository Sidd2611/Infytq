
import java.util.*;
public class Main
 {
  
  public static void main(String args[])
  {
    LinkedList<String> ll = new LinkedList<>();
  ///addition of element in linked list
    ll.add("hello");
    ll.add("how");
    ll.add("are");
   ll.add("you");
    System.out.println(ll);
    
    //changing element in linked list
        System.out.println("Initial LinkedList " + ll); 
    
        ll.set(1, "For"); 
    
        System.out.println("Updated LinkedList " + ll); 
        
        //Removal in linked list
         System.out.println( 
            "Initial LinkedList " + ll); 
    
        ll.remove(1); 
    
        System.out.println( 
            "After the Index Removal " + ll); 
    
        ll.remove("Geeks"); 
    
        System.out.println( 
            "After the Object Removal " + ll); 
        /// Iterating the LinkedList
         for (int i = 0; i < ll.size(); i++) { 
    
            System.out.print(ll.get(i) + " "); 
        } 
    
        System.out.println(); 
    
       
  }
}


