package com.example.instaloginpage;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText e;
    private EditText d;// Declare EditText as a class variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the EditText within the onCreate method
        e = findViewById(R.id.t1);
        d=findViewById(R.id.t2);
    }

    public void onLoginButtonClick(View view) {
        String username = e.getText().toString(); // Get the text content of the username EditText
        String password = d.getText().toString(); // Get the text content of the password EditText

        if (username.equals("") || password.equals("")) {
            showToast("Enter details");
        } else {
            e.setText(""); // Clear the username EditText
            d.setText(""); // Clear the password EditText
            showToast("Login Successful!");
        }
    }


    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
