package com.example.apphoteles;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.HotelViewHolder> {

    private List<Hotel> hotelList;

    // Constructor
    public HotelAdapter(List<Hotel> hotelList) {
        this.hotelList = hotelList;
    }

    @Override
    public HotelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hotel, parent, false);
        return new HotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HotelViewHolder holder, int position) {
        final Hotel hotel = hotelList.get(position);
        holder.bind(hotel);

        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Se ha añadido " + hotel.getName() + " a favoritos", Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return hotelList != null ? hotelList.size() : 0;
    }

    public class HotelViewHolder extends RecyclerView.ViewHolder {
        ImageButton btnFavorite;
        ImageView hotelImage;
        TextView hotelName, hotelLocation;

        public HotelViewHolder(View itemView) {
            super(itemView);
            btnFavorite = itemView.findViewById(R.id.btnFavorite);
            hotelImage = itemView.findViewById(R.id.ivHotelImage);
            hotelName = itemView.findViewById(R.id.tvHotelName);
            hotelLocation = itemView.findViewById(R.id.tvHotelLocation);

        }

        public void bind(Hotel hotel) {
            hotelName.setText(hotel.getName());
            hotelLocation.setText(hotel.getLocation());
            hotelImage.setImageResource(hotel.getImageResourceId());
        }

    }
}
