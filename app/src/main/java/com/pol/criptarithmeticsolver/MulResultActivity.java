package com.pol.criptarithmeticsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MulResultActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mul_result);

        lottieAnimationView = findViewById(R.id.animation_view);

//        lottieAnimationView.addAnimatorUpdateListener((animation) -> {
//            // Do something.
//        });
//        lottieAnimationView.playAnimation();
//
//        if (lottieAnimationView.isAnimating()) {
//            // Do something.
//        }
//
//        lottieAnimationView.setProgress(0.5f);


        // Custom animation speed or duration.
        ValueAnimator animator = ValueAnimator.ofFloat(0f, 1f);
        animator.addUpdateListener(animation -> {

        });

        lottieAnimationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animator.start();

            }
        });

    }
}
