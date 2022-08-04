package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.os.IResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =findViewById( R.id.button);
        EditText editText = findViewById(R.id.editTextNumber);
        TextView textView = findViewById(R.id.textView3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a =4;
                if (editText.getText().toString().isEmpty())
                {
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("please enter Answer");
                }

                else if ( Integer.parseInt(editText.getText().toString())==a) {
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("Correct");
                }
               else if ( Integer.parseInt(editText.getText().toString())!=a)
                {
                    textView.setVisibility(View.VISIBLE);
                    textView.setText("Incorrect");
                }

                InputMethodManager inputMethodManager= (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);
            }
        });


    }
}