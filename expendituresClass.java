package com.example.final_project;

import android.widget.Button;
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

public class expendituresClass extends AppCompatActivity{



    private LinearLayout recentExpenditureLayout;
    private int expenseCount=2;
    private Button addExpenditure;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expenditures);

        addExpenditure = findViewById(R.id.add_expenditure);
        recentExpenditureLayout = findViewById(R.id.recentexpenditure);


        addExpenditure.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                addNewExpense((++expenseCount)+". New Expense" ,"$ "+ Math.floor(Math.random()*100));
            }
        });



    }

    private void addNewExpense(String title , String amount){
        CardView cardView = new CardView(this);
        LinearLayout.LayoutParams params= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(20,10,10,20);

        cardView.setLayoutParams(params);
        cardView.setElevation(10);
        cardView.setBackgroundColor(Color.parseColor("#bababa"));
        cardView.setRadius(16);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setPadding(10,10,10,10);

        EditText titleEditText = new EditText(expendituresClass.this);
        titleEditText.setText(title);
        titleEditText.setTextSize(20);
        titleEditText.setBackgroundColor(Color.TRANSPARENT);
        titleEditText.setPadding(10,10,10,10);
        titleEditText.setTypeface(null, Typeface.BOLD);
        titleEditText.setTextColor(Color.parseColor("#000000"));

        EditText amountEditText = new EditText(this);
        amountEditText.setText(amount);
        amountEditText.setTextSize(20);
        amountEditText.setBackgroundColor(Color.TRANSPARENT);
        amountEditText.setTypeface(null, Typeface.BOLD);
        amountEditText.setPadding(5,5,5,5);
        amountEditText.setTextColor(Color.parseColor("#fa333e"));

        linearLayout.addView(titleEditText);
        linearLayout.addView(amountEditText);

        cardView.addView(linearLayout);

        recentExpenditureLayout.addView(cardView);

    }


}
