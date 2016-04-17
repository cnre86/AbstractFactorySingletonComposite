package mx.edu.utng.abstractfactorysingletoncomposite.entidades;

/**
 * Created by nayel on 14/04/2016.
 */
public abstract class Usuario {
    //Patron abstracto

    private String codigo;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private int estado;

    public Usuario(){
    }

    abstract public void agregar(Usuario Usua);
    public Usuario (String codigo, String nombres, String apellidos, String direccion, String telefono, int estado){
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {

        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }


}
