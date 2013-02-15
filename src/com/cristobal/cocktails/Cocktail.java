package com.cristobal.cocktails;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Cocktail extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cocktail); //create cocktail layout
		setListAdapter(new ArrayAdapter<String>(this, 
				android.R.layout.simple_list_item_1,
				getResources().getStringArray(R.array.cocktail_details)));//create cocktail_details
	}
}
