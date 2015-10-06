package com.example.aitor.actividades_pantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Actividad4 extends AppCompatActivity {

    private Button btEnviar;
    private EditText etNombre;
    private EditText etApellidos;
    public RadioGroup rgSexo;
    public RadioButton rbMasculino;
    public RadioButton rbFemenino;
    public CheckBox checkBox;
    public CheckBox checkBox2;
    public CheckBox checkBox3;
    public CheckBox checkBox4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4);

        etNombre=(EditText) findViewById (R.id.etNombre);
        etApellidos=(EditText) findViewById (R.id.etApellidos);
        rgSexo=(RadioGroup) findViewById(R.id.rgSexo);
        rbFemenino=(RadioButton) findViewById(R.id.rbFemenino);
        rbMasculino=(RadioButton) findViewById(R.id.rbMasculino);
        checkBox=(CheckBox) findViewById(R.id.checkBox);
        checkBox=(CheckBox) findViewById(R.id.checkBox);
        checkBox2=(CheckBox) findViewById(R.id.checkBox2);
        checkBox3=(CheckBox) findViewById(R.id.checkBox3);
        checkBox4=(CheckBox) findViewById(R.id.checkBox4);


        btEnviar=(Button) findViewById(R.id.btEnviar);
        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etNombre.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Introduce el nombre", Toast.LENGTH_SHORT).show();
                } else if (etApellidos.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Introduce los apellidos", Toast.LENGTH_SHORT).show();
                } else if (rgSexo.getCheckedRadioButtonId()== -1) {
                    Toast.makeText(getApplicationContext(), "Selecciona el Sexo", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(Actividad4.this, Actividad4b.class);
                    intent.putExtra("nombre", etNombre.getText().toString());
                    intent.putExtra("apellidos", etApellidos.getText().toString());
                    if (rbFemenino.isChecked())
                        intent.putExtra("sexo", rbFemenino.getText().toString());
                        else
                        intent.putExtra("sexo", rbMasculino.getText().toString());
                    ///////// Check Box
                        String aficiones = "";
                        if (checkBox.isChecked()) {
                            aficiones = aficiones + "," + checkBox.getText();
                        }
                        if (checkBox2.isChecked()) {
                            aficiones = aficiones + "," + checkBox2.getText();
                        }
                        if (checkBox3.isChecked()) {
                            aficiones = aficiones + "," + checkBox3.getText();
                        }
                        if (checkBox4.isChecked()) {
                            aficiones = aficiones + "," + checkBox4.getText();
                        }
                         intent.putExtra("aficiones", aficiones);

                    startActivity(intent);
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad4, menu);
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
