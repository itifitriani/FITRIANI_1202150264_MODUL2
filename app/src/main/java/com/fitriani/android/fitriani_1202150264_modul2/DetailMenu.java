package com.fitriani.android.fitriani_1202150264_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {

    //untuk mendeklarasi objek
    TextView tv_food, tv_price;
    ImageView iv_photo;

    //method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        Intent intent = getIntent(); //mengambil data dari activity sebelumnya
        String food = intent.getStringExtra("food"); //mengambil data nama makanan yang tersedia
        Integer price = intent.getIntExtra("price",0); //mengambil data harga makanan yang tersedia
        Integer photo = intent.getIntExtra("photo",0); //mengambil foto makanan yang tersedia

        Log.d("getIntExtra", ""+price+photo);

        tv_food = (TextView)findViewById(R.id.tv_detailFood);
        tv_price = (TextView)findViewById(R.id.tv_detailPrice);
        iv_photo = (ImageView)findViewById(R.id.iv_detailPhoto);

        tv_food.setText(food);
        tv_price.setText("Rp. "+price);
        iv_photo.setImageResource(photo);
    }
}
