package com.reynaldiwijaya.zikirpagipetang;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewHolder> {

    Context context;
    String[] dzikirPetang;

    public Adapter2(Context context, String[] dzikirPetang) {
        this.context = context;
        this.dzikirPetang = dzikirPetang;
    }
    @NonNull
    @Override
    public Adapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view1 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_dzikir,viewGroup,false);
        return new ViewHolder(view1);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter2.ViewHolder viewHolder, int i) {
        viewHolder.dzikirPetang.setText(dzikirPetang[i]);

    }

    @Override
    public int getItemCount() {
        return dzikirPetang.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView dzikirPetang;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            dzikirPetang = itemView.findViewById(R.id.dzikirPagi);
        }
    }
}
