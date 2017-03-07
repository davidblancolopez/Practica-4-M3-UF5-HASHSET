
package practica.pkg4.m3.uf5;

import java.util.Objects;


public class Coche {
    
    String matricula;
    String Marca;
    String Modelo;
    String Color;

    
    /**
     * CONSTRUCTOR
     * 
     * @param matricula
     * @param Marca
     * @param Modelo
     * @param Color 
     */
    public Coche(String matricula, String Marca, String Modelo, String Color) {
        this.matricula = matricula;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
    }

    /**
     * CONSTRUCTOR
     */
    public Coche() {
    }
    
    
    

    
    
    /**
     * GETS & SETS
     */

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    
    
    
    /**
     * Metode HASHCODE
     * @return 
     */
    @Override    
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    /**
     * Metode EQUALS
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
        final Coche other = (Coche) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Coche{" + "matricula= " + matricula + ", Marca= " + Marca + ", Modelo= " + Modelo + ", Color= " + Color + '}' + "\n";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
