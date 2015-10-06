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
import android.widget.Toast;

public class Actividad3 extends AppCompatActivity {

    private EditText etOp1;
    private EditText etOp2;
    private EditText etResultado;
    private TextView tvResultado;


    private double randNum;
    private int aleatorio1;
    private double randNum2;
    private int aleatorio2;
    private Button btCalcular;
    private int correctas=0;
    private int incorrectas=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);



        etOp1 = (EditText) findViewById(R.id.etOp1);
        etOp2 = (EditText) findViewById(R.id.etOp2);
        etResultado = (EditText) findViewById(R.id.etResultado);
        tvResultado = (TextView) findViewById(R.id.tvResultado);


        randNum = Math.random () * 10;
        aleatorio1  = (int) randNum;
        randNum2 = Math.random () * 10;
        aleatorio2  = (int) randNum2;

        etOp1.setText(aleatorio1+"");
        etOp2.setText(aleatorio2+"");

        btCalcular = (Button) findViewById(R.id.btCalcular);


        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etResultado.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Rellena el resultado", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(Actividad3.this, Actividad3b.class);
                    intent.putExtra("op1", aleatorio1);
                    intent.putExtra("op2", aleatorio2);
                    intent.putExtra("result", etResultado.getText().toString());
                    startActivityForResult(intent, 1111);
                }

            }
        });




    }

    @Override
    protected void onActivityResult (int requestCode,int resultCode, Intent data) {
        if (requestCode==1111 && resultCode==RESULT_OK)
        { String resultado = data.getExtras().getString("resultado");
            if (resultado.equals("CORRECTO")) {
                correctas++;
            }
             else {
                incorrectas++;
            }

            tvResultado.setText("Preguntas Correctas:"+ correctas +". Preguntas incorrectas:"+ incorrectas);
            randNum = Math.random () * 10;
            aleatorio1  = (int) randNum;
            randNum2 = Math.random () * 10;
            aleatorio2  = (int) randNum2;

            etOp1.setText(aleatorio1+"");
            etOp2.setText(aleatorio2+"");
            etResultado.setText("");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad3, menu);
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
