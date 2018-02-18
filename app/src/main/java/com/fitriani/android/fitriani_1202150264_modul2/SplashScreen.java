package com.fitriani.android.fitriani_1202150264_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Toast.makeText(this, "FITRIANI_1202150264", Toast.LENGTH_SHORT).show(); //akan menampilkan toast FITRIANI_1202150264
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            // method untuk mengarahkan ke aktivitas selanjutnya
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MenuUtama.class));
                finish();
            }
        }, 5000L); //5000 L = 5 detik
    }
}

