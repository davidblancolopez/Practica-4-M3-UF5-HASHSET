package practica.pkg4.m3.uf5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Practica4M3UF5 {

    public static void main(String[] args) {
        
/**************************************************************************************************************************
 * **************************************   HASHSET ***********************************************************************
 * ***********************************************************************************************************************/
 /*

        //Construeix un Hashset buit amb capacitat inicial de 16 i factor de carga de 0,75.
        Set<Persona> personas = new HashSet<Persona>();

//        Persona p1 = new Persona("Pepe", 45);
//        Persona p2 = new Persona("Paco", 54);
//        Persona p3 = new Persona("Pepo", 14);
//        Persona p4 = new Persona("Pipo", 45);
//        Persona p5 = new Persona("Papu", 154);
//        Persona p6 = new Persona("Pipo", 45);
          Persona p7 = new Persona(45);

          personas.add(p7);
//        personas.add(p2);
//        personas.add(p3);
//        personas.add(p4);
//        personas.add(p5);
//        personas.add(p6);

        for (int i = 0; i < 10000000; i++) {
            int num = (int) (Math.random()  * (10000000 - 1) + 1);
            personas.add(new Persona(num));
        }


//        if (personas.contains(p1)) {
//            System.out.println(p1.toString());
//        } else {
//            System.out.println("El elemento p1 NO existe");
//        }
//
        if (personas.contains(p7)) {
            System.out.println("El elemento p7 existe");
        } else {
            System.out.println("El elemento p7 NO existe");
        }
*/
      
        
/**************************************************************************************************************************
 * **************************************   ArrayList ***********************************************************************
 * ***********************************************************************************************************************/

    ArrayList<Persona> personas = new ArrayList<Persona>();
    
//        Persona p1 = new Persona("Pepe", 45);
//        Persona p2 = new Persona("Paco", 54);
//        Persona p3 = new Persona("Pepo", 14);
//        Persona p4 = new Persona("Pipo", 45);
//        Persona p5 = new Persona("Papu", 154);

        Persona p7 = new Persona(45);
        
        
        personas.add(p7);
//        personas.add(p2);
//        personas.add(p3);
//        personas.add(p4);
//        personas.add(p5);

        for (int i = 0; i < 10000000; i++) {
            int num = (int) (Math.random()  * (10000000 - 1) + 1);
            personas.add(new Persona(num));
        }
          
        

//        if (personas.contains(p1)) {
//            System.out.println(p1.toString());
//        } else {
//            System.out.println("El elemento p1 NO existe");
//        }

        if (personas.contains(p7)) {
            System.out.println("El elemento p7 existe");
        } else {
            System.out.println("El elemento p7 NO existe");
        }
        
    }

}
