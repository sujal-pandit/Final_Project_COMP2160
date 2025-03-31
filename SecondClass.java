package com.example.final_project;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;


public class SecondClass extends AppCompatActivity {
    private LinearLayout currentSavingsLayout;
    private int savingsCount=2;
    private Button addSavings;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        addSavings=findViewById(R.id.add_savings);
        currentSavingsLayout =findViewById(R.id.currentsavings);



        addSavings.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                addNewSavings((++savingsCount)+". New Savings","$ "+ Math.floor(Math.random()*100),"$ "+Math.floor(Math.random()*100));
            }
        });

    }


private void addNewSavings(String title, String collectedAmount, String requiredAmount) {
    CardView cardView = new CardView(SecondClass.this);
    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT);
    params.setMargins(20, 10, 10, 20);

    cardView.setLayoutParams(params);
    cardView.setElevation(10);
    cardView.setBackgroundColor(Color.parseColor("#d1e7dd")); // Light green background for savings
    cardView.setRadius(16);

    LinearLayout linearLayout = new LinearLayout(SecondClass.this);
    linearLayout.setOrientation(LinearLayout.VERTICAL);
    linearLayout.setPadding(10, 10, 10, 10);

    EditText titleEditText = new EditText(SecondClass.this);
    titleEditText.setText(title);
    titleEditText.setTextSize(20);
    titleEditText.setBackgroundColor(Color.TRANSPARENT);
    titleEditText.setPadding(10, 10, 10, 10);
    titleEditText.setTypeface(null, Typeface.BOLD);
    titleEditText.setTextColor(Color.parseColor("#000000"));

    LinearLayout amountsLayout = new LinearLayout(SecondClass.this);
    amountsLayout.setOrientation(LinearLayout.HORIZONTAL);
    amountsLayout.setLayoutParams(new LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT));

    TextView collectedLabel = new TextView(SecondClass.this);
    collectedLabel.setText("Collected: ");
    collectedLabel.setTextSize(19);
    collectedLabel.setTextColor(Color.parseColor("#204c39"));
    collectedLabel.setTypeface(null, Typeface.BOLD);
    collectedLabel.setPadding(5, 5, 5, 5);

    EditText collectedEditText = new EditText(SecondClass.this);
    collectedEditText.setText(collectedAmount);
    collectedEditText.setTextSize(20);
    collectedEditText.setBackgroundColor(Color.TRANSPARENT);
    collectedEditText.setPadding(5, 5, 5, 5);
    collectedEditText.setTypeface(null, Typeface.BOLD);
    collectedEditText.setTextColor(Color.parseColor("#204c39"));

    TextView requiredLabel = new TextView(SecondClass.this);
    requiredLabel.setText("Required: ");
    requiredLabel.setTextSize(19);
    requiredLabel.setTextColor(Color.parseColor("#204c39"));
    requiredLabel.setTypeface(null, Typeface.BOLD);
    requiredLabel.setPadding(5, 5, 5, 5);

    EditText requiredEditText = new EditText(SecondClass.this);
    requiredEditText.setText(requiredAmount);
    requiredEditText.setTextSize(20);
    requiredEditText.setBackgroundColor(Color.TRANSPARENT);
    requiredEditText.setPadding(5, 5, 5, 5);
    requiredEditText.setTypeface(null, Typeface.BOLD);
    requiredEditText.setTextColor(Color.parseColor("#fa333e"));

    amountsLayout.addView(collectedLabel);
    amountsLayout.addView(collectedEditText);
    amountsLayout.addView(requiredLabel);
    amountsLayout.addView(requiredEditText);

    linearLayout.addView(titleEditText);
    linearLayout.addView(amountsLayout);

    cardView.addView(linearLayout);
    currentSavingsLayout.addView(cardView);
}
}
