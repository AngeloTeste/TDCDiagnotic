package com.ap.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;
import android.view.MotionEvent;

/**
 * Created by tangelo on 23/07/2015.
 */
public class PhotoActivity extends Activity {

    private ViewFlipper viewFlipper;
    private float lastX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tdc_photo);
        viewFlipper = (ViewFlipper) findViewById(R.id.view_flipper);

        Button buttonContact=(Button)findViewById(R.id.contact);
        buttonContact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), ContactActivity.class);
                startActivity(i);
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

        Button buttonPrestation=(Button)findViewById(R.id.prestation);
        buttonPrestation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), PrestationActivity.class);
                startActivity(i);
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
    }

    // Method to handle touch event like left to right swap and right to left swap
    public boolean onTouchEvent(MotionEvent touchevent)
    {
        switch (touchevent.getAction())
        {
            // when user first touches the screen to swap
            case MotionEvent.ACTION_DOWN:
            {
                lastX = touchevent.getX();
                break;
            }
            case MotionEvent.ACTION_UP:
            {
                float currentX = touchevent.getX();

                // if left to right swipe on screen
                if (lastX < currentX)
                {
                    // If no more View/Child to flip
                    if (viewFlipper.getDisplayedChild() == 0)
                        break;

                    // set the required Animation type to ViewFlipper
                    // The Next screen will come in form Left and current Screen will go OUT from Right
                    viewFlipper.setInAnimation(this, R.anim.in_from_left);
                    viewFlipper.setOutAnimation(this, R.anim.out_to_right);
                    // Show the next Screen
                    viewFlipper.showNext();
                }

                // if right to left swipe on screen
                if (lastX > currentX)
                {
                    if (viewFlipper.getDisplayedChild() == 1)
                        break;
                    // set the required Animation type to ViewFlipper
                    // The Next screen will come in form Right and current Screen will go OUT from Left
                    viewFlipper.setInAnimation(this, R.anim.in_from_right);
                    viewFlipper.setOutAnimation(this, R.anim.out_to_left);
                    // Show The Previous Screen
                    viewFlipper.showPrevious();
                }
                break;
            }
        }
        return false;
}}
