package com.reynaldiwijaya.zikirpagipetang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Recycle2Activity extends AppCompatActivity {

    @BindView(R.id.recycleActivity2)
    RecyclerView recycleActivity2;

    String [] dzikirPetang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle2);
        ButterKnife.bind(this);

        dzikirPetang = getResources().getStringArray(R.array.dzikir_petang);

        Adapter2 adapter2 = new Adapter2(Recycle2Activity.this, dzikirPetang);

        recycleActivity2.setHasFixedSize(true);
        recycleActivity2.setLayoutManager(new LinearLayoutManager(Recycle2Activity.this));
        recycleActivity2.setAdapter(adapter2);
    }
}
