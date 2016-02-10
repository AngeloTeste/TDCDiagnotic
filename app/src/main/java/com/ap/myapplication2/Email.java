package com.ap.myapplication2;

/**
 * Created by tangelo on 14/09/2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Email extends Activity implements View.OnClickListener {

    EditText  presta, votreNom, tel;
    String  votrePreta, nom, phone;
    Button sendEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email);
        initializeVars();
        sendEmail.setOnClickListener(this);
    }

    private void initializeVars() {
        // TODO Auto-generated method stub
       // personsEmail = (EditText) findViewById(R.id.etEmails);
        presta = (EditText) findViewById(R.id.etIntro);
        votreNom = (EditText) findViewById(R.id.etName);
        tel = (EditText) findViewById(R.id.etThings);
        sendEmail = (Button) findViewById(R.id.bSentEmail);
    }

    public void onClick(View v) {
        // TODO Auto-generated method stub

        convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated();

        String message = "Bonjour, je suis Mr "
                + nom
                + " Je suis interesse par la prestation "
                + votrePreta
                + ".  Vous pouvez aussi me contacter au  "
                + phone
                +"Cordialement ";

        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.putExtra(Intent.EXTRA_EMAIL, "contact@tdc-diagnostic.com");
        emailIntent.putExtra(Intent.EXTRA_SUBJECT , "Prise d'information a partir de TDCDiag ");
        emailIntent.setType("plain/text");
        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
        startActivity(emailIntent);
    }

    private void convertEditTextVarsIntoStringsAndYesThisIsAMethodWeCreated() {
        // TODO Auto-generated method stub

        votrePreta = presta.getText().toString();
        nom = votreNom.getText().toString();
        phone = tel.getText().toString();

    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}