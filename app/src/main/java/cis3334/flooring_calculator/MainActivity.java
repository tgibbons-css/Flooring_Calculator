package cis3334.flooring_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button buttonShowResults;
    EditText etWidth, etLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLength = findViewById(R.id.etLength);
        etWidth = findViewById(R.id.etWidth);
        setupButton();

    }

    private void setupButton() {
        buttonShowResults = findViewById(R.id.btnShowResults);
        buttonShowResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CIS 3334", "Place order button clicked");   // log button click for debugging using "CIS 3334" tag
                // declare an intent for our new activity
                Intent i = new Intent(v.getContext(), ResultsActivity.class);
                Double width = Double.parseDouble(etWidth.getText().toString());
                Double length = Double.parseDouble(etLength.getText().toString());
                i.putExtra("WIDTH", width);
                i.putExtra("LENGTH", length);
                startActivity(i);       // display new activity
            }
        });
    }

}