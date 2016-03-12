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
    private TextView myPlanetOtherName;

    private TextView myPlanetDescription;
    private TextView myPlanetAgeDescription;


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
        // "@+id/planet_name"
        myPlanetOtherName = (TextView) findViewById(R.id.planet_other_name_text_view);

        // "@+id/planet_name"
        myPlanetDescription = (TextView) findViewById(R.id.planet_description_text_view);

        // "@+id/planet_name"
        //myPlanetAgeDescription = (TextView) findViewById(R.id.planet_age_description_text_view);
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
            setPlanetPicture(Earth.ImageId);
            setPlanetNames(Earth.Name, Earth.OtherName);
            setPlanetDescription(Earth.Description);
            //setPlanetAgeDescription(Earth.AgeDescription);
        } else if (position == 1) {//R.string.category_Mars
            setPlanetPicture(Mars.ImageId);
            setPlanetNames(Mars.Name, Mars.OtherName);
            setPlanetDescription(Mars.Description);
            //setPlanetAgeDescription(Mars.AgeDescription);
        } else if (position == 2) {//R.string.Jupiter
            setPlanetPicture(Jupiter.ImageId);
            setPlanetNames(Jupiter.Name, Jupiter.OtherName);
            setPlanetDescription(Jupiter.Description);
            //setPlanetAgeDescription(Jupiter.AgeDescription);
        } else if (position == 3) {//R.string.Mercury
            setPlanetPicture(Mercury.ImageId);
            setPlanetNames(Mercury.Name, Mercury.OtherName);
            setPlanetDescription(Mercury.Description);
            //setPlanetAgeDescription(Mercury.AgeDescription);
        } else if (position == 4) {//R.string.Saturn
            setPlanetPicture(Saturn.ImageId);
            setPlanetNames(Saturn.Name, Saturn.OtherName);
            setPlanetDescription(Saturn.Description);
            //setPlanetAgeDescription(Saturn.AgeDescription);
        } else if (position == 5) {//R.string.Venus
            setPlanetPicture(Venus.ImageId);
            setPlanetNames(Venus.Name, Venus.OtherName);
            setPlanetDescription(Venus.Description);
            //setPlanetAgeDescription(Venus.AgeDescription);
        }
    }

    /*
    * Set Methods
    * */
    private void setPlanetPicture(int resourceId) {
        myPlanetImage.setImageResource(resourceId);
    }
    private void setPlanetNames(String name, String otherName) {
        myPlanetName.setText(name);
        myPlanetOtherName.setText(otherName);
    }
    private void setPlanetDescription(String description) {
        myPlanetDescription.setText(description);
    }
    private void setPlanetAgeDescription(String ageDescription) {
        myPlanetAgeDescription.setText(ageDescription);
    }


    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        // TODO Auto-generated method stub

    }
}
