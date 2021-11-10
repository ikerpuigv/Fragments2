package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boto1,boto2;

        boto1=findViewById(R.id.fragment1Button1);
        boto2=findViewById(R.id.fragment1Button2);
        boto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: inflar el fragment
                FragmentManager fm = getSupportFragmentManager();
                ///OPCIONAL MIRA SI ESTA VACIO, SI LO ESTA LE PONE UN FRAGMENT
                if (fm.findFragmentById(R.id.contenidor1) == null) {
                    BlankFragment1 fragment1 = new BlankFragment1();
                    fm.beginTransaction().add(R.id.contenidor1,fragment1).commit();
                }
            }
        });
        boto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                ///OPCIONAL MIRA SI ESTA VACIO, SI LO ESTA LE PONE UN FRAGMENT
                if (fm.findFragmentById(R.id.contenidor2) == null) {
                    BlankFragment2 fragment2 = new BlankFragment2();
                    fm.beginTransaction().add(R.id.contenidor2,fragment2).commit();
                }
            }
        });
    }
}