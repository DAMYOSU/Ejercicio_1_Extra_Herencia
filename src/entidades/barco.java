package entidades;

import java.time.*;

/**
 *
 * @author DAMY
 */
public class barco extends cliente {

    public double cv;

    public barco() {
    }

    public barco(double cv) {
        this.cv = cv;
    }

    public barco(double cv, String nombre, long dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int amarre, String tipoBarco, String matricula, double eslora, int añoFabricacion, double alquilerTotal) {
        super(nombre, dni, fechaAlquiler, fechaDevolucion, amarre, tipoBarco, matricula, eslora, añoFabricacion, alquilerTotal);
        this.cv = cv;
    }

    public double getCv() {
        return cv;
    }

    public void setCv(double cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "barco{" + "cv=" + cv + '}';
    }

    public double calculoAlquiler(cliente c3) {
        double mod = (c3.getEslora() * 10) + getCv();
        LocalDate ini = c3.getFechaAlquiler();
        LocalDate ter = c3.getFechaDevolucion();
        Period pp = Period.between(ini, ter);
        int dia1 = pp.getDays();
        int mes1 = (pp.getMonths()) * 30;
        int año1 = (pp.getYears() * 365);
        double costoAlquiler = ((dia1 + mes1 + año1) * mod);
        return costoAlquiler;

    }
}
