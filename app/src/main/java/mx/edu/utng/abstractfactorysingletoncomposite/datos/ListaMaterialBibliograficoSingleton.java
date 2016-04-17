package mx.edu.utng.abstractfactorysingletoncomposite.datos;

import mx.edu.utng.abstractfactorysingletoncomposite.entidades.MaterialBibliografico;


/**
 * Created by nayel on 14/04/2016.
 */
public class ListaMaterialBibliograficoSingleton {

    //Patron Snigleton

    public final static int TAM = 10;
    private static MaterialBibliografico lista[];
    private int posicion;
    private static ListaMaterialBibliograficoSingleton listaMaterialBibliografico;

    public static ListaMaterialBibliograficoSingleton getInstance(){
        if(listaMaterialBibliografico == null){
            listaMaterialBibliografico = new ListaMaterialBibliograficoSingleton();
        }
        return listaMaterialBibliografico;
    }

    private ListaMaterialBibliograficoSingleton(){
        this(TAM);
        posicion = 1;
    }

    private ListaMaterialBibliograficoSingleton(int tamanio) {
        lista= new MaterialBibliografico[tamanio];
        posicion= lista.length -1;
    }
    public void setLista(MaterialBibliografico lista[]){
        this.lista = lista;
    }

    public MaterialBibliografico[] getLista(){
        return lista;
    }

    public void setMaterialBibliografico(MaterialBibliografico materialBibliografico){
        if (posicion == lista.length -1){
            nuevaLista();
        }
        ++posicion;
        lista[posicion] = materialBibliografico;

    }
    public MaterialBibliografico getMaterialBibliografico (int pos){
        if (pos >= 0 && pos <= posicion){
            return lista[pos];
        }
        return null;
    }
    public int getUltimaPosicionOcupada(){
        return posicion;
    }

    private void nuevaLista(){
        MaterialBibliografico aux[]= new MaterialBibliografico[lista.length + TAM];

        for(int i = 0; i <= posicion; i++){
            aux[i] = lista[i];
        }
        lista = aux;
    }

    public void buscarPorCodigo (String codigo){
        try{
            for(int i= 0; i < lista.length; i++){
                if(lista[i].getCodigo().equals(codigo)){

                }
            }
        }catch (NullPointerException ex){
        }
    }
    public int getTamanio(){
        return lista.length;
    }

    @Override
    public String toString(){

        String contenido = "";
        try{
            for (int i = 0; i <= lista.length; i++){
                contenido += "\nMaterial Bibliografico " + (i+1) + lista[i].toString();
            }
        }catch (NullPointerException ex){
        }
        return contenido;

    }

}
