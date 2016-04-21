package mx.edu.utng.abstractfactorysingletoncomposite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by nayel on 14/04/2016.
 */
public class Docente_Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.docente);
        findViewById(R.id.bGuardar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Docente_Main.this, RegistrarMaterial.class));
            }
        });
    }
}
