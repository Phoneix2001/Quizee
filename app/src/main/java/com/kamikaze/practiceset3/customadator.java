package com.kamikaze.practiceset3;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


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
            // on click listner
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if  (holder.getAdapterPosition()==0){

                       Toast.makeText(view.getContext(), "You want to know about : " + monstername.getName(), Toast.LENGTH_SHORT).show();
                       Intent intent1 = new Intent(view.getContext(), monsterwebpage.class);
                        intent1.putExtra("imageview",monstername.getImage());
                        intent1.putExtra("ahdfajsfjla",monstername.getName());
                        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                       view.getContext().startActivity(intent1);
                    }
                    if (holder.getAdapterPosition()==1){
                        Toast.makeText(view.getContext(), "You want to know about : " + monstername.getName(), Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(view.getContext(), monsterwebpage.class);
                        intent1.putExtra("imageview",monstername.getImage());
                        intent1.putExtra("ahdfajsfjla",monstername.getName());
                        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        view.getContext().startActivity(intent1);
                    }
                    if (holder.getAdapterPosition()==3){
                        Toast.makeText(view.getContext(), "You want to know about : " + monstername.getName(), Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(view.getContext(), monsterwebpage.class);
                        intent1.putExtra("imageview",monstername.getImage());
                        intent1.putExtra("ahdfajsfjla",monstername.getName());
                        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        view.getContext().startActivity(intent1);
                    }
                    if (holder.getAdapterPosition()==4){
                        Toast.makeText(view.getContext(), "You want to know about : " + monstername.getName(), Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(view.getContext(), monsterwebpage.class);
                        intent1.putExtra("imageview",monstername.getImage());
                        intent1.putExtra("ahdfajsfjla",monstername.getName());
                        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        view.getContext().startActivity(intent1);
                    }
                    if (holder.getAdapterPosition()==5){
                        Toast.makeText(view.getContext(), "You want to know about : " + monstername.getName(), Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(view.getContext(), monsterwebpage.class);
                        intent1.putExtra("imageview",monstername.getImage());
                        intent1.putExtra("ahdfajsfjla",monstername.getName());
                        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        view.getContext().startActivity(intent1);
                    }
                    if (holder.getAdapterPosition()==6){
                        Toast.makeText(view.getContext(), "You want to know about : " + monstername.getName(), Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(view.getContext(), monsterwebpage.class);
                        intent1.putExtra("imageview",monstername.getImage());
                        intent1.putExtra("ahdfajsfjla",monstername.getName());
                        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        view.getContext().startActivity(intent1);
                    }
                    if (holder.getAdapterPosition()==7){
                        Toast.makeText(view.getContext(), "You want to know about : " + monstername.getName(), Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(view.getContext(), monsterwebpage.class);
                        intent1.putExtra("imageview",monstername.getImage());
                        intent1.putExtra("ahdfajsfjla",monstername.getName());
                        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        view.getContext().startActivity(intent1);
                    }
                    if (holder.getAdapterPosition()==8){
                        Toast.makeText(view.getContext(), "You want to know about : " + monstername.getName(), Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(view.getContext(), monsterwebpage.class);
                        intent1.putExtra("imageview",monstername.getImage());
                        intent1.putExtra("ahdfajsfjla",monstername.getName());
                        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        view.getContext().startActivity(intent1);
                    }
                    if (holder.getAdapterPosition()==9){
                        Toast.makeText(view.getContext(), "You want to know about : " + monstername.getName(), Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(view.getContext(), monsterwebpage.class);
                        intent1.putExtra("imageview",monstername.getImage());
                        intent1.putExtra("ahdfajsfjla",monstername.getName());
                        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        view.getContext().startActivity(intent1);
                    }
                    if (holder.getAdapterPosition()==10){
                        Toast.makeText(view.getContext(), "You want to know about : " + monstername.getName(), Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(view.getContext(), monsterwebpage.class);
                        intent1.putExtra("imageview",monstername.getImage());
                        intent1.putExtra("ahdfajsfjla",monstername.getName());
                        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        view.getContext().startActivity(intent1);
                    }
                    if (holder.getAdapterPosition()==11){
                        Toast.makeText(view.getContext(), "You want to know about : " + monstername.getName(), Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(view.getContext(), monsterwebpage.class);
                        intent1.putExtra("imageview",monstername.getImage());
                        intent1.putExtra("ahdfajsfjla",monstername.getName());
                        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        view.getContext().startActivity(intent1);
                    }
                    if (holder.getAdapterPosition()==12){
                        Toast.makeText(view.getContext(), "You want to know about : " + monstername.getName(), Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(view.getContext(), monsterwebpage.class);
                        intent1.putExtra("imageview",monstername.getImage());
                        intent1.putExtra("ahdfajsfjla",monstername.getName());
                        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        view.getContext().startActivity(intent1);
                    }
                }


            });
        }

        @Override
        public int getItemCount() {
            return database.length;
        }


}


