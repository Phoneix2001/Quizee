package com.kamikaze.practiceset3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class allmonsternameinrecyclerview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allmonsternameinrecyclerview);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        database[] monstername = new database[]{
         new database(R.drawable.golem,"Golem","10000"),
               new database(R.drawable.vampire,"Vampire","10000"),
               new database(R.drawable.goblin,"Goblin","1000"),
               new database(R.drawable.lava,"Lava Hound"," 3652"),
                new database(R.drawable.orge,"Orge","54891"),
               new database(R.drawable.chimera,"Chimera"," 1007"),
                new database(R.drawable.gorgon,"Gorgon"," 19000"),
                new database(R.drawable.dragon,"Dragon","15000"),
                new database(R.drawable.bogeyman,"Bogyeman","25000"),
              new database(R.drawable.werewolf,"Werewolf","17820"),
               new database(R.drawable.loki,"Loki","19002155"),
                new database(R.drawable.nine,"Nine Tales Fox","1586200"),


        };
        customadator customadator = new customadator(monstername);
        recyclerView.setHasFixedSize(true);
       recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
       recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(this) );
        recyclerView.setAdapter(customadator);
    }


}