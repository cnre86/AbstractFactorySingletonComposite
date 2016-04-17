package mx.edu.utng.abstractfactorysingletoncomposite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClic(View view){
        if (view.getId() == R.id.Bir){
            Intent i = new Intent(MainActivity.this, RegistrarDatos.class);
            startActivity(i);
        }
    }
}
