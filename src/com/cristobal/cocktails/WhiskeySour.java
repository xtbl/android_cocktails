package com.cristobal.cocktails;

import java.util.List;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class WhiskeySour extends ListActivity {
	private final String TAG = this.getClass().getSimpleName();
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cocktail);

		setListAdapter(new MyAdapter(this, 
				android.R.layout.simple_list_item_1, R.id.textView1,
				getResources().getStringArray(R.array.whiskey_sour)));
	}
	
	private class MyAdapter extends ArrayAdapter<String> {
		public MyAdapter(Context context, int resource, int textViewResourceId,
				String[] strings) {
			super(context, resource, textViewResourceId, strings);
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			
			LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View row = inflater.inflate(R.layout.list_item, parent, false);
			String[] items = getResources().getStringArray(R.array.whiskey_sour);
			
			ImageView iv = (ImageView) row.findViewById(R.id.imageView1);
			TextView tv = (TextView) row.findViewById(R.id.textView1);
			
			tv.setText(items[position]);
			// testing-delete
			Log.v(TAG, "item-position is: "+ items[position]);
			Log.v(TAG, "item-0 is: "+ items[0]);
			Log.v(TAG, "item-1 is: "+ items[1]);
			
			if (position == 0){
				iv.setImageResource(R.drawable.whiskey_sour);
			}
			else if ( position == 1 ){
				iv.setImageResource(R.drawable.bar);
			}
			else if ( position == 2 ) {
				iv.setImageResource(R.drawable.price);
			}
			else if ( position == 3 ) {
				iv.setImageResource(R.drawable.open_bar);
			}
			else if ( position == 4 ){
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
