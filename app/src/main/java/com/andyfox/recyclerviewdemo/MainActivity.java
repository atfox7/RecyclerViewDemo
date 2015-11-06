package com.andyfox.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);

        // We tell the recyclerview how we want the items in the recycler to display
        // in this case I use a LinearLayoutManager wich by default will tell the items to display one
        // after another in a vertical list
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // We make a champion adapter and give it the champion list
        List<Champion> championList = makeChampionList();
        ChampionAdapter championAdapter = new ChampionAdapter(championList);

        // then we tell the recyclerview to use this adapter
        // the adapter tells the recyclerview the data the recyclerview should show as we scroll through
        // the items
        recyclerView.setAdapter(championAdapter);

    }

    /**
     * This is just a helper function that creates a list of champions for me
     */
    private List<Champion> makeChampionList() {
        List<Champion> championList = new ArrayList<>();

        Champion champion = new Champion(0, "Aatrox");
        championList.add(champion);

        champion = new Champion(1, "Ahri");
        championList.add(champion);

        champion = new Champion(2, "Akali");
        championList.add(champion);

        champion = new Champion(3, "Alistar");
        championList.add(champion);

        champion = new Champion(4, "Amumu");
        championList.add(champion);

        champion = new Champion(5, "Anivia");
        championList.add(champion);

        champion = new Champion(6, "Annie");
        championList.add(champion);

        champion = new Champion(7, "Ashe");
        championList.add(champion);

        champion = new Champion(8, "Azir");
        championList.add(champion);

        champion = new Champion(9, "Bard");
        championList.add(champion);

        champion = new Champion(10, "Blitzcrank");
        championList.add(champion);

        champion = new Champion(11, "Brand");
        championList.add(champion);

        champion = new Champion(12, "Braum");
        championList.add(champion);

        champion = new Champion(13, "Caitlyn");
        championList.add(champion);

        champion = new Champion(14, "Cassiopeia");
        championList.add(champion);

        champion = new Champion(15, "Cho\' Gath");
        championList.add(champion);

        champion = new Champion(16, "Corki");
        championList.add(champion);

        champion = new Champion(17, "Darius");
        championList.add(champion);

        champion = new Champion(18, "Diana");
        championList.add(champion);

        champion = new Champion(19, "Draven");
        championList.add(champion);

        champion = new Champion(20, "Dr. Mundo");
        championList.add(champion);

        return championList;
    }
}
