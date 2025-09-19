package com.busragazel.restorantxml;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {

    private List<MainActivity.Restaurant> restaurants;

    public RestaurantAdapter(List<MainActivity.Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_restaurant_card, parent, false);
        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        MainActivity.Restaurant restaurant = restaurants.get(position);
        
        holder.restaurantImage.setImageResource(restaurant.getImageRes());
        holder.restaurantName.setText(restaurant.getName());
        holder.recommendedTag.setText(restaurant.getTag());
        holder.itemCount.setText(String.valueOf(restaurant.getItemCount()));
        
        // Rating stars
        holder.ratingStars.setText("★★★★★");
    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    public static class RestaurantViewHolder extends RecyclerView.ViewHolder {
        ImageView restaurantImage;
        TextView restaurantName;
        TextView ratingStars;
        TextView recommendedTag;
        TextView itemCount;

        public RestaurantViewHolder(@NonNull View itemView) {
            super(itemView);
            restaurantImage = itemView.findViewById(R.id.restaurantImage);
            restaurantName = itemView.findViewById(R.id.restaurantName);
            ratingStars = itemView.findViewById(R.id.ratingStars);
            recommendedTag = itemView.findViewById(R.id.recommendedTag);
            itemCount = itemView.findViewById(R.id.itemCount);
        }
    }
}
