package com.busragazel.restorantxml;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpActivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText emailEditText;
    private EditText mobileEditText;
    private EditText passwordEditText;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        initializeViews();
        setupClickListeners();
    }

    private void initializeViews() {
        nameEditText = findViewById(R.id.profileEditText);
        emailEditText = findViewById(R.id.editTextTextEmailAddress);
        mobileEditText = findViewById(R.id.callingEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        signUpButton = findViewById(R.id.button);
    }

    private void setupClickListeners() {
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSignUp();
            }
        });
    }

    private void handleSignUp() {
        String name = nameEditText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();
        String mobile = mobileEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();
        
        if (name.isEmpty()) {
            Toast.makeText(this, "Lütfen adınızı giriniz", Toast.LENGTH_SHORT).show();
            return;
        }
        
        if (email.isEmpty()) {
            Toast.makeText(this, "Lütfen email adresinizi giriniz", Toast.LENGTH_SHORT).show();
            return;
        }
        
        if (mobile.isEmpty()) {
            Toast.makeText(this, "Lütfen telefon numaranızı giriniz", Toast.LENGTH_SHORT).show();
            return;
        }
        
        if (password.isEmpty()) {
            Toast.makeText(this, "Lütfen şifrenizi giriniz", Toast.LENGTH_SHORT).show();
            return;
        }
        
        // Burada gerçek kayıt işlemi yapılabilir
        Toast.makeText(this, "Kayıt başarılı!", Toast.LENGTH_SHORT).show();
        
        // İsteğe bağlı: LoginActivity'ye geri dön
        finish();
    }
}
