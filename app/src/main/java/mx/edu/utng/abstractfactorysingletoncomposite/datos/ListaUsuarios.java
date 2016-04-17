package mx.edu.utng.abstractfactorysingletoncomposite.datos;

import java.util.ArrayList;

import mx.edu.utng.abstractfactorysingletoncomposite.entidades.Usuario;

/**
 * Created by nayel on 14/04/2016.
 */
public class ListaUsuarios extends Usuario {

    //Patron Composite

    private ArrayList<Usuario> hijo = new ArrayList<Usuario>();

    public ListaUsuarios(){

        super();
    }

	/*@Override
	 * public Usuario creaUsuario(){
	 * return new Usuario(){};
	 * }
	*/

    @Override
    public static void agregar(Usuario Usua) {

        hijo.add(Usua);
    }

    public Usuario getUsuario(int i){

        return hijo.get(i);
    }

    public static String listar(){
        String cadena = "";
        for (int i = 0; i < hijo.size(); ++i){
            cadena=cadena+ hijo.get(i) + "\n";
        }
        return cadena;
    }

    public void ordenaPorApellidos(){
        try{
            for (int i = 0; i < hijo.size()- 1; ++i){
                for (int j = i + 1; j < hijo.size(); ++j){
                    if (hijo.get(i).getApellidos().compareToIgnoreCase(hijo.get(j).getApellidos()) > 0){
                        Usuario temporal = hijo.get(i);
                        hijo.set(i, hijo.get(j));
                        hijo.set(j, temporal);
                    }

                }
            }
        } catch (NullPointerException ex){
        }
    }
    public int getTamano(){
        return hijo.size();
    }




}

