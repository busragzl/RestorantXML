package com.busragazel.restorantxml;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageView menuIcon;
    private ImageView cartIcon;
    private EditText searchEditText;
    private RecyclerView restaurantRecyclerView;
    private RestaurantAdapter restaurantAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        initializeViews();
        setupClickListeners();
        setupRestaurantList();
    }

    private void initializeViews() {
        menuIcon = findViewById(R.id.menuIcon);
        cartIcon = findViewById(R.id.cartIcon);
        searchEditText = findViewById(R.id.searchEditText);
        restaurantRecyclerView = findViewById(R.id.restaurantRecyclerView);
    }

    private void setupClickListeners() {
        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMenuDialog();
            }
        });

        cartIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sepet açıldı", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void showMenuDialog() {
        String[] menuItems = {
            "Login",
            "Sign Up", 
            "Forgot Password",
            "Reset Password",
            "Sign Up Success"
        };

        // PopupWindow için layout oluştur
        LayoutInflater inflater = LayoutInflater.from(this);
        View popupView = inflater.inflate(R.layout.popup_menu, null);
        
        ListView listView = popupView.findViewById(R.id.menuListView);
        
        // ArrayAdapter ile menü öğelerini ayarla
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
            android.R.layout.simple_list_item_1, menuItems) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView textView = (TextView) view.findViewById(android.R.id.text1);
                textView.setTextColor(Color.BLACK);
                textView.setPadding(32, 24, 32, 24);
                textView.setTextSize(16);
                return view;
            }
        };
        
        listView.setAdapter(adapter);
        
        // PopupWindow oluştur
        PopupWindow popupWindow = new PopupWindow(popupView, 
            ViewGroup.LayoutParams.WRAP_CONTENT, 
            ViewGroup.LayoutParams.WRAP_CONTENT, 
            true);
        
        // Arka plan ve stil ayarları
        popupWindow.setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        popupWindow.setElevation(8);
        
        // Menü ikonunun altına konumlandır
        int[] location = new int[2];
        menuIcon.getLocationOnScreen(location);
        
        // PopupWindow'u menü ikonunun altına göster
        popupWindow.showAtLocation(menuIcon, Gravity.NO_GRAVITY, 
            location[0], location[1] + menuIcon.getHeight() + 20);
        
        // ListView item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                popupWindow.dismiss();
                switch (position) {
                    case 0:
                        navigateToActivity(LoginActivity.class);
                        break;
                    case 1:
                        navigateToActivity(SignUpActivity.class);
                        break;
                    case 2:
                        navigateToActivity(PasswordActivity.class);
                        break;
                    case 3:
                        navigateToActivity(ResetPasswordActivity.class);
                        break;
                    case 4:
                        navigateToActivity(SignUpSuccessActivity.class);
                        break;
                }
            }
        });
    }

    private void navigateToActivity(Class<?> activityClass) {
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }

    private void setupRestaurantList() {
        List<Restaurant> restaurants = createRestaurantData();
        restaurantAdapter = new RestaurantAdapter(restaurants);
        restaurantRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        restaurantRecyclerView.setAdapter(restaurantAdapter);
    }

    private List<Restaurant> createRestaurantData() {
        List<Restaurant> restaurants = new ArrayList<>();
        
        // PNG'deki gibi 5 restoran kartı
        for (int i = 0; i < 5; i++) {
            restaurants.add(new Restaurant(
                "ABC Restaurant",
                5,
                "Recommended",
                18,
                R.drawable.rest
            ));
        }
        
        return restaurants;
    }

    // Restaurant model class
    public static class Restaurant {
        private String name;
        private int rating;
        private String tag;
        private int itemCount;
        private int imageRes;

        public Restaurant(String name, int rating, String tag, int itemCount, int imageRes) {
            this.name = name;
            this.rating = rating;
            this.tag = tag;
            this.itemCount = itemCount;
            this.imageRes = imageRes;
        }

        // Getters
        public String getName() { return name; }
        public int getRating() { return rating; }
        public String getTag() { return tag; }
        public int getItemCount() { return itemCount; }
        public int getImageRes() { return imageRes; }
    }
}