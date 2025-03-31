package com.example.final_project;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LinearLayout recentExpenditureLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recentExpenditureLayout = findViewById(R.id.recentexpenditure);

        Button balance = findViewById(R.id.balance);
        Button biweekly = findViewById(R.id.biweekly);

        balance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start SecondActivity when the button is clicked
                Intent intent = new Intent(MainActivity.this, SecondClass.class);
                startActivity(intent);


            }
        });

        biweekly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start SecondActivity when the button is clicked
                Intent intent = new Intent(MainActivity.this, expendituresClass.class);
                startActivity(intent);


            }
        });




    }




}