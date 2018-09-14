package com.devodriqroberts.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {
    private FactBook factBook = new FactBook();
    private BackgroundColors backgroundColors = new BackgroundColors();

    // Declare View variables
    private TextView factTextView;
    private Button showNewFactButton;
    private RelativeLayout relativeLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views from the layout files to the corresponding variables
        factTextView = findViewById(R.id.factTextView);
        showNewFactButton = findViewById(R.id.showNewFactButton);
        relativeLayout = findViewById(R.id.relativeLayout);


        // Onclick listener / Method
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Button clicked, update factTextView with new fact
                // Get fact from factBook obj
                // Update UI with new fact
                factTextView.setText(factBook.getNewFact());

                // Get color from BackgroundColor obj
                // Update UI with new color
                int color = backgroundColors.getRandomColor();
                showNewFactButton.setTextColor(color);
                relativeLayout.setBackgroundColor(color);
            }
        };
        showNewFactButton.setOnClickListener(listener);

    }
}
