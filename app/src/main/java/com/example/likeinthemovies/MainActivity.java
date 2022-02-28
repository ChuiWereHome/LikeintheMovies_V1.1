package com.example.likeinthemovies;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.likeinthemovies.adapter.FilmAdapter;
import com.example.likeinthemovies.model.Film;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView filmRecycler;
    FilmAdapter filmAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Film> filmList = new ArrayList<>();
        filmList.add(new Film(1, "2008 FILM GODA", "2003", 700006));
        filmList.add(new Film(1, "2008 FILM GODA", "2002", 700004));
        filmList.add(new Film(1, "2008 FILM GODA", "1954", 700005));
        filmList.add(new Film(1, "2008 FILM GODA", "2001", 700006));
        setFilmRecycler(filmList);

    }

    private void setFilmRecycler(List<Film> filmList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        filmRecycler = findViewById(R.id.categoryRecycler);
        filmRecycler.setLayoutManager(layoutManager);

        filmAdapter = new FilmAdapter(this, filmList);
        filmRecycler.setAdapter(filmAdapter);

    }
}