package com.bonnguyen.uberseekbar.demo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.widget.SeekBar;

import com.bonnguyen.uberseekbar.UberSeekBar;

/**
 * Created by nguyenbon on 3/28/16.
 */
public class ExampleActivity extends FragmentActivity {

    private static final String TAG = "ExampleActivity";
    private UberSeekBar uberSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        uberSeekBar = (UberSeekBar) findViewById(R.id.uberSeekBar);
        uberSeekBar.setOnSeekBarChangeListener(new UberSeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.d(TAG, "onProgressChanged --- " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d(TAG, "onStartTrackingTouch --- " + seekBar.getProgress());
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d(TAG, "onStopTrackingTouch --- " + seekBar.getProgress());
            }
        });
    }
}
