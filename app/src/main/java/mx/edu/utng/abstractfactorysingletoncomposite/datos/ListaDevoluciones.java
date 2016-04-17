package mx.edu.utng.abstractfactorysingletoncomposite.datos;

import java.util.ArrayList;

import mx.edu.utng.abstractfactorysingletoncomposite.entidades.Devolucion;

/**
 * Created by nayel on 14/04/2016.
 */
public class ListaDevoluciones extends Devolucion{

    private ArrayList<Devolucion> hijo = new ArrayList<Devolucion>();

    @Override
    public void agregar(Devolucion devolucion) {
        hijo.add(devolucion);
    }

    //@Overraid
    public Devolucion getDevolucion(int i){
        return hijo.get(i);
    }

    public String Listar(){
        String cadena = "";
        for (int i=0; i < hijo.size(); ++i){
            cadena += hijo.get(i) + "\n";
        }
        return cadena;
    }

    public int getTamanio(){
        return hijo.size();
    }

}
