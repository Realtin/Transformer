package com.example.roboter;

/**
 * Activity for "Anleitung" page
 * 
 * - back: to menu's page (DanceBotActivity)
 */

import com.example.roboter.R;

import android.os.Bundle;
import android.app.Activity;

public class HelpActivity extends Activity{
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
                
    }
}