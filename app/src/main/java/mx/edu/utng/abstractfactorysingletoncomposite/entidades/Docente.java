package mx.edu.utng.abstractfactorysingletoncomposite.entidades;

/**
 * Created by nayel on 14/04/2016.
 */
public class Docente extends Usuario{

    private String condicion;
    private String categoria;
    private int dedicacion;

    public Docente(Integer objeto1, Integer objeto2, Integer objeto3, String codigo, String nombres, String apellidos,
                   String direccion, String telefono, int estado){
        super();
    }

    public Docente(String condicion, String categoria, int dedicacion, String codigo, String nombres, String apellidos,
                   String direccion, String telefono, int estado) {
        super (codigo, nombres, apellidos, direccion, telefono, estado);
        this.condicion = condicion;
        this.categoria = categoria;
        this.dedicacion = dedicacion;
    }

    @Override
    public void agregar(Usuario Usua) {
        // TODO Auto-generated method stub

    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(int dedicacion) {
        this.dedicacion = dedicacion;
    }

}

