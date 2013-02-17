package com.cristobal.cocktails;

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

public class CranberryGingerFizz extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cocktail);
		
		setListAdapter(new MyAdapter(this, 
				android.R.layout.simple_list_item_1, R.id.textView1,
				getResources().getStringArray(R.array.cranberry_ginger_fizz)));//create cocktail_details
	}
	public void goBackHome(View v){
		startActivity(new Intent(CranberryGingerFizz.this, Main.class));
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
			String[] items = getResources().getStringArray(R.array.cranberry_ginger_fizz);
			
			ImageView iv = (ImageView) row.findViewById(R.id.imageView1);
			TextView tv = (TextView) row.findViewById(R.id.textView1);
			
			tv.setText(items[position]);
			
			if (position == 0){
				iv.setImageResource(R.drawable.cranberry_ginger_fizz);
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
