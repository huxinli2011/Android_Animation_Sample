package com.animation.sample.AnimDemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.animation.sample.R;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anim_demo_main);

        findViewById(R.id.camera_stretch_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,CameraStretchDemo.class));
            }
        });

        findViewById(R.id.loading_demo_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,LoadingDemo.class));
            }
        });

        findViewById(R.id.scanner_demo_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,ScannerDemo.class));
            }
        });
    }
}
