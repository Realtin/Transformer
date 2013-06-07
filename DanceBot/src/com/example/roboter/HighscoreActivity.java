package com.example.roboter;

/**
 * Activity for HighScore
 * 
 * - back: to menu's page (DanceBotActivity)
 */

import com.example.roboter.R;
import android.app.ListActivity;
import android.view.View;
import android.widget.ListView;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ArrayAdapter;


public class HighscoreActivity extends ListActivity{
	
	private TextView mTextView;
	
	String[] highScore = {
			
	   "Plaeyr_1   40033", "Plaeyr_2   35033", 
	   "Plaeyr_3   01003", "Plaeyr_4   00033"};
	
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.highscore);
        
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, highScore));
        mTextView = (TextView)findViewById(R.id.action_settings);
    }
    
    @Override
	public void onListItemClick(
            ListView parent, View v, int position, long id) {
        mTextView.setText("Select: " + highScore[position] + " " + position + " " + id);
    }

}
