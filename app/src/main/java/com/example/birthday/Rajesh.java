package com.example.birthday;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Rajesh extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajesh);

        ImageSlider imageSlider=findViewById(R.id.is);


        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.df));
        slideModels.add(new SlideModel(R.drawable.dg));
        slideModels.add(new SlideModel(R.drawable.dt));
        slideModels.add(new SlideModel(R.drawable.gf));
        slideModels.add(new SlideModel(R.drawable.fd));
        slideModels.add(new SlideModel(R.drawable.jh));
        slideModels.add(new SlideModel(R.drawable.sd));
        imageSlider.setImageList(slideModels,false);
        mediaPlayer= MediaPlayer.create(Rajesh.this,R.raw.hbd);
        mediaPlayer.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.release();
    }
}