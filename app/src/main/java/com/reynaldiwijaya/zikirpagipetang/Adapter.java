package com.reynaldiwijaya.zikirpagipetang;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    String [] dzikir_Pagi;

    public Adapter(Context context, String[] dzikirPagi) {
        this.context = context;
        this.dzikir_Pagi = dzikirPagi;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_dzikir,viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, int i) {
        viewHolder.dzikirPagi.setText(dzikir_Pagi[i]);

    }

    @Override
    public int getItemCount() {
        return dzikir_Pagi.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView dzikirPagi;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            dzikirPagi = itemView.findViewById(R.id.dzikirPagi);

        }
    }
}
