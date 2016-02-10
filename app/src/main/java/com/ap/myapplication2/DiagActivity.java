package com.ap.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by tangelo on 04/08/2015.
 */
public class DiagActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tdc_diag);

        Button buttonContact=(Button)findViewById(R.id.contact);
        buttonContact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), ContactActivity.class);
                startActivity(i);
            }
        });
        Button buttonAccueil = (Button) findViewById(R.id.accueil);
        buttonAccueil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // TODO Auto-generated method stub
                Intent y = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(y);
            }
        });

        Button buttonPhoto = (Button) findViewById(R.id.photo);
        buttonPhoto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // TODO Auto-generated method stub
                Intent y = new Intent(getApplicationContext(), PhotoActivity.class);
                startActivity(y);
            }
        });

        Button buttonPrestation=(Button)findViewById(R.id.prestation);
        buttonPrestation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), PrestationActivity.class);
                startActivity(i);
            }
        });


    }
}

