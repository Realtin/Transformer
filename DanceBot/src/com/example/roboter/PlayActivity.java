package com.example.roboter;

import com.example.roboter.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 *  Activity for "Spiel" page
 * 
 *
 */

public class PlayActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.play);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
