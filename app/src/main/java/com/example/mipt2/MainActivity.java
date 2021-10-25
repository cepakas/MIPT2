package com.example.mipt2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    Spinner spOption;
    EditText etInput;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.spOption = findViewById(R.id.spOption);

        this.etInput = findViewById(R.id.etInput);

        this.tvResult = findViewById(R.id.tvResult);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.counter_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spOption.setAdapter(adapter);
    }
    public void onBtnClick(View view)
    {
        String enteredText = this.etInput.getText().toString();
        String selectedOption = this.spOption.getSelectedItem().toString();
        if (enteredText.matches(""))
        {
            Toast.makeText(this, "Iveskite teksta!", Toast.LENGTH_SHORT).show();
            return;
        }
        else
            {
            if (selectedOption.equals("Zodziai"))
            {
                this.tvResult.setText(String.valueOf(TextCounter.getWordsCount(enteredText)));
            }
            else if (selectedOption.equals("Skyriamieji Zenklai"))
            {
                this.tvResult.setText(String.valueOf(TextCounter.getPuncCount(enteredText)));
            }
        }
    }

}