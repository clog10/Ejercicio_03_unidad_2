
package datos;

/**
 *
 * @author Carlos Loaeza
 */
public class Usuario {
    private String nombre;
    private char sexo;
    private int edad;
    private double peso;
    private int estatura;
    private int actividad;

    public Usuario() {
    }

    public Usuario(String nombre, char sexo, int edad, double peso, int estatura, int actividad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.actividad = actividad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getActividad() {
        return actividad;
    }

    public void setActividad(int actividad) {
        this.actividad = actividad;
    } 
    
}
