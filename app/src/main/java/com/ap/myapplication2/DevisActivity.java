package com.ap.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by angelotheleme on 27/01/2016.
 */
public class DevisActivity extends Activity {

    private RadioGroup radioType, radioAnnee,radioChauffage, radioLocaux;
    private RadioButton radioTypeB, radioAnneeB, radioChauffageB, radioLocauxB;
    private Button envoi;

   /* public String recupText(long t) {
        int typeId = radioType.getCheckedRadioButtonId();
        radioTypeB = (RadioButton) findViewById(typeId);
        String textTypeB = radioTypeB.getText().toString();

        int anneeId = radioAnnee.getCheckedRadioButtonId();
        radioAnneeB = (RadioButton) findViewById(typeId);
        String textAnneeB = radioAnneeB.getText().toString();

        int chaffageId = radioChauffage.getCheckedRadioButtonId();
        radioChauffageB = (RadioButton) findViewById(typeId);
        String textChauffageB = radioChauffageB.getText().toString();

        int locauxId = radioLocaux.getCheckedRadioButtonId();
        radioLocauxB = (RadioButton) findViewById(typeId);
        String textLocauxB = radioLocauxB.getText().toString();

        String textMail = ("Voici le devis gratuit de votre client, qui a" + textTypeB + "construit" + textAnneeB + "avec" + textChauffageB + "plus" + textLocauxB);

        return textMail;
    }*/





    public void envoyerEmail(String destinataire, String objet, String text) {
        Intent i = new Intent(Intent.ACTION_SEND);

        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{destinataire}); //destinataire = "exemple@email.com"
        i.putExtra(Intent.EXTRA_SUBJECT, objet);
        i.putExtra(Intent.EXTRA_TEXT, text);

        try {
            startActivity(Intent.createChooser(i, "Envoyer email..."));
        } catch (android.content.ActivityNotFoundException e) {
            Toast.makeText(DevisActivity.this, "Client email introuvable", Toast.LENGTH_SHORT).show();
        }
    }




    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.devis);
        radioType=(RadioGroup) findViewById(R.id.typeRadio);
        radioAnnee=(RadioGroup) findViewById(R.id.anneeRadio);
        radioChauffage=(RadioGroup) findViewById(R.id.chauffageRadio);
        radioLocaux=(RadioGroup) findViewById(R.id.locauxRadio);
        envoi=(Button) findViewById(R.id.envoyer);







        envoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int typeId = radioType.getCheckedRadioButtonId();
                radioTypeB = (RadioButton) findViewById(typeId);
                String textTypeB = radioTypeB.getText().toString();

                int anneeId = radioAnnee.getCheckedRadioButtonId();
                radioAnneeB = (RadioButton) findViewById(anneeId);
                String textAnneeB = radioAnneeB.getText().toString();

                int chaffageId = radioChauffage.getCheckedRadioButtonId();
                radioChauffageB = (RadioButton) findViewById(chaffageId);
                String textChauffageB = radioChauffageB.getText().toString();

                int locauxId = radioLocaux.getCheckedRadioButtonId();
                radioLocauxB = (RadioButton) findViewById(locauxId);
                String textLocauxB = radioLocauxB.getText().toString();

                EditText codePostal = (EditText) findViewById(R.id.codePostale);
                String textCode = codePostal.getText().toString();

                String textMail = ("Voici le devis gratuit d'un client du "+textCode+" , qui a " + textTypeB + " construit " + textAnneeB + " avec un chauffage " + textChauffageB + " et comme locaux annexes: " + textLocauxB)+".";


                envoyerEmail("angelo.theleme@gmail.com","Devis gratuit",textMail);

            }
        });

/*        String typeText=radioTypeB.getText().toString();

        System.out.print(typeText);*/
    }
}
