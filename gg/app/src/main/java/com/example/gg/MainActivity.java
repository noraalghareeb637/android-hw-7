package com.example.gg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<pokemon> mypokemon=new ArrayList<>();
        pokemon p1 = new pokemon(name:"Ivysaur",R.drawable.iii,attack :62 , defence :63 , total: 405);
        pokemon p2 = new pokemon(name:"Charmeleon",R.drawable.charmeleon,,attack :64 , defence :58 , total: 405);
        pokemon p3 = new pokemon(name:"Clefairy",R.drawable.clefairy,attack :70 , defence :73 , total: 323);
        pokemon p4 = new pokemon(name:"Clefable",R.drawable.clefable,attack :64 , defence :58 , total: 438);

        mypokemon.add(p1);
        mypokemon.add(p2);
        mypokemon.add(p3);
        mypokemon.add(p4);

        RecyclerView rv = findViewById(R.id.RecyclerView);
        rv.setHasfixedSize(true);
        RecyclerView.LayoutManager ln =new LinearLayoutManager (context: this )
        rv.setLayoutManager(ln);


    }
}