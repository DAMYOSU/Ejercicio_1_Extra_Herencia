package entidades;

import java.time.*;

/**
 *
 * @author DAMY
 */
public class yate extends cliente {

    public double cv;
    public int camarote;

    public yate() {
    }

    public yate(double cv, int camarote) {
        this.cv = cv;
        this.camarote = camarote;
    }

    public yate(double cv, int camarote, String nombre, long dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int amarre, String tipoBarco, String matricula, double eslora, int añoFabricacion, double alquilerTotal) {
        super(nombre, dni, fechaAlquiler, fechaDevolucion, amarre, tipoBarco, matricula, eslora, añoFabricacion, alquilerTotal);
        this.cv = cv;
        this.camarote = camarote;
    }

    public double getCv() {
        return cv;
    }

    public void setCv(double cv) {
        this.cv = cv;
    }

    public int getCamarote() {
        return camarote;
    }

    public void setCamarote(int camarote) {
        this.camarote = camarote;
    }

    @Override
    public String toString() {
        return "yate{" + "cv=" + cv + ", camarote=" + camarote + '}';
    }

    public double calculoAlquiler(cliente c3) {
        double mod = (c3.getEslora() * 10) + (getCv()) + (getCamarote());
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
