package mx.edu.utng.abstractfactorysingletoncomposite.entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by nayel on 14/04/2016.
 */
public class Prestamo {
    private int numeroPedido;
    private Usuario usuario;
    private MaterialBibliografico material;
    private static Fecha fechaPrestamo;
    private int numeroDiasPrestamo;

    public Prestamo (){
    }

    public Prestamo(int numeroPedido, Usuario usuario, MaterialBibliografico material, int numeroDiasPrestamo, Fecha fechaPrestamo){
        this.numeroPedido = numeroPedido;
        this.usuario = usuario;
        this.material = material;
        this.numeroDiasPrestamo = numeroDiasPrestamo;
        fechaPrestamo = fechaPrestamo;
    }

    public Fecha getFechaPrestamo(){
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Fecha aFechaPrestamo)  {
        fechaPrestamo = aFechaPrestamo;
    }

    public int getNumeroPedido(){
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido){
        this.numeroPedido = numeroPedido;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public MaterialBibliografico getMaterial(){
        return material;
    }

    public void setMaterial(MaterialBibliografico material){
        this.material = material;
    }

    public int getNumeroDiasPrestamo(){
        return numeroDiasPrestamo;
    }

    public void setNumeroDiasPrestamo (int numeroDiasPrestamo){
        this.numeroDiasPrestamo = numeroDiasPrestamo;
    }

    public static class Fecha{

        private int dia;
        private int mes;
        private int anio;

        public Fecha(int...fecha){
            GregorianCalendar fechaActual = new GregorianCalendar();
            int dd, mm, aa;
            dd = fechaActual.get(Calendar.DAY_OF_MONTH);
            mm = fechaActual.get(Calendar.MONTH) + 1;
            aa = fechaActual.get(Calendar.YEAR);

            dia = fecha.length > 0 ? fecha[0] : dd;
            mes = fecha.length > 1 ? fecha[1] : mm;
            anio = fecha.length > 2 ? fecha[2] : aa;
        }

        @Override
        public String toString(){
            return (getDia() <= 9 ? "0" + getDia() : getDia()) + "/"
                    +(getMes() <= 9 ? "0" + getMes() : getMes()) + "/" + getAnio();
        }

        public void setFechaPrestamo(Fecha fecha){
            setFechaPrestamo(fecha);
        }

        public int getDia() {
            return dia;
        }

        public void setDia (int dia){
            this.dia = dia;
        }

        public int getMes(){
            return mes;
        }

        public void setMes(int mes){
            this.mes = mes;
        }

        public int getAnio(){
            return anio;
        }

        public void setAnio(int anio){
            this.anio = anio;
        }
    }

    public String toString(){
        String est ="", cadena = "";
        if(usuario.getEstado() == 1){
            est = "Activo";
        }else if(usuario.getEstado() == 2){
            est = "Suspendido";
        }else {
            est = "no valido";
        }
        if (est==("Suspendido")){
            cadena = " Numero Pedido: " + getNumeroPedido() + "\n" + material.toString() + "\nUsuario: " +
                    usuario.getNombres() + " " + usuario.getApellidos()
                    + "\nEstado: " + est + "\nFecha Termino Suspension: " + getFechaPrestamo().toString() + "\n";

        } else{
            cadena = "Numero Pedido: " + getNumeroPedido() + "\n" + material.toString() + "\nUsuario: " +
                    usuario.getNombres() + " " + usuario.getApellidos()
                    + "\nEstado: "+ est + "\n";
        }
        return cadena;
    }
}
