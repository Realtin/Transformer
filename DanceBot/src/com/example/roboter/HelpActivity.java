package com.example.roboter;

/**
 * Activity for "Anleitung" page
 * 
 * - back: to menu's page (DanceBotActivity)
 */

import com.example.roboter.R;

import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class HelpActivity extends Activity{
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
                
    }
}