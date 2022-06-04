package com.kamikaze.practiceset3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public  class customadator extends RecyclerView.Adapter<customadator.ViewHolder> {
    // 1- data source
    private database[] database;

    public customadator(database[] database) {

        this.database = database;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageview;
        public TextView textView;
        public TextView textView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageview = itemView.findViewById(R.id.imageView5);
            this.textView = itemView.findViewById(R.id.monstername);
            this.textView2 = itemView.findViewById(R.id.monstername2);
        }
    }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
           LayoutInflater inflater = LayoutInflater.from(parent.getContext());
           View listItem = inflater.inflate(R.layout.recycleviewlayoutmonstername, parent, false);
          //  View listItem = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycleviewlayoutmonstername, viewGroup, false);
            ViewHolder viewhlder = new ViewHolder(listItem);
            return viewhlder;
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            final database monstername = database[position];
           holder.imageview.setImageResource(database[position].getImage());
            holder.textView.setText(database[position].getName());
            holder.textView2.setText(database[position].getAge());
        }

        @Override
        public int getItemCount() {
            return database.length;
        }


    }

