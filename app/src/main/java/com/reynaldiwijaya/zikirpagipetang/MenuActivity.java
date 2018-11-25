package com.reynaldiwijaya.zikirpagipetang;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void btnDzikirPagi(View view) {
        Intent pindah = new Intent(MenuActivity.this, RecycleActivity.class);
        startActivity(pindah);
    }


    public void btnDzikirPetang(View view) {
        Intent pindah1 = new Intent(MenuActivity.this, Recycle2Activity.class);
        startActivity(pindah1);
    }
}
