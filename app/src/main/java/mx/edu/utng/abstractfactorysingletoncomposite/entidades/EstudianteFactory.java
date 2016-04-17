package mx.edu.utng.abstractfactorysingletoncomposite.entidades;

/**
 * Created by nayel on 14/04/2016.
 */
public class EstudianteFactory extends UsuarioFactory{

    //Factoria Concreta

    @Override
    public Usuario creaUsuario(String codigo, String nombres, String apellidos, String direccion, String telefono,
                               int estado, Object o1, Object o2, Object o3) {
        return new Estudiante((String)o1, (String)o2, (Integer)o3, codigo, nombres, apellidos, direccion,
                telefono, estado);

				/*
				 * @Override
				 * public void agregar(UsuarioFactory Usua){
				 * throw new UnsupportedOperationException("Not supported yet.");//To change body of generated methods, choose Tool
				 * }
				 */
    }


}