package cis3334.flooring_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultsActivity extends AppCompatActivity {

    TextView tvResults;
    Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        tvResults = findViewById(R.id.tvResults);
        Bundle extras = getIntent().getExtras();
        Double width = extras.getDouble("WIDTH");
        Double length = extras.getDouble("LENGTH");
        Double area = width * length;
        tvResults.setText(area.toString());

        setupButton();
    }


    private void setupButton() {
        buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CIS 3334", "Back button clicked");   // log button click for debugging using "CIS 3334" tag
                // stop this intent to return to the main activity
                finish();
            }
        });
    }
}