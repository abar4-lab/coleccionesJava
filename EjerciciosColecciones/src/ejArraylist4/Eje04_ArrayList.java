package ejArraylist4;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;


public class Eje04_ArrayList
{
    public static void main(String[] args) {
        
    final int NELEMENTOS =  20;

    ArrayList<Integer> lista = new ArrayList<Integer>();
    
    for (int i = 0; i < NELEMENTOS; i++) {
      lista.add((int)(Math.random()*101));
    }
    // Lista original
    System.out.println("Lista generada: " + lista);
    
    // Ordeno la lista
    lista.sort( (x,y) -> (x - y));
    System.out.println("Lista ordenada: " + lista);
    
    // Creo un conjunto a partir de la lista (Elimina los repetidos)
    Set <Integer> listaSinRepes = new TreeSet <Integer>(lista);
    
    // Muestro el resultado 
    System.out.println("Lista sin repes:" + listaSinRepes);
    }    
    
}