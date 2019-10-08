package com.antonio.gitapplication2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by Antonio Sánchez -- 08/10/2019. -- company Ltd -- antoniom.sanchezf@gmail.com
 */
public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
    }

    private  void desdeLocal(){}

    private void desdeLocalBuscarConflito(){}
    private void desdeRemoto(){}
}
