package colas;

import java.util.PriorityQueue;
import java.util.Queue;
/**
 *
 * @author Diana
 */
public class Colas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Queue<String> cola=new PriorityQueue<>();
       cola.add("a");
       cola.add("b");
       cola.add("c");
       cola.add("d");
       cola.add("e");
         
        for(String c: cola){
            System.out.println(c);
        }
        System.out.println("-------");
        System.out.println("poll= "+cola.poll());
        
        for(String c:cola){
            System.out.println(c);
        }
        System.out.println("-------");
        
        System.out.println("element= "+cola.element());
        for(String c:cola){
            System.out.println(c);
        }
        
        System.out.println("------");
        
        System.out.println("peek= " + cola.peek());
                for(String c:cola){
            System.out.println(c);
        }    
    }  
}
