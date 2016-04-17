package mx.edu.utng.abstractfactorysingletoncomposite.entidades;

/**
 * Created by nayel on 14/04/2016.
 */
public class MaterialBibliografico {

    private String codigo;
    private String titulo;
    private String autor;
    private String editorial;
    private String edicion;
    private int anio;
    private int numEjemplares;

    public MaterialBibliografico (String codigo, String titulo, String autor, String editorial, String edicion,
                                  int anio, int numEjemplares){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.anio = anio;
        this.numEjemplares = numEjemplares;
    }

    public MaterialBibliografico(){

    }

    public String getCodigo() {

        return codigo;
    }
    public void setCodigo(String codigo) {

        this.codigo = codigo;
    }
    public String getTitulo() {

        return titulo;
    }
    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }
    public String getAutor() {

        return autor;
    }
    public void setAutor(String autor) {

        this.autor = autor;
    }
    public String getEditorial() {

        return editorial;
    }
    public void setEditorial(String editorial) {

        this.editorial = editorial;
    }
    public String getEdicion() {

        return edicion;
    }
    public void setEdicion(String edicion) {

        this.edicion = edicion;
    }
    public int getAnio() {

        return anio;
    }
    public void setAnio(int anio) {

        this.anio = anio;
    }
    public int getNumEjemplares() {

        return numEjemplares;
    }
    public void setNumEjemplares(int numEjemplares) {

        this.numEjemplares = numEjemplares;
    }

    @Override
    public String toString(){
        return "MaterialBibliografico{" + "\nCodigo=" + codigo+
                ", \nTitulo=" + titulo + ", \nAutor=" + autor +
                ", \nEditorial=" + editorial + ", \nEdicion=" + edicion +
                ", \nAnio=" + anio + ", \nNumero Ejemplares=" + numEjemplares + '}';

    }
    //toString se utiliza para listar todo los atributos ingresados
    //solicitar material bibliografico es igual a prestamo

}

