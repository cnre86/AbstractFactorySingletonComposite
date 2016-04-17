package mx.edu.utng.abstractfactorysingletoncomposite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.BreakIterator;
import java.text.CharacterIterator;

import mx.edu.utng.abstractfactorysingletoncomposite.datos.ListaUsuarios;
import mx.edu.utng.abstractfactorysingletoncomposite.entidades.DocenteFactory;
import mx.edu.utng.abstractfactorysingletoncomposite.entidades.EstudianteFactory;
import mx.edu.utng.abstractfactorysingletoncomposite.entidades.Usuario;
import mx.edu.utng.abstractfactorysingletoncomposite.entidades.UsuarioFactory;

/**
 * Created by nayel on 14/04/2016.
 */
public class RegistrarDatos extends Activity {

    private TextView TextFieldCp;
    private TextView TextFieldNombre;
    private TextView TextFielApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrardatos);
    }

    public void onClickD(View v) {
        if (v.getId() == R.id.bDocente) {
            Intent i = new Intent(RegistrarDatos.this, Docente_Main.class);
            startActivity(i);
        }
    }


    public void onClickE(View v) {
        if (v.getId() == R.id.bEstudiante) {
            Intent i = new Intent(RegistrarDatos.this, Estudiante_Main.class);
            startActivity(i);
        }

    }

    //Abstract Factory
    public void crearUsuario(UsuarioFactory factory, String codigo, String nombres, String apellidos, String direccion,
                             String telefono, int estado, Object o1, Object o2, Object o3) {
        Usuario usuario = factory.creaUsuario(codigo, nombres, apellidos, direccion, telefono, estado, o1, o2, o3);
    }

    private void checkBoxD() {
        String codigo;
        String nombres;
        String apellidos = null;
        String direccion;
        String telefono;
        int estado = 0;

        Usuario usua = new Usuario() {

            @Override
            public void agregar(Usuario Usua) {

            }
        };

        codigo = (String) TextFieldCp.getText();
        nombres = (String) TextFieldNombre.getText();
        apellidos = (String) TextFielApellido.getText();
        direccion = TextFielDireccion.getText();
        telefono = TextFielTel.getText();

        String facultad;
        String carrera;
        int anioIngreso;

        int condicion = 0, categoria = 0, dedicación = 0;

        if (bDocente.isSelected()) {
            estado = 1;
        } else if (bEstudiante.isSelected()) {
            estado = 2;
        }
        usua = new Usuario(codigo, nombres, apellidos, direccion, telefono, estado) {

            @Override
            public void agregar(Usuario Usua) {
            }
        };
        if (bEstudiante.isSelected()) {
            EstudianteFactory estudiante = new EstudianteFactory();
            facultad = jeditText.getText();
            carrera = jeditText2.getText();
            anioIngreso = Integer.parseInt(jeditText3.getText());
            crearUsuario(estudiante, codigo, nombres, apellidos, direccion, telefono, estado, facultad, carrera, anioIngreso);

        } else if (bDocente.isSelected()) {
            DocenteFactory d = new DocenteFactory();
            if (jBContratado.isSelected()) {
                condicion = 1;
            } else if (bEstable.isSelected()) {
                condicion = 2;
            }
            if (bAuxiliar.isSelected()) {
                condicion = 1;
            } else if (bAsociado.isSelected()) {
                condicion = 2;
            } else if (bPrincipal.isSelected()) {
                condicion = 3;
            }
            if (bTiempoParcial.isSelected()) {
                condicion = 1;
            } else if (bTiempoCompleto.isSelected()) {
                condicion = 2;
            }

            crearUsuario(d, codigo, nombres, apellidos, direccion, telefono, estado, condicion, categoria, dedicación);
        }


        ListaUsuarios.agregar(usua);
        ListaUsuarios.listar();
        limpiarCajasUsuarios();

    }

    private void limpiarCajasUsuarios() {

    }
}