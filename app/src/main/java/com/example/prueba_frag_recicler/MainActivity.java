package com.example.prueba_frag_recicler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentTransaction transaction;
    Fragment Frpizza, Frpastas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Frpizza = new FragmentPizza ();
        Frpastas = new FragmentPastas();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedorfragment,Frpizza).commit();

    }

    public void onClick (View view){

        transaction=getSupportFragmentManager().beginTransaction();

        switch (view.getId()){
            case R.id.btnpizza: transaction.replace(R.id.contenedorfragment,Frpizza);
                break;
            case R.id.btnpastas: transaction.replace(R.id.contenedorfragment,Frpastas);
                break;
        }

        transaction.commit();

    }

}