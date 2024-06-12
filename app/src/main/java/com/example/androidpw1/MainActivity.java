package com.example.androidpw1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText loginInput, passwordInput;
    private AppCompatButton authBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginInput = findViewById(R.id.login_input);
        passwordInput = findViewById(R.id.password_input);
        authBtn = findViewById(R.id.auth_btn);

        authBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = loginInput.getText().toString();
                String password = passwordInput.getText().toString();

                if (login.equals("crabby") && password.equals("crabby")) {
                    Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Invalid login or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}