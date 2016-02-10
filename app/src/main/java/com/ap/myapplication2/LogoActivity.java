package com.ap.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

/**
 * Created by tangelo on 13/09/2015.
 */
public class LogoActivity extends Activity {
    MediaPlayer thisSong;

    @Override
    protected void onCreate(Bundle AngeloLoveSheila) {
        super.onCreate(AngeloLoveSheila);
        setContentView(R.layout.start);
        thisSong = MediaPlayer.create(LogoActivity.this, R.raw.sloup);
        thisSong.start();
        Thread timer = new Thread(){
          public void run(){
              try{
                    sleep(3000);
              }catch (InterruptedException e){
                    e.printStackTrace();
              }finally {
                  Intent openStarting = new Intent("com.ap.myapplication2.MAINACTIVITY");
                    startActivity(openStarting);
              }
          }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        thisSong.release();
        finish();
    }
}
