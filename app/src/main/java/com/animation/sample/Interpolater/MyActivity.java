package com.animation.sample.Interpolater;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.*;
import android.widget.TextView;

import com.animation.sample.R;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interpolater_main);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.tv);
                Animation tranlateAnim = AnimationUtils.loadAnimation(MyActivity.this, R.anim.translateanim);
                tranlateAnim.setInterpolator(new CycleInterpolator(1));
                tv.startAnimation(tranlateAnim);

            }
        });

        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.tv);
                Animation scaleAnim = AnimationUtils.loadAnimation(MyActivity.this,R.anim.scaleanim);
                scaleAnim.setInterpolator(new AccelerateDecelerateInterpolator());
                tv.startAnimation(scaleAnim);
            }
        });

        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.tv);
                Animation rotateanim = AnimationUtils.loadAnimation(MyActivity.this,R.anim.rotateanim);
                rotateanim.setInterpolator(new AccelerateInterpolator());
                tv.startAnimation(rotateanim);
            }
        });

        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.tv);
                Animation alphaanim = AnimationUtils.loadAnimation(MyActivity.this,R.anim.alphaanim);
                alphaanim.setInterpolator(new LinearInterpolator());
                tv.startAnimation(alphaanim);
            }
        });

        findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.tv);
                Animation alphaanim = AnimationUtils.loadAnimation(MyActivity.this,R.anim.setanim);
                alphaanim.setInterpolator(new DecelerateInterpolator());
                tv.startAnimation(alphaanim);
            }
        });

        //AccelerateDecelerateInterpolator 加速减速插值器
        //表示移动时开始速度快，快结束时速度慢
        // 表示旋转速度初始化加快，后期变慢
        //CycleInterpolator 循环插值器 动画循环播放特定次数，速率沿正弦曲线改变。
        //AccelerateInterpolator 加速插值器：开始时慢，结束前快
        //DecelerateInterpolator 减速插值器：开始时一瞬间加速，到最大值时逐渐变慢
        //LinearInterpolator 线性插值器：也称匀速加速器
        //BouncelInterpolator  弹跳插值器：自由落地后回弹的效果
        //AnticpateInterpolator  初始偏移插值器 ：动画开始时向前偏移一段距离后应用动画
        //OvershootInterpolator  结束偏移插值器：表示动画结束时，沿动画方向继续运动一段距离后在结束动画
        //AnticpateOvershootInterpolator 是AnticpateInterpolator和OvershootInterpolator的合体
    }
}
