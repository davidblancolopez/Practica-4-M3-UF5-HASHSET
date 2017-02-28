package practica.pkg4.m3.uf5;

import java.util.Objects;

public class Persona {

    //private String nombre;
    private int edad;

    public Persona(int edad) {
        
        this.edad = edad;
    }



    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    /**
     * Metode que genera un numero que s'assigna al objecte per a identificar-lo. 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        
        hash = 67 * hash + this.edad;
        return hash;
    }

    /**
     * Metode que compara 2 objectes i diu si son iguals.
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
        return "Persona{" + ", edad=" + edad + '}' + "\n";
    }

}
