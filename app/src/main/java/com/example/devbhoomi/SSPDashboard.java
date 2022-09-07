package com.example.devbhoomi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SSPDashboard extends AppCompatActivity {
    private CardView Juvenile,Suicide,Rape,Murder,DA,CA,Th,Regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sspdashboard);
        Juvenile = findViewById(R.id.juv);
        Juvenile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // opening a login activity on clicking login text.
                Intent i = new Intent(SSPDashboard.this, ShowCasesJ.class);
                startActivity(i);
            }
        });
        Suicide = findViewById(R.id.su);
        Suicide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // opening a login activity on clicking login text.
                Intent i = new Intent(SSPDashboard.this, SSPDashboard.class);
                startActivity(i);
            }
        });
        Rape = findViewById(R.id.rape);
        Rape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // opening a login activity on clicking login text.
                Intent i = new Intent(SSPDashboard.this, ShowCasesRape.class);
                startActivity(i);
            }
        });
        Murder = findViewById(R.id.mu);
        Murder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // opening a login activity on clicking login text.
                Intent i = new Intent(SSPDashboard.this, ShowMurder.class);
                startActivity(i);
            }
        });
        DA = findViewById(R.id.drug);
        DA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // opening a login activity on clicking .login text.
                Intent i = new Intent(SSPDashboard.this, Graphs.class);
                startActivity(i);
            }
        });
        CA = findViewById(R.id.CHH);
        CA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // opening a login activity on clicking login text.
                Intent i = new Intent(SSPDashboard.this, GraphChallan.class);
                startActivity(i);
            }
        });
        Th = findViewById(R.id.Thef);
        Th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // opening a login activity on clicking login text.
                Intent i = new Intent(SSPDashboard.this, ShowActivity.class);
                startActivity(i);
            }
        });
        Regis = findViewById(R.id.Thef);
        Regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // opening a login activity on clicking login text.
                Intent i = new Intent(SSPDashboard.this, ShowActivity.class);
                startActivity(i);
            }
        });


    }
}