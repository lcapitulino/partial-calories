package com.example.lcapitulino.calorias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private double textToDouble(EditText text) {
        return Double.parseDouble(text.getText().toString());
    }

    public void onClickCalculatePartialCalories(View view) {
        EditText txtTotalGrams = (EditText) findViewById(R.id.totalGrams);
        EditText txtTotalCalories = (EditText) findViewById(R.id.totalCalories);
        EditText txtPartialGrams = (EditText) findViewById(R.id.partialGrams);

        double totalGrams = textToDouble(txtTotalGrams);
        double totalCalories = textToDouble(txtTotalCalories);
        double partialGrams = textToDouble(txtPartialGrams);

        TextView txtPartialCalories = (TextView) findViewById(R.id.partialCalories);
        int partialCalories = (int) ((totalCalories * partialGrams) / totalGrams);
        txtPartialCalories.setText(String.valueOf(partialCalories));
    }
}
