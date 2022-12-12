package colas;
import java.util.Queue;
/**
 *
 * @author Diana
 */
public class Atendidos {
   
    private String nombreCaja;//en numero
    private Queue<String> personasA;//cola de personas

    public Atendidos(String nombreCaja, Queue<String> personasA) {
        this.nombreCaja = nombreCaja;
        this.personasA = personasA;
    }

    public String getNombreCaja() {
        return nombreCaja;
    }

    public Queue<String> getPersonasA() {
        return personasA;
    }

    public void setNombreCaja(String nombreCaja) {
        this.nombreCaja = nombreCaja;
    }

    public void setPersonasA(Queue<String> personasA) {
        this.personasA = personasA;
    }
    //ordena las personas en forma de lista 
    public String personaVertical(){
        String nombres="";
        for(String cola : personasA){
            nombres+="\t"+cola+"\n";
        }
        return nombres;
    }
    //aqui viene todo lo que se va a mostrar en la clase principal
    @Override
    public String toString(){
        return "----------"+nombreCaja+"--------------\n"+ personasA.size()+ 
                " personas atendidas\n"+personaVertical()+"\nEL primero es:\t "
                + primero() + "\nEl ultimo es:\t" + ultimo()+"\n";
    }
    
    private String primero(){//obtiene el primero de la cola 
        return personasA.peek();
    }
    
    private String ultimo(){//obtiene el ultimo de la cola 
        String[] ult= new String[personasA.size()];
        ult = personasA.toArray(ult);//convierte a un array
        
        //el -1 da al ultimo elemento porque inicia desde 0
        return ult[personasA.size()-1];       
        
    }   
}




