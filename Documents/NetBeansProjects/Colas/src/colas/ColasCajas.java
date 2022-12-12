package colas;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author Diana
 */
public class ColasCajas {

    //public static ArrayList<String> nom = new ArrayList();
    public static void main(String[] args) {
       ArrayList<String> nombres = llenarNombres();
       //tomamos metodos de la clase Atendidos declarada en pila
       Stack<Atendidos> cajas = llenarPila(nombres);
        
       System.out.println(nombres);
        
        //llama a los datos de clase Atendidos
        for(Atendidos c : cajas){
            System.out.println(c.toString());
        }
    }

    //metodo donde esta declarada la lista
    public static ArrayList llenarNombres() {
        ArrayList<String> nom = new ArrayList<>();
        nom.add("Diana");
        nom.add("Areli");
        nom.add("Brisa");
        nom.add("Martin");
        nom.add("Jairo");
        nom.add("Ulises");
        nom.add("Angel");
        nom.add("Nicolas");
        nom.add("Cesar");
        nom.add("Carlos");
        nom.add("Erick");
        nom.add("Cristopher");
        nom.add("Carter");
        nom.add("Sandra");
        nom.add("Andrea");
        nom.add("Andres");
        nom.add("Sebastian");
        nom.add("Brayan");
        nom.add("Jenni");
        nom.add("Luis");
        nom.add("Marisol");
        nom.add("Victoria");
        nom.add("Margarita");
        nom.add("Victor");
        nom.add("Jose");
        nom.add("Cecilia");
        nom.add("Mariana");
        nom.add("Dante");
        nom.add("Ox");
        nom.add("Joe");
        return nom;
    }
    //consulta los nombres en aleatorio 
    public static String Consulta(ArrayList<String> Nombres){
        return Nombres.get(random()); 
    }
    //metodo que crea las 5 cajas donde se atienden los clientes
    public static Stack llenarPila(ArrayList<String>Nombres){
        Stack<Atendidos> cajasU = new Stack<>();
        //cajas que va a tener
        for (int i= 1; i<=5; i++){
           cajasU.push(new Atendidos("Caja"+ i + "", llenarCola(Nombres)));
        }
        return cajasU;
    }
     
    //llena la cola con datos 
    private static Queue<String> llenarCola(ArrayList<String> Nombres){
        Queue<String> colaNombres = new LinkedList<>();
        for(int i=1; i<random(); i++){
            colaNombres.offer(Consulta(Nombres));
        }
        return colaNombres;
    }
    
    //metodo obtiene valor aleatorio
    public static int random(){
        return(int)(Math.random()*((30-1)+1));
    }
}
    
    

