package com.example.speedmath;

//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;

//public class Screen2 extends ActionBarActivity {
public class Screen2 extends Activity {
	private int number;
	private TextView textfield;
	private Handler handler;
	private boolean Running = true;
	String ans;
	int i;
	MediaPlayer bkggmusic;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_screen2);
		
		
		bkggmusic = MediaPlayer.create(Screen2.this, R.raw.pe);
		bkggmusic.setLooping(true);
		bkggmusic.start();
		
		

		int Fnum = (int) ((Math.random() * 10) + 1);
		int Snum = (int) ((Math.random() * 10) + 1);
		String FnumString = Fnum + "";
		String SnumString = Snum + "";
		int totalAns = Fnum + Snum;
		ans = totalAns + "";
		TextView num1 = (TextView) findViewById(R.id.F1num);
		num1.setText(FnumString);
		TextView num2 = (TextView) findViewById(R.id.S2num);
		num2.setText(SnumString);

		i = 1;
		String QQ = i + ").";
		TextView Q = (TextView) findViewById(R.id.question);
		Q.setText(QQ);

		textfield = (TextView) findViewById(R.id.timer);
		handler = new Handler();
		Runnable runnable = new Runnable() {

			public void run() {
				while (Running) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					handler.post(new Runnable() {
						public void run() {
							number += 1;
							textfield.setText(String.valueOf(number));
						}

					});
				}
			}
		};

		new Thread(runnable).start();

	}

	String total = "";

	public void one(View view) {
		total = total + 1;
		TextView AA = (TextView) findViewById(R.id.ans);
		AA.setText(total);
	}

	public void two(View view) {
		total = total + 2;
		TextView AA = (TextView) findViewById(R.id.ans);
		AA.setText(total);
	}

	public void three(View view) {
		total = total + 3;
		TextView AA = (TextView) findViewById(R.id.ans);
		AA.setText(total);
	}

	public void four(View view) {
		total = total + 4;
		TextView AA = (TextView) findViewById(R.id.ans);
		AA.setText(total);
	}

	public void five(View view) {
		total = total + 5;
		TextView AA = (TextView) findViewById(R.id.ans);
		AA.setText(total);
	}

	public void six(View view) {
		total = total + 6;
		TextView AA = (TextView) findViewById(R.id.ans);
		AA.setText(total);
	}

	public void seven(View view) {
		total = total + 7;
		TextView AA = (TextView) findViewById(R.id.ans);
		AA.setText(total);
	}

	public void eight(View view) {
		total = total + 8;
		TextView AA = (TextView) findViewById(R.id.ans);
		AA.setText(total);
	}

	public void nine(View view) {
		total = total + 9;
		TextView AA = (TextView) findViewById(R.id.ans);
		AA.setText(total);
	}

	public void zero(View view) {
		total = total + 0;
		TextView AA = (TextView) findViewById(R.id.ans);
		AA.setText(total);
	}

	public void enter1(View view) {
		
		
		View b = findViewById(R.id.button10);
		b.setVisibility(View.VISIBLE);
		

		if (total.equals(ans)) {

			i++;

			String QQ = i + ").";
			TextView Q = (TextView) findViewById(R.id.question);
			Q.setText(QQ);

			String w = "";
			String y = "your";
			String z = "score";
			String k = "is";
			String r = "second";

			int Fnum = (int) ((Math.random() * 10) + 1);
			int Snum = (int) ((Math.random() * 10) + 1);
			String FnumString = Fnum + "";
			String SnumString = Snum + "";
			int totalAns = Fnum + Snum;
			ans = totalAns + "";
			TextView num1 = (TextView) findViewById(R.id.F1num);
			num1.setText(FnumString);
			TextView num2 = (TextView) findViewById(R.id.S2num);
			num2.setText(SnumString);

			total = "";
			TextView aa = (TextView) findViewById(R.id.ans);
			aa.setText(total);

			if (i == 11) {

				TextView num112 = (TextView) findViewById(R.id.time);
				num112.setText(w);
				TextView num1123 = (TextView) findViewById(R.id.question);
				num1123.setText(r);
				TextView num11 = (TextView) findViewById(R.id.F1num);
				num11.setText(k);
				TextView num22 = (TextView) findViewById(R.id.S2num);
				num22.setText(z);
				TextView num33 = (TextView) findViewById(R.id.add);
				num33.setText(y);
				TextView nu4m33 = (TextView) findViewById(R.id.equals);
				nu4m33.setText(w);
				TextView nu4m333 = (TextView) findViewById(R.id.ans);
				nu4m333.setText(w);

				Running = false;
				
				bkggmusic.release();
				
				Intent intent = new Intent(this, MainActivity.class);
				startActivity(intent);
				
			}

		} else {
			String lose = "Lose";
			total = "";
			TextView aa = (TextView) findViewById(R.id.ans);
			aa.setText(lose);
		}
	}

	public void del(View view) {

		View b = findViewById(R.id.button11);
		b.setVisibility(View.VISIBLE);
		
		
		if (total.length() <= 0) {
			total = "";
			TextView aa = (TextView) findViewById(R.id.ans);
			aa.setText(total);

		} else {
			total = total.substring(0, total.length() - 1);
			TextView AA = (TextView) findViewById(R.id.ans);
			AA.setText(total);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.screen2, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		// if (id == R.id.action_settings) {
		// return true;
		// }
		return super.onOptionsItemSelected(item);
	}
}
