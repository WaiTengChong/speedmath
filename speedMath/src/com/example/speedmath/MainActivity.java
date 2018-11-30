package com.example.speedmath;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.media.MediaPlayer;
import android.view.View.OnClickListener;
import android.view.View;


public class MainActivity extends Activity {

	
	MediaPlayer bkgmusic;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		bkgmusic = MediaPlayer.create(MainActivity.this, R.raw.backmusic);
		bkgmusic.setLooping(true);
		bkgmusic.start();
	}
	
	protected void onPause(){
		super.onPause();
		bkgmusic.release();
		finish();
	}
	
	public void nextScreen(View view){
		Intent intent = new Intent(this, Screen2.class);
		startActivity(intent);
		
		
	}
}
