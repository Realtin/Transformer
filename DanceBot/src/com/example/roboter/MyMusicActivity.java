package com.example.roboter;

/**
 * Activity for "Meine Musik" page (select from user's songs)
 * 
 * - next Activity is PlayActivity
 * - back: to "Musik" page (MusicActivity)
 */

import com.example.roboter.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MyMusicActivity extends Activity implements
		CompoundButton.OnCheckedChangeListener {

	CheckBox cb_1;
	CheckBox cb_2;
	CheckBox cb_3;
	CheckBox cb_4;
	CheckBox cb_5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_music);

		cb_1 = (CheckBox) findViewById(R.id.CheckBox01);
		cb_1.setOnCheckedChangeListener(this);

		cb_2 = (CheckBox) findViewById(R.id.CheckBox02);
		cb_2.setOnCheckedChangeListener(this);

		cb_3 = (CheckBox) findViewById(R.id.CheckBox03);
		cb_3.setOnCheckedChangeListener(this);

		cb_4 = (CheckBox) findViewById(R.id.CheckBox04);
		cb_4.setOnCheckedChangeListener(this);

		cb_5 = (CheckBox) findViewById(R.id.CheckBox05);
		cb_5.setOnCheckedChangeListener(this);
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		{
			if (isChecked)
				startActivity(new Intent(MyMusicActivity.this,
						PlayActivity.class));
			else
				finish();
		}

	}

}