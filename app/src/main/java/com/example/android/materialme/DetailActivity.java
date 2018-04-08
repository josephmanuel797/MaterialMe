package com.example.android.materialme;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.materialme.R;


public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView sportTitle = (TextView)findViewById(R.id.titleDetail);
        ImageView sportImage = (ImageView)findViewById(R.id.sportsImageDetail);

        sportTitle.setText(getIntent().getStringExtra("title"));

        Glide.with(this).load(getIntent().getIntExtra("Image_resource",0)).into(sportImage);
    }
}