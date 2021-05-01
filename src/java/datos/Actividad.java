package datos;

/**
 *
 * @author Carlos Loaeza
 */
public class Actividad {
    //Factores de Actividad

    //Hombres
    public final double h_sedentario = 1.0;
    public final double h_ligeramente = 1.11;
    public final double h_moderadamente = 1.25;
    public final double h_muyactivo = 1.48;

    //Mujeres
    public final double m_sedentaria = 1.0;
    public final double m_ligeramente = 1.12;
    public final double m_moderadamente = 1.27;
    public final double m_muyactiva = 1.45;

    private double tmb;
    private double kcalorias;
    
    public double getTmb() {
        return tmb;
    }

    public void calculaTmb(Usuario user) {
        if (user.getSexo() == 'H') {
            this.tmb = (10 * user.getPeso()) + (6.25 * user.getEstatura()) - (5 * user.getEdad()) + 5;
        } else if (user.getSexo() == 'M') {
            this.tmb = (10 * user.getPeso()) + (6.25 * user.getEstatura()) - (5 * user.getEdad()) - 161;
        }
    }

    public double getKcalorias() {
        return kcalorias;
    }

    public void calculaKcalorias(double TMB, Usuario user) {
        if (user.getSexo() == 'H' && user.getActividad() == 0) {
            this.kcalorias = TMB * h_sedentario;
        } else if (user.getSexo() == 'H' && user.getActividad() == 1) {
            this.kcalorias = TMB * h_ligeramente;
        } else if (user.getSexo() == 'H' && user.getActividad() == 2) {
            this.kcalorias = TMB * h_moderadamente;
        } else if (user.getSexo() == 'H' && user.getActividad() == 3) {
            this.kcalorias = TMB * h_muyactivo;
        } else if (user.getSexo() == 'M' && user.getActividad() == 0) {
            this.kcalorias = TMB * m_sedentaria;
        } else if (user.getSexo() == 'M' && user.getActividad() == 1) {
            this.kcalorias = TMB * m_ligeramente;
        } else if (user.getSexo() == 'M' && user.getActividad() == 2) {
            this.kcalorias = TMB * m_moderadamente;
        } else if (user.getSexo() == 'M' && user.getActividad() == 3) {
            this.kcalorias = TMB * m_muyactiva;
        }
    }

}
