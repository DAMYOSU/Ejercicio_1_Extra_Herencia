package entidades;

import java.time.*;

/**
 *
 * @author DAMY
 */
public class velero extends cliente {

    public int mastil;

    public velero() {
    }

    public velero(int mastil) {
        this.mastil = mastil;
    }

    public velero(int mastil, String nombre, long dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int amarre, String tipoBarco, String matricula, double eslora, int añoFabricacion, double alquilerTotal) {
        super(nombre, dni, fechaAlquiler, fechaDevolucion, amarre, tipoBarco, matricula, eslora, añoFabricacion, alquilerTotal);
        this.mastil = mastil;
    }

    public int getMastil() {
        return mastil;
    }

    public void setMastil(int mastil) {
        this.mastil = mastil;
    }

    @Override
    public String toString() {
        return "velero{" + "mastil=" + mastil + '}';
    }

    public double calculoAlquiler(cliente c3) {
        double mod = (c3.getEslora() * 10) + (getMastil());
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
