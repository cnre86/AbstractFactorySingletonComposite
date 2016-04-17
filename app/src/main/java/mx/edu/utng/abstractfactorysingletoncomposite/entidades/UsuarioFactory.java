package mx.edu.utng.abstractfactorysingletoncomposite.entidades;

/**
 * Created by nayel on 14/04/2016.
 */
public abstract class UsuarioFactory {

    //Fabrica abstracta

    public abstract Usuario creaUsuario(String codigo, String nombres, String apellidos, String direccion,
                                        String telefono, int estado, Object o1, Object o2, Object o3);
    //public abstract void agregar (UsuarioFactory usua)
}
