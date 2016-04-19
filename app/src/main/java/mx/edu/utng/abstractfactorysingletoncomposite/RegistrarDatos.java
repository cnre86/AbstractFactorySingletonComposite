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
        findViewById(R.id.bDocente).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrarDatos.this, Docente_Main.class));
            }
        });
        findViewById(R.id.bEstudiante).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrarDatos.this, Estudiante_Main.class));
            }
        });
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


    }
}