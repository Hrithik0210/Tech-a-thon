package com.example.photofiltering;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.photofiltering.databinding.ActivityResultBinding;

import java.io.File;


public class ResultActivity extends AppCompatActivity {
    ActivityResultBinding binding;
//    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.image.setImageURI(getIntent().getData());
        binding.shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri imageUri = Uri.parse(getIntent().getData().toString());
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("image/png");

                intent.putExtra(Intent.EXTRA_STREAM, imageUri);
                startActivity(Intent.createChooser(intent , "Share"));
            }
        });

        binding.facebookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri imageUri = Uri.parse(getIntent().getData().toString());
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("image/png");

                intent.putExtra(Intent.EXTRA_STREAM, imageUri);
                startActivity(Intent.createChooser(intent , "Share"));
            }
        });

        binding.whatsappBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri imageUri = Uri.parse(getIntent().getData().toString());
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("image/png");

                intent.putExtra(Intent.EXTRA_STREAM, imageUri);
                startActivity(Intent.createChooser(intent , "Share"));
            }
        });
        binding.instagrambtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri imageUri = Uri.parse(getIntent().getData().toString());
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("image/png");

                intent.putExtra(Intent.EXTRA_STREAM, imageUri);
                startActivity(Intent.createChooser(intent , "Share"));
            }
        });
        binding.shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri imageUri = Uri.parse(getIntent().getData().toString());
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("image/png");

                intent.putExtra(Intent.EXTRA_STREAM, imageUri);
                startActivity(Intent.createChooser(intent , "Share"));
            }
        });

        binding.homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultActivity.this,MainActivity.class));
            }
        });

        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultActivity.this,MainActivity.class));
            }
        });

//        mInterstitialAd = new InterstitialAd(this);
//        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
//        mInterstitialAd.loadAd(new AdRequest.Builder().build());
//
//        mInterstitialAd.setAdListener(new AdListener() {
//            @Override
//            public void onAdLoaded() {
//                super.onAdLoaded();
//
//                if(mInterstitialAd.isLoaded())
//                    mInterstitialAd.show();
//            }
//        });

    }
}