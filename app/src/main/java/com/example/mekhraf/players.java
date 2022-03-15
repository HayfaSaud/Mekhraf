package com.example.mekhraf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class players extends AppCompatActivity {

    public int numPlayers = 0;
//    TextView num = findViewById(R.id.num);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
        getActionBar().hide();
        Button twoPlayers = findViewById(R.id.twoPlayers);
        Button threePlayers = findViewById(R.id.threePlayers);
        Button fourPlayers = findViewById(R.id.fourPLayers);
        EditText name = findViewById(R.id.name);

//        Button start = findViewById(R.id.start);
//        Button inc = findViewById(R.id.start); //increase button
//        Button dec = findViewById(R.id.start);  //decrease button
//        num.setText("2");
//        inc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if ((numPlayers<4)){
//                inc();
//            }}
//        });
//        dec.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (numPlayers>=3){
//                    dec();
//                }
//            }
//        });
//        start.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                goToSession();
//            }
//        });
//        twoPlayers.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent session = new Intent(this, sesion.class);
//                session.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                session.putExtra("name", name.getText());
//                getBaseContext().startActivity(session);
//            }
//        });
        Spinner spinner = (Spinner) findViewById(R.id.accent);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.accent, R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

//        threePlayers.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                goToSession();
//            }
//        });

//            fourPlayers.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            goToSession();
//        }
//    });
//
//
//    public void goToSession(){
//        startActivity(new Intent(this, session.class));
//    }

//    public void inc(){
//        numPlayers++;
//        num.setText(numPlayers);
//
//    }
//    public void dec(){
//        numPlayers--;
//        num.setText(numPlayers);
//    }
    }
}