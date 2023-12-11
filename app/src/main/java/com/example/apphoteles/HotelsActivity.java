package com.example.apphoteles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HotelsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private HotelAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        // Configuración del RecyclerView
        recyclerView = findViewById(R.id.rvHotels);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Inicializa tu lista de hoteles
        List<Hotel> hotelList = new ArrayList<>();

        hotelList.add(new Hotel("Hotel Madrid", R.drawable.hotel1, "España"));
        hotelList.add(new Hotel("Hotel Venecia", R.drawable.hotel2, "Italia" ));
        hotelList.add(new Hotel("Hotel Londres", R.drawable.hotel3, "Inglaterra"));
        hotelList.add(new Hotel("Hotel Tokio", R.drawable.hotel4, "Japón"));
        hotelList.add(new Hotel("Hotel Buenos Aires", R.drawable.hotel5, "Argentina"));



        // Configuración del adapter
        adapter = new HotelAdapter(hotelList);
        recyclerView.setAdapter(adapter);

        // Configuración de la Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Configuración del botón para visitar hoteles
        ImageButton btnVisited = findViewById(R.id.btnVisited);
        btnVisited.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para iniciar VisitedActivity
                Intent intent = new Intent(HotelsActivity.this, VisitedActivity.class);
                startActivity(intent);
            }
        });
    }
}
