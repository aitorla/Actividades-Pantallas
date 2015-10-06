package com.example.aitor.actividades_pantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Actividad4b extends AppCompatActivity {

    public TextView tvNombre;
    public TextView tvApellidos;
    public TextView tvSexo;
    public TextView tvAficiones;
    public Button btVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4b);


        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("nombre");
        String apellidos = extras.getString("apellidos");
        String sexo = extras.getString("sexo");
        String aficiones = extras.getString("aficiones");

        tvNombre=(TextView)findViewById(R.id.tvNombre);
        tvApellidos=(TextView)findViewById(R.id.tvApellidos);
        tvSexo=(TextView)findViewById(R.id.tvSexo);
        tvAficiones=(TextView)findViewById(R.id.tvAficiones);
        btVolver=(Button) findViewById(R.id.btVolver);


        tvNombre.setText(nombre.toString());
        tvApellidos.setText(apellidos.toString());
        tvSexo.setText(sexo.toString());
        tvAficiones.setText(aficiones.toString());


        btVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad4b, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
