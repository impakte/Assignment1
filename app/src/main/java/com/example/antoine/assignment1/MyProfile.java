package com.example.antoine.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MyProfile extends AppCompatActivity {

    ImageButton     HomeImageButton;
    ImageButton     ProfilImageButton;
    ImageButton     SportsImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

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
