package com.example.delhitravelapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements PlaceDescClickListener{
    RecyclerView recyclerView;

    ArrayList<Place> placeArrayListMain;
    ArrayList<PlaceDesc> placeDescArrayList;

    CustomAdapter adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        placeArrayListMain = new ArrayList<>();
        placeArrayListMain.add(new Place("Akshardham Temple", "Everyday expect Monday", R.drawable.akshardham));
        placeArrayListMain.add(new Place("Lotus Temple", "Everyday expect Monday", R.drawable.lotus_temple));
        placeArrayListMain.add(new Place("Birla Mandir", "Daily", R.drawable.birla_mandir));
        placeArrayListMain.add(new Place("Garden of Five Senses", "Daily", R.drawable.gardens_of_five_senses));
        placeArrayListMain.add(new Place("Humayun's Tomb", "Daily", R.drawable.humayuns_tomb_delhi));
        placeArrayListMain.add(new Place("India Gate", "Daily", R.drawable.india_gate));
        placeArrayListMain.add(new Place("Jantar Mantar", "Daily", R.drawable.jantar_mantar));
        placeArrayListMain.add(new Place("Lodi Tomb", "Daily", R.drawable.lodi_tomb));
        placeArrayListMain.add(new Place("Purana Qila", "Daily", R.drawable.purana_quila));
        placeArrayListMain.add(new Place("Safdarjang Tomb", "Daily", R.drawable.safdarjang_tomb));

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new CustomAdapter(placeArrayListMain);

        adapter.setPlaceDescClickListener(this);

        recyclerView.setAdapter(adapter);


        placeDescArrayList = new ArrayList<>();
        placeDescArrayList.add(new PlaceDesc("On NH 24 Akshardham Setu",
                "Akshardham",
                "9:30AM-6:30PM",
                "Adults : 170 \n" +
                        "Senior Citizen : 125 \n" +
                        "Child (4-11 yrs) : 100 \n" +
                        "Child (Below 4 yrs) : Free"));


        placeDescArrayList.add(new PlaceDesc("Near Kalkaji Temple,\n" +
                "\n" +
                "East of Nehru Place",
                "Kalkaji Mandir",
                "9:00AM-5:30PM",
                "Free"));

        placeDescArrayList.add(new PlaceDesc("Near Gole Market,\n" +
                "\n" +
                "Mandir Marg, Connaught Place",
                "Rk Ashram Marg",
                "4:30am-1:30pm\n" +
                        "\n" +
                        "& 2.30pm-9.00pm.",
                "Free"));

    }

    @Override
    public void PlaceDesc_onClick(View v, int pos, int imageRes, String PlaceName) {

        PlaceDesc p = placeDescArrayList.get(pos);

        Intent i = new Intent(getApplicationContext(), MasterActivity.class);
        i.putExtra("title", PlaceName);
        i.putExtra("loc", p.getLocation());
        i.putExtra("metro", p.getMetro());
        i.putExtra("time", p.getTime());
        i.putExtra("fee", p.getFee());
        i.putExtra("image", imageRes);

        startActivity(i);
    }
}