package com.marszhou.arkanoid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private GameView mGameView;
    public static TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        FrameLayout mFrameLayout = new FrameLayout(this);
        mGameView = new GameView(this);
        mTextView = new TextView(this);
        mTextView.setGravity(Gravity.CENTER);
        mTextView.setText("打砖块");
        mTextView.setTextSize(60);
        mGameView.setVisibility(View.GONE);
        mFrameLayout.addView(mGameView);
        mFrameLayout.addView(mTextView);
        setContentView(mFrameLayout);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_UP) {
            if (mTextView.getText().toString().equals("打砖块")) {
                mTextView.setVisibility(View.GONE);
                mGameView.setVisibility(View.VISIBLE);
            } else if (mTextView.getText().toString().equals("GAME OVER") || mTextView.getText().toString().equals("SUCCESS")) {
                mGameView.setVisibility(View.VISIBLE);
                mTextView.setVisibility(View.GONE);
            }
        }
        return true;
    }
}
