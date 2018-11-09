package com.example.antoine.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;

public class Sports extends AppCompatActivity {

    ImageButton HomeImageButton;
    ImageButton     ProfilImageButton;
    ImageButton     SportsImageButton;
    GridView gridView;

    String[] values = {
            "Foot",
            "Basket",
            "PingPong"
    };

    int[] images = {
            R.drawable.football,
            R.drawable.hoop,
            R.drawable.pingpong
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        HomeImageButton = (ImageButton) findViewById(R.id.Home_Button);
        ProfilImageButton = (ImageButton) findViewById(R.id.ProfilButton);
        SportsImageButton = (ImageButton) findViewById(R.id.SportsButton);

        ProfilImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });

        SportsImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSports();
            }
        });

        gridView = (GridView) findViewById(R.id.SportsList);

        GridAdapter gridAdapter = new GridAdapter(this, values, images);

        gridView.setAdapter(gridAdapter);
    }

    public void openLogin() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void openProfile() {
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);
    }

    public void openSports() {
        Intent intent = new Intent(this, Sports.class);
        startActivity(intent);
    }
}
