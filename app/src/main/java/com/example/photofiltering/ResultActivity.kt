package com.example.photofiltering

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import com.example.photofiltering.MainActivity
import com.example.photofiltering.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    var binding: ActivityResultBinding? = null

    //    private InterstitialAd mInterstitialAd;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(
            layoutInflater
        )
        setContentView(binding!!.root)
        supportActionBar!!.hide()
        binding!!.image.setImageURI(intent.data)
        binding!!.shareBtn.setOnClickListener {
            val imageUri = Uri.parse(intent.data.toString())
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "image/png"
            intent.putExtra(Intent.EXTRA_STREAM, imageUri)
            startActivity(Intent.createChooser(intent, "Share"))
        }
        binding!!.facebookBtn.setOnClickListener {
            val imageUri = Uri.parse(intent.data.toString())
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "image/png"
            intent.putExtra(Intent.EXTRA_STREAM, imageUri)
            startActivity(Intent.createChooser(intent, "Share"))
        }
        binding!!.whatsappBtn.setOnClickListener {
            val imageUri = Uri.parse(intent.data.toString())
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "image/png"
            intent.putExtra(Intent.EXTRA_STREAM, imageUri)
            startActivity(Intent.createChooser(intent, "Share"))
        }
        binding!!.instagrambtn.setOnClickListener {
            val imageUri = Uri.parse(intent.data.toString())
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "image/png"
            intent.putExtra(Intent.EXTRA_STREAM, imageUri)
            startActivity(Intent.createChooser(intent, "Share"))
        }
        binding!!.shareBtn.setOnClickListener {
            val imageUri = Uri.parse(intent.data.toString())
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "image/png"
            intent.putExtra(Intent.EXTRA_STREAM, imageUri)
            startActivity(Intent.createChooser(intent, "Share"))
        }
        binding!!.homeBtn.setOnClickListener {
            startActivity(
                Intent(
                    this@ResultActivity,
                    MainActivity::class.java
                )
            )
        }
        binding!!.backBtn.setOnClickListener {
            startActivity(
                Intent(
                    this@ResultActivity,
                    MainActivity::class.java
                )
            )
        }

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