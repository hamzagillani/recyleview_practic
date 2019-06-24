package com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    private int[] images={R.drawable.akita_puppy,R.drawable.boxer_intense,R.drawable.chih,
    R.drawable.cocker_spaniel,R.drawable.doberman_distant,R.drawable.german_shepherd,R.drawable.lab,R.drawable.pomeranian,R.drawable.sheep_dog,R.drawable.neighboord_dog};
    private String[] dog_names={"Akita Puppy", "Boxer Intense", "Chih Dog", "Cocker Spaniel", "Doberman Distant", "German Shepherd", "Labrador","Pomeranian","Sheep Dog","Neighborhood dogs"};

    private RecyclerView.LayoutManager layoutManager;
    private RecyclerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView_id);
        layoutManager=new GridLayoutManager(this,2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new RecyclerAdapter(MainActivity.this,images,dog_names);
        recyclerView.setAdapter(adapter);

    }
}
