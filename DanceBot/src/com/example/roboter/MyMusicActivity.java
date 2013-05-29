package com.example.roboter;
/**
 * Activity for "Mein Musik" page (select from user's songs)
 * 
 * - next Activity is PlayActivity
 * - back: to "Musik" page (MusicActivity)
 */

import com.example.roboter.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MyMusicActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_music);
	}

}