package com.project.jam.study.taskiran.cihan.studyjamfinalproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by cihan.taskiran on 13.3.16.
 */
public class ImageDetailActivity extends AppCompatActivity {


    private ImageView myPlanetImage_01;
    private ImageView myPlanetImage_02;
    private ImageView myPlanetImage_03;
    private ImageView myPlanetImage_selected;

    private Integer SelectedPlanetPosition;
    public static int selectedImage01Id;
    public static int selectedImage02Id;
    public static int selectedImage03Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_detail_activity);


        Intent myIntent = getIntent(); // gets the previously created intent
        SelectedPlanetPosition = myIntent.getIntExtra("SelectedPlanetPosition",0);

        Log.e("ImageDetailActivity", "SelectedPlanetPosition: " + SelectedPlanetPosition.toString());

        initializeLayoutItems();

        setSelectedPlanet(SelectedPlanetPosition);
    }

    /*
    * * set initialize layout items
    * */
    private void initializeLayoutItems() {
        // @+id/planet_photo_image_view_list1"
        myPlanetImage_01 = (ImageView) findViewById(R.id.planet_photo_image_view_list1);
        // @+id/planet_photo_image_view_list2"
        myPlanetImage_02 = (ImageView) findViewById(R.id.planet_photo_image_view_list2);
        // @+id/planet_photo_image_view_list3"
        myPlanetImage_03 = (ImageView) findViewById(R.id.planet_photo_image_view_list3);
        // @+id/planet_selected_photo_image_view"
        myPlanetImage_selected = (ImageView) findViewById(R.id.planet_selected_photo_image_view);
    }

    /*
    * * @attr position type of Integer,
    * * Which by Earth, Mars, Jupiter, Mercury, Saturn, Venus
    * */
    private void setSelectedPlanet(Integer position) {

        if (position == 0) {// R.string.category_earth
            selectedImage01Id = Earth.Image01Id;
            selectedImage02Id = Earth.Image02Id;
            selectedImage03Id = Earth.Image03Id;
            myPlanetImage_01.setImageResource(Earth.Image01Id);
            myPlanetImage_02.setImageResource(Earth.Image02Id);
            myPlanetImage_03.setImageResource(Earth.Image03Id);
            myPlanetImage_selected.setImageResource(Earth.Image01Id);
        } else if (position == 1) {//R.string.category_Mars
            selectedImage01Id = Mars.Image01Id;
            selectedImage02Id = Mars.Image02Id;
            selectedImage03Id = Mars.Image03Id;
            myPlanetImage_01.setImageResource(Mars.Image01Id);
            myPlanetImage_02.setImageResource(Mars.Image02Id);
            myPlanetImage_03.setImageResource(Mars.Image03Id);
            myPlanetImage_selected.setImageResource(Mars.Image01Id);
        } else if (position == 2) {//R.string.Jupiter
            selectedImage01Id = Jupiter.Image01Id;
            selectedImage02Id = Jupiter.Image02Id;
            selectedImage03Id = Jupiter.Image03Id;
            myPlanetImage_01.setImageResource(Jupiter.Image01Id);
            myPlanetImage_02.setImageResource(Jupiter.Image02Id);
            myPlanetImage_03.setImageResource(Jupiter.Image03Id);
            myPlanetImage_selected.setImageResource(Jupiter.Image01Id);
        } else if (position == 3) {//R.string.Mercury
            selectedImage01Id = Mercury.Image01Id;
            selectedImage02Id = Mercury.Image02Id;
            selectedImage03Id = Mercury.Image03Id;
            myPlanetImage_01.setImageResource(Mercury.Image01Id);
            myPlanetImage_02.setImageResource(Mercury.Image02Id);
            myPlanetImage_03.setImageResource(Mercury.Image03Id);
            myPlanetImage_selected.setImageResource(Mercury.Image01Id);
        } else if (position == 4) {//R.string.Saturn
            selectedImage01Id = Saturn.Image01Id;
            selectedImage02Id = Saturn.Image02Id;
            selectedImage03Id = Saturn.Image03Id;
            myPlanetImage_01.setImageResource(Saturn.Image01Id);
            myPlanetImage_02.setImageResource(Saturn.Image02Id);
            myPlanetImage_03.setImageResource(Saturn.Image03Id);
            myPlanetImage_selected.setImageResource(Saturn.Image01Id);
        } else if (position == 5) {//R.string.Venus
            selectedImage01Id = Venus.Image01Id;
            selectedImage02Id = Venus.Image02Id;
            selectedImage03Id = Venus.Image03Id;
            myPlanetImage_01.setImageResource(Venus.Image01Id);
            myPlanetImage_02.setImageResource(Venus.Image02Id);
            myPlanetImage_03.setImageResource(Venus.Image03Id);
            myPlanetImage_selected.setImageResource(Venus.Image01Id);
        }
    }

    /*
    * * onClick methods
    * */
    public void setSelectedImage01(View v){
        myPlanetImage_selected.setImageResource(selectedImage01Id);
    }
    public void setSelectedImage02(View v){
        myPlanetImage_selected.setImageResource(selectedImage02Id);
    }
    public void setSelectedImage03(View v){
        myPlanetImage_selected.setImageResource(selectedImage03Id);
    }

    public void goToMainActivity(View v) {
        Intent intent = new Intent(ImageDetailActivity.this, MainActivity.class);
        startActivity(intent);
    }

}