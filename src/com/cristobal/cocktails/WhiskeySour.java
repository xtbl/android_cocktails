package com.cristobal.cocktails;

import java.util.List;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class WhiskeySour extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cocktail); //create cocktail layout

		setListAdapter(new MyAdapter(this, 
				android.R.layout.simple_list_item_1, R.id.textView1,
				getResources().getStringArray(R.array.whiskey_sour)));
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
			String[] items = getResources().getStringArray(R.array.whiskey_sour);
			
			ImageView iv = (ImageView) row.findViewById(R.id.imageView1);
			TextView tv = (TextView) row.findViewById(R.id.textView1);
			
			tv.setText(items[position]);
			
			if (items[position].equals("Whiskey Sour") ){
				iv.setImageResource(R.drawable.name);
			}
			else if (items[position].equals("Main Bar") ){
				iv.setImageResource(R.drawable.bar);
			}
			else if (items[position].equals("$30") ){
				iv.setImageResource(R.drawable.price);
			}
			else if (items[position].equals("Yes!") ){
				iv.setImageResource(R.drawable.open_bar);
			}
			else if (items[position].equals("55555555") ){
				iv.setImageResource(R.drawable.phone);
				iv.setOnClickListener(new OnClickListener()
			    {
			       @Override
			       public void onClick(View v)
			       {
			    	   Intent callIntent = new Intent(Intent.ACTION_CALL);
			    	   callIntent.setData(Uri.parse("tel:55555555"));
			    	   startActivity(callIntent);
			       }
				});
				tv.setOnClickListener(new OnClickListener()
			    {
			       @Override
			       public void onClick(View v)
			       {
			    	   Intent callIntent = new Intent(Intent.ACTION_CALL);
			    	   callIntent.setData(Uri.parse("tel:55555555"));
			    	   startActivity(callIntent);
			       }
				});
			}
			
			return row;
		}
		
	}
}
