package com.ap.myapplication2;

/**
 * Created by tangelo on 22/07/2015.
 */

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ContactActivity extends Activity {

    public void envoyerEmail(String destinataire, String objet, String text) {
        Intent i = new Intent(Intent.ACTION_SEND);

        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{destinataire}); //destinataire = "exemple@email.com"
        i.putExtra(Intent.EXTRA_SUBJECT, objet);
        i.putExtra(Intent.EXTRA_TEXT, text);

        try {
            startActivity(Intent.createChooser(i, "Envoyer email..."));
        } catch (android.content.ActivityNotFoundException e) {
            Toast.makeText(ContactActivity.this, "Client email introuvable", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tdc_contact);

        Button buttonAppel =(Button) findViewById(R.id.appel);
        buttonAppel.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:0144879449"));
                startActivity(i);
            }
        });

        Button buttonMail =(Button) findViewById(R.id.mail);
        buttonMail.setOnClickListener(new View.OnClickListener(){


            @Override
        public void onClick(View view){


                envoyerEmail("contact@tdc-diagnostic.com","Prise de contact depuis l'application","Bonjour /n Cordialement");
            }
        });

        Button buttonAd = (Button) findViewById(R.id.ad);
        buttonAd.setOnClickListener(new View.OnClickListener() {

            @Override
        public void onClick(View view){
                try {
                    Uri uri = Uri.parse("geo:48.84539229999999,2.3878465000000233?q=10, rue du Colonel Rozanoff – 75012 Paris");
                    Intent it = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(it);
                } catch(ActivityNotFoundException e) {
                    Context context = getApplicationContext();
                    (Toast.makeText(context, "GoogleMap non trouvé", Toast.LENGTH_LONG)).show();
                }
            }
        });

        Button buttonAccueil=(Button)findViewById(R.id.accueil);
        buttonAccueil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // TODO Auto-generated method stub
                Intent y = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(y);
            }
        });

        Button buttonPhoto=(Button)findViewById(R.id.photo);
        buttonPhoto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // TODO Auto-generated method stub
                Intent y = new Intent(getApplicationContext(), PhotoActivity.class);
                startActivity(y);
            }
        });

        Button buttonDiag=(Button)findViewById(R.id.diag);
        buttonDiag.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), DiagActivity.class);
                startActivity(i);
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
