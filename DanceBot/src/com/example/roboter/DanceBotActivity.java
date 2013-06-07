package com.example.roboter;

/**
 * Activity for menu's page
 * 
 * - next Activities are MusicActivity or HelpActivity or HighscoreActivity
 * - back: application exit 
 */

import com.example.roboter.R;

import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;

import android.view.View;
import android.view.View.OnClickListener;


public class DanceBotActivity extends Activity implements OnClickListener{


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dance_bot);
	

		View startButton = findViewById(R.id.start);
		startButton.setOnClickListener(this);

		View helpButton = findViewById(R.id.help);
		helpButton.setOnClickListener(this);

		View highscoreButton = findViewById(R.id.highscore);
		highscoreButton.setOnClickListener(this);

		View exitButton = findViewById(R.id.exit);
		exitButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.start:
			startActivity(new Intent(DanceBotActivity.this, MusicActivity.class));
			break;

		case R.id.help:
			startActivity(new Intent(DanceBotActivity.this, HelpActivity.class));
			break;

		case R.id.highscore:
			startActivity(new Intent(DanceBotActivity.this, HighscoreActivity.class));
			break;

		case R.id.exit:
			finish();
			break;

		}

	}
}
