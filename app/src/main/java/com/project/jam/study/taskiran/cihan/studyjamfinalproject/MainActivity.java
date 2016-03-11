package com.project.jam.study.taskiran.cihan.studyjamfinalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner myPlanetListSpinner;
    private ImageView myPlanetImage;
    private TextView myPlanetName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeLayoutItems();

        setSpinnerCategories();

    }

    private void initializeLayoutItems() {
        // Spinner
        myPlanetListSpinner = (Spinner) findViewById(R.id.planets_spinner);
        myPlanetListSpinner.setOnItemSelectedListener(this);

        // @+id/photo_image_view"
        myPlanetImage = (ImageView) findViewById(R.id.planet_photo_image_view);

        // "@+id/planet_name"
        myPlanetName = (TextView) findViewById(R.id.planet_name_text_view);
    }

    private void setSpinnerCategories() {
        // Spinner Drop down elements
        ArrayList<String> categories = new ArrayList<String>();

        categories.add(getResources().getString(R.string.Earth));
        categories.add(getResources().getString(R.string.Mars));
        categories.add(getResources().getString(R.string.Jupiter));
        categories.add(getResources().getString(R.string.Mercury));
        categories.add(getResources().getString(R.string.Saturn));
        categories.add(getResources().getString(R.string.Venus));

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        myPlanetListSpinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

        if (position == 0) {// R.string.category_earth
            setPlanetPicture(Earth.PhotoId);
            setPlanetName(Earth.Name);
        } else if (position == 1) {//R.string.category_Mars
            setPlanetPicture(R.drawable.mars);
            //setPlanetName();
        } else if (position == 2) {

        } else if (position == 3) {

        } else if (position == 4) {

        } else if (position == 5) {

        }
    }

    private void setPlanetPicture(int resourceId) {
        myPlanetImage.setImageResource(resourceId);
    }

    private void setPlanetName(String name) {
        if (name == null) {
            return;
        }

        myPlanetName.setText(name);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        // TODO Auto-generated method stub

    }
}
