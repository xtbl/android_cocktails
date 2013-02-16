package com.cristobal.cocktails;

import java.util.List;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Cocktail extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cocktail); //create cocktail layout
		setListAdapter(new MyAdapter(this, 
				android.R.layout.simple_list_item_1, R.id.textView1,
				getResources().getStringArray(R.array.cocktail_details)));//create cocktail_details
	}
	
	private class MyAdapter extends ArrayAdapter<String> {

		public MyAdapter(Context context, int resource, int textViewResourceId,
				String[] strings) {
			super(context, resource, textViewResourceId, strings);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			
			LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View row = inflater.inflate(R.layout.list_item, parent, false);
			String[] items = getResources().getStringArray(R.array.cocktail_details);
			
			ImageView iv = (ImageView) row.findViewById(R.id.imageView1);
			TextView tv = (TextView) row.findViewById(R.id.textView1);
			
			tv.setText(items[position]);
			
			if (items[position].equals("Cranberry Ginger Fizz") ){
				iv.setImageResource(R.drawable.name);
			}
			else if (items[position].equals("Terraza") ){
				iv.setImageResource(R.drawable.bar);
			}
			else if (items[position].equals("$50") ){
				iv.setImageResource(R.drawable.price);
			}
			else if (items[position].equals("Yes!") ){
				iv.setImageResource(R.drawable.open_bar);
			}
			else if (items[position].equals("55555555") ){
				iv.setImageResource(R.drawable.phone);
			}
			
			return row;
		}
		
	}
}
