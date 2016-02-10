package com.ap.myapplication2;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by tangelo on 07/08/2015.
 */
public class PrestationActivity extends Activity {

    //String classes [] ={"AmianteToast", "CarrezToast", "ElecToast", "EnergieToast", "GazToast", "PlombToast", "RisqueToast", "TermitesToast"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setListAdapter(new ArrayAdapter<String>(PrestationActivity.this,R.layout.tdc_prestation , classes ));
        setContentView(R.layout.tdc_prestation);

        Button buttonCarrez = (Button)findViewById(R.id.carrez);
        buttonCarrez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CarrezToast.class);
                startActivity(i);

            }

                //get my toast layout
               /* LayoutInflater inflater = getLayoutInflater();

                View layout = inflater.inflate(R.layout.toast_carrez, (ViewGroup) findViewById(R.id.toast_carrez));

                //toast
                for (int i = 0; i < 3; i++) {

                    Toast toast = new Toast(getApplicationContext());
                    toast.setDuration(toast.LENGTH_LONG);
                    toast.setView(layout);
                    toast.show();
                }


            }*/
        });

        Button buttonAmiante = (Button)findViewById(R.id.amiante);
        buttonAmiante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), AmianteToast.class);
                startActivity(i);

               /* //get my toast layout
                LayoutInflater inflater =getLayoutInflater();

                View layout = inflater.inflate(R.layout.toast_amiante, (ViewGroup) findViewById(R.id.toast_amiante));

                //toast
                for (int i=0;i<3;i++) {

                    Toast toast = new Toast(getApplicationContext());
                    toast.setDuration(toast.LENGTH_LONG);
                    toast.setView(layout);
                    toast.show();
                }*/



            }
        });

        Button buttonPlomb = (Button)findViewById(R.id.plomb);
        buttonPlomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PlombToast.class);
                startActivity(i);

            }

                //get my toast layout
               /* LayoutInflater inflater = getLayoutInflater();

                View layout = inflater.inflate(R.layout.toast_plomb, (ViewGroup) findViewById(R.id.toast_plomb));

                //toast
                for (int i = 0; i < 3; i++) {

                    Toast toast = new Toast(getApplicationContext());
                    toast.setDuration(toast.LENGTH_LONG);
                    toast.setView(layout);
                    toast.show();
                }


            }*/
        });

        Button buttonGaz = (Button)findViewById(R.id.gaz);
        buttonGaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), GazToast.class);
                startActivity(i);

            }

                //get my toast layout
               /* LayoutInflater inflater = getLayoutInflater();

                View layout = inflater.inflate(R.layout.toast_gaz, (ViewGroup) findViewById(R.id.toast_gaz));

                //toast
                for (int i = 0; i < 3; i++) {

                    Toast toast = new Toast(getApplicationContext());
                    toast.setDuration(toast.LENGTH_LONG);
                    toast.setView(layout);
                    toast.show();
                }


            }*/
        });

        Button buttonElec = (Button)findViewById(R.id.electrique);
        buttonElec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ElecToast.class);
                startActivity(i);
            }


                //get my toast layout
              /*  LayoutInflater inflater = getLayoutInflater();

                View layout = inflater.inflate(R.layout.toast_elec, (ViewGroup) findViewById(R.id.toast_elec));

                //toast
                for (int i = 0; i < 3; i++) {

                    Toast toast = new Toast(getApplicationContext());
                    toast.setDuration(toast.LENGTH_LONG);
                    toast.setView(layout);
                    toast.show();
                }


            }*/
        });

        Button buttonTermite = (Button)findViewById(R.id.termite);
        buttonTermite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), TermitesToast.class);
                startActivity(i);
            }

                //get my toast layout
               /* LayoutInflater inflater = getLayoutInflater();

                View layout = inflater.inflate(R.layout.toast_termite, (ViewGroup) findViewById(R.id.toast_termite));

                //toast
                for (int i = 0; i < 3; i++) {

                    Toast toast = new Toast(getApplicationContext());
                    toast.setDuration(toast.LENGTH_LONG);
                    toast.setView(layout);
                    toast.show();
                }


            }*/
        });

        Button buttonRisque = (Button)findViewById(R.id.risque);
        buttonRisque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), RisqueToast.class);
                startActivity(i);
            }

                //get my toast layout
               /*LayoutInflater inflater = getLayoutInflater();

                View layout = inflater.inflate(R.layout.toast_risque, (ViewGroup) findViewById(R.id.toast_risque));

                //toast
                for (int i = 0; i < 3; i++) {

                    Toast toast = new Toast(getApplicationContext());
                    toast.setDuration(toast.LENGTH_LONG);
                    toast.setView(layout);
                    toast.show();
                }


            }*/
        });

        Button buttonEnergie = (Button)findViewById(R.id.energie);
        buttonEnergie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), EnergieToast.class);
                startActivity(i);
            }

                //get my toast layout
                /*LayoutInflater inflater = getLayoutInflater();

                View layout = inflater.inflate(R.layout.toast_energie, (ViewGroup) findViewById(R.id.toast_energie));

                //toast
                for (int i = 0; i < 3; i++) {

                    Toast toast = new Toast(getApplicationContext());
                    toast.setDuration(toast.LENGTH_LONG);
                    toast.setView(layout);
                    toast.show();
                }


            }*/
        });










        //Les boutons d'en bas

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

        Button buttonDiag=(Button)findViewById(R.id.loupe);
        buttonDiag.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), DiagActivity.class);
                startActivity(i);
            }
        });




    }
    /*@Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        super.onListItemClick(l, v, position, id);
        String cheese = classes[position];
        try {
            Class ourClass = Class.forName("com.ap.myapplication2."+ cheese);
            Intent ourIntent = new Intent(PrestationActivity.this, ourClass);
            startActivity(ourIntent);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }finally {

        }
    }*/


}
