package com.animation.sample.ViewAnimation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.*;
import android.widget.TextView;

import com.animation.sample.R;

public class MyActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewanim_main);

        findViewById(R.id.anim_xml_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,AnimationXMLActivity.class));
            }
        });

        findViewById(R.id.anim_java_activity).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,AnimationJAVAActivity.class));
            }
        });
    }


}
