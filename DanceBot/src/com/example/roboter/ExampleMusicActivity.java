package com.example.roboter;
/**
 * Activity for "Beispiele" page (select from application's songs)
 * 
 * - next Activity is PlayActivity
 * - back: to "Meine Musik" page (MusicActivity)
 *
 */

import com.example.roboter.R;

import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ExampleMusicActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex_music);
	}

}