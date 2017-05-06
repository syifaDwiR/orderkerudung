package com.example.toshiba.orderkerudung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class TopMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void onClickKerudung1(View v){
        Intent i = new Intent(this,maura.class);
        startActivity(i); // Pindah Intent
    }
    public void onClickKerudung2(View v){
        Intent i = new Intent(this,milodiol.class);
        startActivity(i); // Pindah Intent
    }
    public void onClickKerudung3(View v){
        Intent i = new Intent(this,pilpink.class);
        startActivity(i); // Pindah Intent
    }
    public void onClickKerudung4(View v){
        Intent i = new Intent(this,dark_flower.class);
        startActivity(i); // Pindah Intent
    }
    public void onClickKerudung5(View v){
        Intent i = new Intent(this,polos.class);
        startActivity(i); // Pindah Intent
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){ //Bila menekan tombol back maka akan kembali ke MainActivity.xml
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

}