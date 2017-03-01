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

        Persona p7 = new Persona();      

        //Operació d'inserció i eliminació de dades.
        long tiempo = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            int num = (int) (Math.random() * (1000000 - 1) + 1);
            personas.add(new Persona(num));
        }
        for (int i = 0; i < 50000; i++) {
            personas.remove(i);
        }

            p7.setEdad(45);
            
            
        if (personas.contains(p7)) {
            System.out.println("El elemento p7 existe");
        } else {
            System.out.println("El elemento p7 NO existe");
        }

        long tiempo2 = System.currentTimeMillis();

        long tiempoTotal = (tiempo2 - tiempo);
        

        System.out.println("Temps total: " + tiempoTotal);

        Set<Persona2> personas2 = new HashSet<Persona2>();
        
        Persona2 p1 = new Persona2("Pepe", 1);
        Persona2 p2 = new Persona2("Paco", 2);
        Persona2 p3 = new Persona2("Pepo", 3);
        Persona2 p4 = new Persona2("Pipo", 4);
        Persona2 p5 = new Persona2("Papo", 5);
        Persona2 p6 = new Persona2("Pepito", 6);
        Persona2 p8 = new Persona2("Pipo", 4);
        
        personas2.add(p1);          
        personas2.add(p2);
        personas2.add(p3);
        personas2.add(p4);
        personas2.add(p5);
        personas2.add(p6);
        personas2.add(p8);

        
        System.out.print(personas2);
        
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
