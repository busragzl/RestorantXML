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

public class ResetPasswordActivity extends AppCompatActivity {

    private EditText newPasswordEditText;
    private EditText confirmPasswordEditText;
    private Button resetPasswordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_password_reset);
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        initializeViews();
        setupClickListeners();
    }

    private void initializeViews() {
        newPasswordEditText = findViewById(R.id.newPasswordEditText);
        confirmPasswordEditText = findViewById(R.id.confirmPasswordEditText);
        resetPasswordButton = findViewById(R.id.resetPasswordButton);
    }

    private void setupClickListeners() {
        resetPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handlePasswordReset();
            }
        });
    }

    private void handlePasswordReset() {
        String newPassword = newPasswordEditText.getText().toString().trim();
        String confirmPassword = confirmPasswordEditText.getText().toString().trim();
        
        if (newPassword.isEmpty()) {
            Toast.makeText(this, "Lütfen yeni şifrenizi giriniz", Toast.LENGTH_SHORT).show();
            return;
        }
        
        if (confirmPassword.isEmpty()) {
            Toast.makeText(this, "Lütfen şifre onayını giriniz", Toast.LENGTH_SHORT).show();
            return;
        }
        
        if (!newPassword.equals(confirmPassword)) {
            Toast.makeText(this, "Şifreler eşleşmiyor", Toast.LENGTH_SHORT).show();
            return;
        }
        
        if (newPassword.length() < 6) {
            Toast.makeText(this, "Şifre en az 6 karakter olmalıdır", Toast.LENGTH_SHORT).show();
            return;
        }
        
        // Burada gerçek şifre sıfırlama işlemi yapılabilir
        Toast.makeText(this, "Şifre başarıyla sıfırlandı!", Toast.LENGTH_SHORT).show();
        
        // İsteğe bağlı: LoginActivity'ye geri dön
        finish();
    }
}
