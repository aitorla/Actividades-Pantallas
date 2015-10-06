package com.example.aitor.actividades_pantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Actividad2b extends AppCompatActivity {

    private Button btVolver;
    private TextView tvMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2b);

        Bundle extras = getIntent().getExtras();
        String usuario = extras.getString("usuario");
        String password = extras.getString("password");
        tvMensaje=(TextView)findViewById(R.id.tvMensaje);

        if (usuario.toString().equals("aitor") && password.toString().equals("1234")) {
            tvMensaje.setText("Usuario y password Correctos");
        }
            else {
                tvMensaje.setText("Usuario y password INCORRECTOS");

        }


        btVolver=(Button)findViewById(R.id.btVolver);

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
        getMenuInflater().inflate(R.menu.menu_actividad2b, menu);
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
