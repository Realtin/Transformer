package com.example.roboter;

/**
 * Activity for "Musik" page
 * 
 * - next Activities are ExampleMusicActivity or MyMusicActivity or PlayActivity
 * - back: to menu's page (DanceBotActivity) 
 */

import com.example.roboter.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.view.View;
import android.view.View.OnClickListener;

public class MusicActivity extends Activity implements OnClickListener{
	/** Called when the activity is first created. */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.music);
  
		
		View exampleButton = findViewById(R.id.ex_music);
		exampleButton.setOnClickListener(this);

		View myMusicButton = findViewById(R.id.my_music);
		myMusicButton.setOnClickListener(this);

		View exitButton = findViewById(R.id.exit);
		exitButton.setOnClickListener(this);

	}

	public void onClick(View v) {
		switch (v.getId()) {
		
		case R.id.ex_music:
			startActivity(new Intent(MusicActivity.this, MyMusicActivity.class));
			break;

		case R.id.my_music:
			startActivity(new Intent(MusicActivity.this, ExampleMusicActivity.class));
			break;

		case R.id.exit:
			finish();
			break;

		}
	}

}
