package com.fitriani.android.fitriani_1202150264_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    // untuk men-deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        //untuk mengatur RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);

        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);

        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            //memberi dan memanggil nama makanan untuk data yang akan ditampilkan
            foods.add("Bakso");
            foods.add("Burger");
            foods.add("Capcay");
            foods.add("Es Teler");
            foods.add("Ice Cream");
            foods.add("Ikan Gurame");
            foods.add("Mie Ayam");
            foods.add("Nasi Goreng");
            foods.add("Puding");
            foods.add("Spaghetti");

            //mamanggil harga makanan
            priceses.add(15000);
            priceses.add(25000);
            priceses.add(20000);
            priceses.add(20000);
            priceses.add(15000);
            priceses.add(40000);
            priceses.add(20000);
            priceses.add(20000);
            priceses.add(10000);
            priceses.add(20000);

            //memanggil foto makanan yang telah dimasukkan di drawable
            photos.add(R.drawable.bakso);
            photos.add(R.drawable.burger);
            photos.add(R.drawable.cap_cay);
            photos.add(R.drawable.es_teler);
            photos.add(R.drawable.ice_cream);
            photos.add(R.drawable.ikan_gurame);
            photos.add(R.drawable.mie_ayam);
            photos.add(R.drawable.nasi_goreng);
            photos.add(R.drawable.puding);
            photos.add(R.drawable.spaghetti);
        }
    }
}