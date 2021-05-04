package com.midterm.ecommerceplants;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.midterm.ecommerceplants.model.Plant;
import com.midterm.ecommerceplants.model.PlantEvent;

import org.greenrobot.eventbus.EventBus;

public class PlantDetailActivity extends AppCompatActivity {
    private ImageView mImgPlant;
    private TextView mTxtPlantName, mTxtPlantPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_detail);
        if (getIntent() != null) {
            Plant plant = getIntent().getParcelableExtra("plant");
            mImgPlant = findViewById(R.id.iv_avatar_holder);
            mTxtPlantName = findViewById(R.id.tv_name_holder);
            mTxtPlantPrice = findViewById(R.id.tv_price_holder);
            Button button = findViewById(R.id.test);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    EventBus.getDefault().post(new PlantEvent(plant));
                }
            });
            Glide.with(this).load(plant.getImage()).into(mImgPlant);
            mTxtPlantName.setText(plant.getName());
            mTxtPlantPrice.setText(plant.getPrice());
        } else {
            Log.d("PlantDetailActivity", "PlantDetailActivity getIntent null");
            onBackPressed();
        }
    }
}