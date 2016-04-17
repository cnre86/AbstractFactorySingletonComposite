package mx.edu.utng.abstractfactorysingletoncomposite.entidades;

/**
 * Created by nayel on 14/04/2016.
 */
public class DocenteFactory extends UsuarioFactory{

    //Factoria Concreta

    public DocenteFactory(){

        super();
    }

    @Override
    public Usuario creaUsuario(String codigo, String nombres, String apellidos, String direccion, String telefono,
                               int estado, Object objeto1, Object objeto2, Object objeto3) {
        return new Docente((Integer)objeto1,(Integer)objeto2,(Integer)objeto3, codigo, nombres, apellidos, direccion,
                telefono, estado);
    }


		/*
		 * @Override
		 * public void agregar(UsuarioFactory Usua){
		 * throw new UnsupportedOperationException("Not supported yet.");//To change body of generated methods,
		 * choose Tool | Templates.
		 */

}
