package mx.edu.utng.abstractfactorysingletoncomposite.entidades;

/**
 * Created by nayel on 14/04/2016.
 */
public class Estudiante extends Usuario {


    private String facultad;
    private String carrera;
    private int anioIngreso;

    public Estudiante(){
        super();
    }

    public Estudiante(String facultad, String carrera, int anioIngreso, String codigo, String nombres,
                      String apellidos, String direccion, String telefono, int estado){

        super (codigo, nombres, apellidos, direccion, telefono, estado);
        this.facultad = facultad;
        this.carrera = carrera;
        this.anioIngreso = anioIngreso;
    }

    @Override
    public void agregar(Usuario Usua) {
        // TODO Auto-generated method stub

    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }


}

