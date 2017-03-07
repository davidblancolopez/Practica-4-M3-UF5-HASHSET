package practica.pkg4.m3.uf5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Practica4M3UF5 {

    public static void main(String[] args) {

        /**
         * ************** HASHSET *****************
         */
 
        
        Set<Persona> personas = new HashSet<Persona>();

        Persona p7 = new Persona(45);      

        //Operació d'inserció i eliminació de dades.
        long tiempo = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            //int num = (int) (Math.random() * (200000 - 1) + 1);
            personas.add(new Persona(i));
        }
        for (int i = 0; i < 150000; i++) {          
           Persona p = new Persona(i);
           personas.remove(p);
        }

            
            
        if (personas.contains(p7)) {
            System.out.println("El elemento p7 existe");
        } else {
            System.out.println("El elemento p7 NO existe");
        }

        long tiempo2 = System.currentTimeMillis();

        long tiempoTotal = (tiempo2 - tiempo);
        
        System.out.println("Tamany: " + personas.size());
        System.out.println("Temps total: " + tiempoTotal);
        
        
        
        /****************************************************************************************************
         ****************************************************************************************************/
        
        System.out.println("******************************************************************************");
        
        
        //Segona estructura de dades.
        Set<Coche> coches = new HashSet<Coche>();

        //Creem coches.
        
        Coche c1 = new Coche("1111AAA", "Reanult", "Megane", "Azul");
        Coche c2 = new Coche("2222BBB", "Citroen", "Saxo", "Rojo");
        Coche c3 = new Coche("3333CCC", "mitsubishi", "Pajero", "Blanco");
        Coche c4 = new Coche("4444DDD", "Ford", "Focus", "Azul");
        Coche c5 = new Coche("5555EEE", "Ferrari", "Laferrari", "Rojo");
        
        Coche c6 = new Coche("1111AAA", "Aston Martin", "DB11", "Verde oscuro");

        
        coches.add(c1);
        coches.add(c2);
        coches.add(c3);
        coches.add(c4);
        coches.add(c5);
        coches.add(c6);

        System.out.print(coches);
        

        System.out.println("******************************************************************************");
 
        
        
        /**
         * *********** ARRAYLIST   ************
         */

        ArrayList<Persona> personas2 = new ArrayList<Persona>();

        Persona p8 = new Persona(45);

        //Operació d'inserció i eliminació de dades.
        long tiempo1Array = System.currentTimeMillis();
        
        
        for (int i = 0; i < 200000; i++) {
            //int num = (int) (Math.random() * (200000 - 1) + 1);
            personas2.add(new Persona(i));
        }
        for (int i = 0; i < 15000; i++) {
            personas2.remove(i);
        }

        

        if (personas2.contains(p7)) {
            System.out.println("El elemento p7 existe");
        } else {
            System.out.println("El elemento p7 NO existe");
        }

        long tiempo2Array = System.currentTimeMillis();
        long tiempoTotalArray = (tiempo2Array - tiempo1Array);

        System.out.println("Tamany: " + personas2.size());
        System.out.println("Temps total ArrayList: " + tiempoTotalArray);

    }

}
