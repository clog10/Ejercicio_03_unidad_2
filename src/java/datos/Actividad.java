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

    public void calculaTmb(double peso, int estatura, int edad, char sexo) {
        if (sexo == 'H') {
            this.tmb = (10 * peso) + (6.25 * estatura) - (5 * edad) + 5;
        } else if (sexo == 'M') {
            this.tmb = (10 * peso) + (6.25 * estatura) - (5 * edad) - 161;
        }
    }

    public double getKcalorias() {
        return kcalorias;
    }

    public void calculaKcalorias(double TMB, char sexo, int actividad) {
        if (sexo == 'H' && actividad == 0) {
            this.kcalorias = TMB * h_sedentario;
        } else if (sexo == 'H' && actividad == 1) {
            this.kcalorias = TMB * h_ligeramente;
        } else if (sexo == 'H' && actividad == 2) {
            this.kcalorias = TMB * h_moderadamente;
        } else if (sexo == 'H' && actividad == 3) {
            this.kcalorias = TMB * h_muyactivo;
        } else if (sexo == 'M' && actividad == 0) {
            this.kcalorias = TMB * m_sedentaria;
        } else if (sexo == 'M' && actividad == 1) {
            this.kcalorias = TMB * m_ligeramente;
        } else if (sexo == 'M' && actividad == 2) {
            this.kcalorias = TMB * m_moderadamente;
        } else if (sexo == 'M' && actividad == 3) {
            this.kcalorias = TMB * m_muyactiva;
        }
    }

}
