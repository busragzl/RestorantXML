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

public class PasswordActivity extends AppCompatActivity {

    private EditText emailOrMobileEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_password);
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        initializeViews();
        setupClickListeners();
    }

    private void initializeViews() {
        emailOrMobileEditText = findViewById(R.id.emailOrMobileEditText);
        submitButton = findViewById(R.id.submitButton);
    }

    private void setupClickListeners() {
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSubmit();
            }
        });
    }

    private void handleSubmit() {
        String emailOrMobile = emailOrMobileEditText.getText().toString().trim();
        
        if (emailOrMobile.isEmpty()) {
            Toast.makeText(this, "Lütfen email veya telefon numarası giriniz", Toast.LENGTH_SHORT).show();
            return;
        }
        
        // Burada gerçek şifre sıfırlama işlemi yapılabilir
        Toast.makeText(this, "Şifre sıfırlama bağlantısı gönderildi", Toast.LENGTH_SHORT).show();
        
        // İsteğe bağlı: LoginActivity'ye geri dön
        finish();
    }
}
