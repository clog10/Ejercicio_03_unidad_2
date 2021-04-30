package datos;

/**
 *
 * @author Carlos Loaeza
 */
public class Actividad {
    //Factores de Actividad

    //Hombres
    public static final double h_sedentario = 1.0;
    public static final double h_ligeramente = 1.11;
    public static final double h_moderadamente = 1.25;
    public static final double h_muyactivo = 1.48;

    //Mujeres
    public static final double m_sedentaria = 1.0;
    public static final double m_ligeramente = 1.12;
    public static final double m_moderadamente = 1.27;
    public static final double m_muyactiva = 1.45;

    private double tmb;
    private double kcalorias;

    public double getTmb() {
        return tmb;
    }

    public void calculaTmb(double tmb) {
        
    }

    public double getKcalorias() {
        return kcalorias;
    }

    public void calculaKcalorias(double kcalorias) {
        this.kcalorias = kcalorias;
    }
    
    
    
}
