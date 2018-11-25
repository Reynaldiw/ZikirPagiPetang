package com.reynaldiwijaya.zikirpagipetang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    @BindView(R.id.recycleActivity)
    RecyclerView recycleActivity;

    String [] dzikirPagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        dzikirPagi = getResources().getStringArray(R.array.dzikir_pagi);

        Adapter adapter = new Adapter(RecycleActivity.this, dzikirPagi);

        recycleActivity.setHasFixedSize(true);
        recycleActivity.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        recycleActivity.setAdapter(adapter);
    }
}
