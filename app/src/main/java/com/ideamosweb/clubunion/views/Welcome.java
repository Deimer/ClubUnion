package com.ideamosweb.clubunion.views;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ideamosweb.clubunion.R;
import com.jaouan.revealator.Revealator;
import butterknife.Bind;
import butterknife.ButterKnife;

public class Welcome extends Activity {

    @Bind(R.id.frame_content)FrameLayout frame_content;
    @Bind(R.id.img_avatar)ImageView img_avatar;
    @Bind(R.id.view_point)View view_point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
        setupClass();
    }

    public void setupClass(){
        revealView();
    }

    public void revealView(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Revealator.reveal(frame_content)
                        .from(view_point)
                        .withCurvedTranslation()
                        .withChildsAnimation()
                        .withChildAnimationDuration(700)
                        .withRevealDuration(1000)
                        //.withEndAction(...)
                        .start();
            }
        }, 500);
    }

}
