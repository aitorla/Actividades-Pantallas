package com.example.aitor.actividades_pantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements Button.OnClickListener {

    private Button btAct1;
    private Button btAct2;
    private Button btAct3;
    private Button btAct4;
    private Button btAct5;
    private Button btSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btAct1=(Button) findViewById(R.id.btAct1);
        btAct2=(Button) findViewById(R.id.btAct2);
        btAct3=(Button) findViewById(R.id.btAct3);
        btAct4=(Button) findViewById(R.id.btAct4);
        btAct5=(Button) findViewById(R.id.btAct5);
        btSalir=(Button) findViewById(R.id.btSalir);

        btAct1.setOnClickListener(this);
        btAct2.setOnClickListener(this);
        btAct3.setOnClickListener(this);
        btAct4.setOnClickListener(this);
        btAct5.setOnClickListener(this);
        btSalir.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v) {
        if (v.getId()==findViewById(R.id.btAct1).getId()) {
            Intent intent = new Intent(MainActivity.this, Actividad1.class);
            startActivity(intent);
        }

        if (v.getId()==findViewById(R.id.btAct2).getId()) {
            Intent intent = new Intent(MainActivity.this, Actividad2.class);
            startActivity(intent);
        }


        if (v.getId()==findViewById(R.id.btAct3).getId()) {
            Intent intent = new Intent(MainActivity.this, Actividad3.class);
            startActivity(intent);
        }

        if (v.getId()==findViewById(R.id.btAct4).getId()) {
            Intent intent = new Intent(MainActivity.this, Actividad4.class);
            startActivity(intent);
        }



        if (v.getId()==findViewById(R.id.btSalir).getId()) {
            finish();
        }

    }
}
