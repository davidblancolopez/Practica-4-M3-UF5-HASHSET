package practica.pkg4.m3.uf5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Practica4M3UF5 {

    public static void main(String[] args) {

        /**
         * ************** HASHSET *****************
         */
 
        //Construeix un Hashset buit amb capacitat inicial de 16 i factor de carga de 0,75.
        Set<Persona> personas = new HashSet<Persona>();

        Persona p7 = new Persona(45);

        

        //Operació d'inserció i eliminació de dades.
        long tiempo = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            int num = (int) (Math.random() * (1000000 - 1) + 1);
            personas.add(new Persona(num));
        }
        for (int i = 0; i < 50000; i++) {
            personas.remove(i);
        }

            personas.add(p7);
            
        if (personas.contains(p7)) {
            System.out.println("El elemento p7 existe");
        } else {
            System.out.println("El elemento p7 NO existe");
        }

        long tiempo2 = System.currentTimeMillis();

        long tiempoTotal = (tiempo2 - tiempo);

        System.out.println("Temps total: " + tiempoTotal);

        /**
         * *********** ARRAYLIST   ************
         */

//        ArrayList<Persona> personas = new ArrayList<Persona>();
//
//        Persona p7 = new Persona(45);
//
//        //Operació d'inserció i eliminació de dades.
//        long tiempo = System.currentTimeMillis();
//        for (int i = 0; i < 200000; i++) {
//            int num = (int) (Math.random() * (1000000 - 1) + 1);
//            personas.add(new Persona(num));
//        }
//        for (int i = 0; i < 50000; i++) {
//            personas.remove(i);
//        }
//
//        personas.add(p7);
//
//        if (personas.contains(p7)) {
//            System.out.println("El elemento p7 existe");
//        } else {
//            System.out.println("El elemento p7 NO existe");
//        }
//
//        long tiempo2 = System.currentTimeMillis();
//        long tiempoTotal = (tiempo2 - tiempo);
//
//        System.out.println("Temps total: " + tiempoTotal);

    }

}
