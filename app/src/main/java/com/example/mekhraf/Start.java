//package com.example.mekhraf;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//
//public class Start extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_start);
//        Button start = findViewById(R.id.Start);
//        start.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                goToPlayers();
//            }
//        });
//    }
//    public void goToPlayers(){
//        startActivity(new Intent(this, players.class));
//    }
//
//}