package com.animation.sample.ViewAnimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.animation.sample.R;

/**
 * Created by qijian on 16/11/11.
 */
public class AnimationXMLActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_xml_activity);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.tv);
                /**
                 * 缩放动画
                 */
                Animation scaleAnim = AnimationUtils.loadAnimation(AnimationXMLActivity.this, R.anim.view_scaleanim);
                tv.startAnimation(scaleAnim);
            }
        });

        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.tv);
                /**
                 * 透明度动画
                 */
                Animation alphaAnim = AnimationUtils.loadAnimation(AnimationXMLActivity.this,R.anim.view_alphaanim);
                tv.startAnimation(alphaAnim);
            }
        });
        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.tv);
                /**
                 * 旋转动画
                 */
                Animation rotateAnim = AnimationUtils.loadAnimation(AnimationXMLActivity.this,R.anim.view_rotateanim);
                tv.startAnimation(rotateAnim);
            }
        });
        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.tv);
                /**
                 * 平移动画
                 */
                Animation tanslateAnim = AnimationUtils.loadAnimation(AnimationXMLActivity.this,R.anim.view_translateanim);
                tv.startAnimation(tanslateAnim);
            }
        });
        findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.tv);
                /**
                 * 动画集合
                 */
                Animation setAnim = AnimationUtils.loadAnimation(AnimationXMLActivity.this,R.anim.view_setanim);
                tv.startAnimation(setAnim);
            }
        });

    }
}
