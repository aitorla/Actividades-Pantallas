package com.example.aitor.actividades_pantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad3b extends AppCompatActivity {


    private TextView tvResultadoSuma;
    private Button btVolverSuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3b);


        Bundle extras = getIntent().getExtras();
        int oper1 = extras.getInt("op1");
        int oper2 = extras.getInt("op2");
        String resultado = extras.getString("result");
        int result=Integer.parseInt(resultado);


        //Toast.makeText(getApplicationContext(), "Variables"+ oper1+" "+oper2+" "+resultado , Toast.LENGTH_SHORT).show();

        tvResultadoSuma=(TextView)findViewById(R.id.tvResultadoSuma);
        btVolverSuma=(Button)findViewById(R.id.btVolverSuma);

        if (oper1+oper2 == result) {
            tvResultadoSuma.setText("CORRECTO");
        }
        else {
            tvResultadoSuma.setText("INCORRECTO");

        }
        btVolverSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("resultado",tvResultadoSuma.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad3b, menu);
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
