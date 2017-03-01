package practica.pkg4.m3.uf5;

import java.util.Objects;

public class Persona {

    //private String nombre;
    private int edad;

    public Persona(int edad) {
        
        this.edad = edad;
    }

    public Persona() {
          
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    /**
     * Metode que s'encarrega de generar un codi HASH per a cada objecte.
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.edad;
        return hash;
    }

    /**
     * Metode que s'encarrega de comparar 2 objectes per saber si son iguals o diferents.
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + '}';
    }

    

    
    
    
    


}
