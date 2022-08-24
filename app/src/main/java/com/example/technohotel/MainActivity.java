package com.example.technohotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;

import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nav_menu, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton singleBtn=findViewById(R.id.single_room);
        ImageButton doubleBtn=findViewById(R.id.double_room);
        ImageButton suiteBtn=findViewById(R.id.suite);
        ImageButton deluxeBtn=findViewById(R.id.deluxe);
        ImageButton viewBtn=findViewById(R.id.view_room);
        ImageButton studioBtn=findViewById(R.id.studio);
        singleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dataPage = new Intent(MainActivity.this, CustomerInfo.class);
                startActivity(dataPage);

            }
        });
        doubleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dataPage = new Intent(MainActivity.this, CustomerInfo.class);
                startActivity(dataPage);
            }
        });
        suiteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dataPage = new Intent(MainActivity.this, CustomerInfo.class);
                startActivity(dataPage);
            }
        });
        deluxeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dataPage = new Intent(MainActivity.this, CustomerInfo.class);
                startActivity(dataPage);
            }
        });
        viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dataPage = new Intent(MainActivity.this, CustomerInfo.class);
                startActivity(dataPage);
            }
        });
        studioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dataPage = new Intent(MainActivity.this, CustomerInfo.class);
                startActivity(dataPage);
            }
        });

    }
}