package com.example.tourmyindia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Somnath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_somnath);

        // Set onClickListener for the button to open the map
        findViewById(R.id.gmap).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMap(view);
            }
        });
    }

    // Method to open Google Maps with the location of the Somnath Temple
    public void openMap(View view) {
        // Latitude and longitude of Somnath Temple
        double latitude = 20.8879899;
        double longitude = 70.4012569;

        // Create a geo URI for the location
        String uri = String.format("geo:%s,%s?q=%s,%s(Somnath+Temple)", latitude, longitude, latitude, longitude);

        // Create an Intent to view the location using Google Maps
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        intent.setPackage("com.google.android.apps.maps");

        // Check if there is an app to handle the intent and start it
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            // If Google Maps is not installed, open the location in a browser
            String url = String.format("https://www.google.com/maps/search/?api=1&query=%s,%s", latitude, longitude);
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(webIntent);
        }
    }
}
