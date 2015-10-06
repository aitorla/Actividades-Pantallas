package com.example.aitor.actividades_pantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad1 extends AppCompatActivity {

    private Button btValidar;
    private EditText nombre;
    private EditText apellidos;
    private TextView tvCondiciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);


        nombre=(EditText)findViewById(R.id.etNombre);
        apellidos=(EditText)findViewById(R.id.etApellidos);
        tvCondiciones=(TextView) findViewById(R.id.tvCondiciones);
        btValidar=(Button) findViewById(R.id.btValidar);
        btValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Actividad1.this, Actividad1b.class);
                intent.putExtra("nombre", nombre.getText().toString());
                intent.putExtra("apellidos", apellidos.getText().toString());
                startActivityForResult(intent, 1234);
            }
        });

    }

    @Override
    protected void onActivityResult (int requestCode,int resultCode, Intent data) {
        if (requestCode==1234 && resultCode==RESULT_OK)
        { String resultado = data.getExtras().getString("resultado");
            tvCondiciones.setText("Aceptas Condiciones:"+resultado);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad1, menu);
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
