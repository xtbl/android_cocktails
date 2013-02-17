package com.cristobal.cocktails;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main extends Activity {

	protected static final String TAG = "Main Activity";
	protected int cocktailSelec = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);			
		
	}

	public void onRadioButtonClicked(View view) {
	    // Is the button now checked?
	    boolean checked = ((RadioButton) view).isChecked();
    
	    // Check which radio button was clicked
	    switch(view.getId()) {
	        case R.id.cocktail_1:
	            if (checked)
	            	Log.v(TAG, "cocktail_1");
	            	cocktailSelec = 1;
	            	Toast.makeText(this, "cocktail_1", Toast.LENGTH_SHORT).show();
	            break;
	        case R.id.cocktail_2:
	            if (checked)
	            	Log.v(TAG, "cocktail_2");
	            	cocktailSelec = 2;
	            	Toast.makeText(this, "cocktail_2", Toast.LENGTH_SHORT).show();
	            break;
	        case R.id.cocktail_3:
	        	if (checked)
	        		cocktailSelec = 3;
	        		Toast.makeText(this, "cocktail_3", Toast.LENGTH_SHORT).show();
	        	break;
	        case R.id.cocktail_4:
	        	if (checked)
	        		cocktailSelec = 4;
	        		Log.v(TAG, "cocktail_4");
		        	Toast.makeText(this, "cocktail_4", Toast.LENGTH_SHORT).show();
	        	break;
	        case R.id.cocktail_5:
	        	if (checked)
	        		cocktailSelec = 5;
	        		Log.v(TAG, "cocktail_5");
		        	Toast.makeText(this, "cocktail_5", Toast.LENGTH_SHORT).show();
	        	break;
	    }
	    
	}		
	
	public void displayCocktail(View view) {
		
		Toast.makeText(this, "cocktail selected: " + cocktailSelec, Toast.LENGTH_SHORT).show();
		
		switch (cocktailSelec){
			case 1:	startActivity(new Intent(Main.this, CranberryGingerFizz.class));
					break;					
			case 2:	startActivity(new Intent(Main.this, WhiskeySour.class));
					break;
			case 3:	startActivity(new Intent(Main.this, AperolSpritz.class));
					break;
			case 4:	startActivity(new Intent(Main.this, PerfectMargarita.class));
					break;
			case 5:	startActivity(new Intent(Main.this, French75.class));
					break;
			
			default: Toast.makeText(this, "choose another please ", Toast.LENGTH_SHORT).show();
					break;
		}
		
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
