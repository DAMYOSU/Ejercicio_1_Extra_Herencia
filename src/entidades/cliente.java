package entidades;

import java.time.*;
import java.util.*;

/**
 *
 * @author DAMY
 */
public class cliente {
    protected String nombre;
    protected long dni;
    protected LocalDate fechaAlquiler;
    protected LocalDate fechaDevolucion;
    protected int amarre;
    protected String tipoBarco;
    protected String matricula;
    protected double eslora;
    protected int añoFabricacion;
    protected double alquilerTotal;

    public cliente() {
    }

    public cliente(String nombre, long dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int amarre, String tipoBarco, String matricula, double eslora, int añoFabricacion, double alquilerTotal) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.amarre = amarre;
        this.tipoBarco = tipoBarco;
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
        this.alquilerTotal = alquilerTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getAmarre() {
        return amarre;
    }

    public void setAmarre(int amarre) {
        this.amarre = amarre;
    }

    public String getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

 
    public double getAlquilerTotal() {
        return alquilerTotal;
    }

    public void setAlquilerTotal(double alquilerTotal) {
        this.alquilerTotal = alquilerTotal;
    }

    public void crearCliente() {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("***   D A T O S   D E L   C L I E N T E   *** :");
        System.out.println("Ingrese el Nombre: ");
        nombre = leer.next();
        System.out.println("Ingerse el D.N.I.");
        dni = leer.nextLong();
        System.out.println("\n***   D A T O S   D E L   A L Q U I L E R   *** :");
         System.out.println("Ingrese Eslora");
        setEslora(leer.nextDouble());
        System.out.println("esf" + getEslora());
        System.out.println("Fecha de ingreso AAAA-MM-DD");
        LocalDate fa1 = LocalDate.parse(leer.next());
        setFechaAlquiler(fa1);
        System.out.println("Fecha de Devolucion AAAA-MM-DD");
        LocalDate fs1=LocalDate.parse(leer.next());
        setFechaDevolucion(fs1);
        System.out.println("Tipo de embarcacion : \n  A - VELERO  \n  B - YATE  \n  C - BARCO");
        String tipo = leer.next();
        tipo = tipo.toUpperCase();
        switch (tipo) {
            case "A":
                tipoBarco = "VELERO";
              velero v1=new velero();
                System.out.println("Cuantos Mastiles tiene el Velero:");
                v1.setMastil(leer.nextInt());
                setAlquilerTotal(v1.calculoAlquiler(this));             
                break;
            case "B":
                tipoBarco = "YATE";
               yate y1=new yate();
                System.out.println("Cuantos Camarotes tiene el Yate;");
                y1.setCamarote(leer.nextInt());
                System.out.println("Cuantos CV tiene el Yate:");
                y1.setCv(leer.nextDouble());
                setAlquilerTotal(y1.calculoAlquiler(this));
                break;
            case "C":
                tipoBarco = "BARCO";
                barco b1 = new barco();
               System.out.println("Cuantos CV tiene el Barco:");
                b1.setCv(leer.nextDouble());
                setAlquilerTotal(b1.calculoAlquiler(this));
                break;
        }
        System.out.println("Ingrese año de fabricacion:");
        añoFabricacion=leer.nextInt();
        System.out.println("Ingrese Matricula ");
        matricula=leer.next();
        System.out.println("Ingrese posicion de Amarre:");
        amarre=leer.nextInt();
        System.out.println("***************************************\n");
        System.out.println("el valor del alquiler del Cliente " + getNombre() +" en el Amarre " + getAmarre()+ " es de $" + getAlquilerTotal()+ "\n" );

    }

    @Override
    public String toString() {
        return "cliente{" + "nombre=" + nombre + ", dni=" + dni + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", amarre=" + amarre + ", tipoBarco=" + tipoBarco + ", matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1oFabricacion=" + añoFabricacion + '}';
    }

}
