package com.animation.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ViewAnimation(View view) {
        startActivity(new Intent(MainActivity.this, com.animation.sample.ViewAnimation.MyActivity.class));
    }

    public void interpolater(View view) {
        startActivity(new Intent(MainActivity.this, com.animation.sample.Interpolater.MyActivity.class));
    }

    public void animDemo(View view) {
        startActivity(new Intent(MainActivity.this,com.animation.sample.AnimDemo.MyActivity.class));
    }


    public void frameanim(View view) {
        startActivity(new Intent(MainActivity.this,com.animation.sample.FrameAnim.MyActivity.class));
    }

}
