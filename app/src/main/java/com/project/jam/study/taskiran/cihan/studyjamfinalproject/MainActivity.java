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

    private TextView myPlanetUyduSayisi;
    private TextView myPlanetYorungeEgikligi;
    private TextView myPlanetKavusumSuresi;
    private TextView myPlanetYorungeHizi;
    private TextView myPlanetYogunluk;


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
        // "@+id/planet_uydu_sayisi_text_view"
        myPlanetUyduSayisi = (TextView) findViewById(R.id.planet_uydu_sayisi_text_view);
        // "@+id/planet_uydu_sayisi_text_view"
        myPlanetYorungeEgikligi = (TextView) findViewById(R.id.planet_yorunge_egikligi_text_view);
        // "@+id/planet_kavusum_suresi_text_view"
        myPlanetKavusumSuresi = (TextView) findViewById(R.id.planet_kavusum_suresi_text_view);
        // "@+id/planet_yorunge_hizi_text_view"
        myPlanetYorungeHizi = (TextView) findViewById(R.id.planet_yorunge_hizi_text_view);
        // "@+id/planet_yogunluk_text_view"
        myPlanetYogunluk = (TextView) findViewById(R.id.planet_yogunluk_text_view);
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
            SetEarthInformation();
        } else if (position == 1) {//R.string.category_Mars
            SetMarsInformation();
        } else if (position == 2) {//R.string.Jupiter
            SetJupiterInformation();
        } else if (position == 3) {//R.string.Mercury
            SetMercuryInformation();
        } else if (position == 4) {//R.string.Saturn
            SetSaturnInformation();
        } else if (position == 5) {//R.string.Venus
            SetVenusInformation();
        }
    }

    /*
    * Set Methods
    * */
    private void SetEarthInformation() {
        myPlanetImage.setImageResource(Earth.ImageId);
        myPlanetName.setText(Earth.Name);
        myPlanetOtherName.setText(Earth.OtherName);
        myPlanetDescription.setText(Earth.Description);
        // myPlanetAgeDescription.setText(Earth.AgeDescription);
        myPlanetYorungeEgikligi.setText(Earth.YorungeEgikligi);
        myPlanetKavusumSuresi.setText(Earth.KavusumSuresi);
        myPlanetYorungeHizi.setText(Earth.YorungeHizi);
        myPlanetYogunluk.setText(Earth.Yogunluk);
        myPlanetUyduSayisi.setText((Earth.UyduSayisi).toString());
    }

    ;

    private void SetMarsInformation() {
        myPlanetImage.setImageResource(Mars.ImageId);
        myPlanetName.setText(Mars.Name);
        myPlanetOtherName.setText(Mars.OtherName);
        myPlanetDescription.setText(Mars.Description);
        //myPlanetAgeDescription.setText(Mars.AgeDescription);
        myPlanetYorungeEgikligi.setText(Mars.YorungeEgikligi);
        myPlanetKavusumSuresi.setText(Mars.KavusumSuresi);
        myPlanetYorungeHizi.setText(Mars.YorungeHizi);
        myPlanetYogunluk.setText(Mars.Yogunluk);
        myPlanetUyduSayisi.setText((Mars.UyduSayisi).toString());
    }

    ;

    private void SetJupiterInformation() {
        myPlanetImage.setImageResource(Jupiter.ImageId);
        myPlanetName.setText(Jupiter.Name);
        myPlanetOtherName.setText(Jupiter.OtherName);
        myPlanetDescription.setText(Jupiter.Description);
        //myPlanetAgeDescription.setText(Jupiter.AgeDescription);
        myPlanetYorungeEgikligi.setText(Jupiter.YorungeEgikligi);
        myPlanetKavusumSuresi.setText(Jupiter.KavusumSuresi);
        myPlanetYorungeHizi.setText(Jupiter.YorungeHizi);
        myPlanetYogunluk.setText(Jupiter.Yogunluk);
        myPlanetUyduSayisi.setText((Jupiter.UyduSayisi).toString());
    }

    ;

    private void SetMercuryInformation() {
        myPlanetImage.setImageResource(Mercury.ImageId);
        myPlanetName.setText(Mercury.Name);
        myPlanetOtherName.setText(Mercury.OtherName);
        myPlanetDescription.setText(Mercury.Description);
        //myPlanetAgeDescription.setText(Mercury.AgeDescription);
        myPlanetYorungeEgikligi.setText(Mercury.YorungeEgikligi);
        myPlanetKavusumSuresi.setText(Mercury.KavusumSuresi);
        myPlanetYorungeHizi.setText(Mercury.YorungeHizi);
        myPlanetYogunluk.setText(Mercury.Yogunluk);
        myPlanetUyduSayisi.setText((Mercury.UyduSayisi).toString());
    }

    ;

    private void SetSaturnInformation() {
        myPlanetImage.setImageResource(Saturn.ImageId);
        myPlanetName.setText(Saturn.Name);
        myPlanetOtherName.setText(Saturn.OtherName);
        myPlanetDescription.setText(Saturn.Description);
        //myPlanetAgeDescription.setText(Saturn.AgeDescription);
        myPlanetYorungeEgikligi.setText(Saturn.YorungeEgikligi);
        myPlanetKavusumSuresi.setText(Saturn.KavusumSuresi);
        myPlanetYorungeHizi.setText(Saturn.YorungeHizi);
        myPlanetYogunluk.setText(Saturn.Yogunluk);
        myPlanetUyduSayisi.setText((Saturn.UyduSayisi).toString());
    }

    ;

    private void SetVenusInformation() {
        myPlanetImage.setImageResource(Venus.ImageId);
        myPlanetName.setText(Venus.Name);
        myPlanetOtherName.setText(Venus.OtherName);
        myPlanetDescription.setText(Venus.Description);
        // myPlanetAgeDescription.setText(Venus.AgeDescription);
        myPlanetYorungeEgikligi.setText(Venus.YorungeEgikligi);
        myPlanetKavusumSuresi.setText(Venus.KavusumSuresi);
        myPlanetYorungeHizi.setText(Venus.YorungeHizi);
        myPlanetYogunluk.setText(Venus.Yogunluk);
        myPlanetUyduSayisi.setText((Venus.UyduSayisi).toString());
    }

    ;


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

    private void setPlanetYorungeEgikligi(String yorungeEgikligi) {
        myPlanetYorungeEgikligi.setText(yorungeEgikligi);
    }

    private void setPlanetKavusumSuresi(String kavusumSuresi) {
        myPlanetKavusumSuresi.setText(kavusumSuresi);
    }

    private void setPlanetYorungeHizi(String yorungeHizi) {
        myPlanetYorungeHizi.setText(yorungeHizi);
    }

    private void setPlanetYogunluk(String yogunluk) {
        myPlanetYogunluk.setText(yogunluk);
    }

    private void setPlanetUyduSayisi(Integer uyduSayisi) {
        myPlanetUyduSayisi.setText(uyduSayisi);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        // TODO Auto-generated method stub

    }
}
