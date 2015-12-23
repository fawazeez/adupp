package com.aduppil.adupp;

import java.io.File;
import java.io.FileOutputStream;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.Toast;


public class ConfectioneryMenu extends Activityclass {
    public int imgID = 0;
    public int nameID = 0;
    public int recpID = 0;
    FileOutputStream out;
    public  String  itemname = "NA";
    ImageView recipdetail;
 
    //public String imgUrl = "https://www.dropbox.com/sh/bdwspxccvyh7eu2/AADvMdawq3hGL-ddeCzFE8UFa#f:";
    public String imgUrl = "http://www.websiteinuae.com/fawaz/";
    public String imgPath = Environment.getExternalStorageDirectory().getPath() + "/Adupp/Images";
    
    private class DownloadImagetask extends AsyncTask<String, Void, Bitmap> {
    	private Context mContext ;
    	
    	private ProgressDialog mProgressDialog;
		ImageView bmImage;
		public DownloadImagetask(Context context,ImageView bmImage)
		{
			mContext = context;
			this.bmImage=bmImage;
		}
		@Override
		protected Bitmap doInBackground(String... urls) {
			// TODO Auto-generated method stub 
			String urldisplay = imgUrl+urls[0]+".png";
			//String urldisplay = imgUrl;
			new File(imgPath).mkdirs();
			File image = new File (imgPath+"/"+urls[0]+".png");
			//String filePath = imgPath+"/img_"+urls[0]+".png";
	try{
			java.net.URL url=new java.net.URL(urldisplay);
			Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());

 out = new FileOutputStream(image);
 Log.i("sdcard", "compress");
	 bmp.compress(Bitmap.CompressFormat.PNG, 100, out);		
	 out.flush();
		if(out != null)  out.close();
	    return bmp;
		    }
	catch(Exception e){
	return null;
	}

		}
		@Override
		protected void onPostExecute(Bitmap result) {
			// TODO Auto-generated method stub
			//super.onPostExecute(result);	 
			mProgressDialog.dismiss();
			mProgressDialog=null;
			if (result ==null)				
				bmImage.setBackgroundResource(R.drawable.sorry);
			else
			bmImage.setImageBitmap(result);
		}
		
		@Override
		protected void onPreExecute() {
		super.onPreExecute();
		mProgressDialog= new ProgressDialog(mContext);
		mProgressDialog.setMessage("Loading Image");
		mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
		mProgressDialog.setIndeterminate(true);
		mProgressDialog.setCancelable(true);
		mProgressDialog.show();
		}
		
		@Override
		protected void onProgressUpdate(Void... values) {
			// TODO Auto-generated method stub
			//super.onProgressUpdate(values);
		}


	}

@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.item_menu);
	ImageView recipname  = (ImageView)findViewById(R.id.recipename);
	ImageView recipimg  = (ImageView)findViewById(R.id.recipeimg);
	ImageView recipdetail = (ImageView)findViewById(R.id.recipedetail);
	Button reqbut = (Button)findViewById(R.id.buttonrequest);
	Button reqtip = (Button)findViewById(R.id.buttontip);
	aduppfavourites  = getApplicationContext().getSharedPreferences("Na",MODE_PRIVATE);
	   CheckBox favcheckbox = (CheckBox)findViewById(R.id.favcheckBox);
		AdView adView = (AdView) this.findViewById(R.id.adView2);
		AdRequest adRequest = new AdRequest.Builder().build();
		adView.loadAd(adRequest);
	
	Bundle b = getIntent().getExtras();
	String  menuname = b.getString("id");
	
	itemname =menuname;
	
    int density = getResources().getDisplayMetrics().densityDpi;
    switch(density){
    case DisplayMetrics.DENSITY_LOW:
    	imgUrl = "http://www.websiteinuae.com/fawaz/HDPI/";
    	break;
    case DisplayMetrics.DENSITY_MEDIUM:
    	imgUrl = "http://www.websiteinuae.com/fawaz/HDPI/";
    	break;
    case DisplayMetrics.DENSITY_HIGH:
    	imgUrl = "http://www.websiteinuae.com/fawaz/HDPI/";
    	break;
    case DisplayMetrics.DENSITY_XHIGH:
    	imgUrl = "http://www.websiteinuae.com/fawaz/XHDPI/";
    	break;
    case DisplayMetrics.DENSITY_XXHIGH:
    	 imgUrl = "http://www.websiteinuae.com/fawaz/XXHDPI/";
    	break;
    	default:
    		imgUrl = "http://www.websiteinuae.com/fawaz/HDPI/";
    }
 
	
	   String isTheStockNew = aduppfavourites.getString(itemname, null)   ;
	   if(isTheStockNew == null)
	   favcheckbox.setChecked(false);
	   else
		   favcheckbox.setChecked(true);
	   favcheckbox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked){
					
					 String isTheStockNew =     aduppfavourites.getString(itemname, null)   ;
					if(isTheStockNew == null)
						{SharedPreferences.Editor prefedit = aduppfavourites.edit();
					prefedit.putString(itemname, itemname);					
					prefedit.commit();
						}
				}else
				{	String isTheStockNew =     aduppfavourites.getString(itemname, null)   ;
					if(isTheStockNew != null)
					{SharedPreferences.Editor prefedit = aduppfavourites.edit();
				prefedit.remove(itemname);  
				prefedit.commit();
					}
				}
			}
		});
	
    try
  {
    	File imgFile = new File(imgPath);
		imgFile.mkdirs();
		File imgFilesd = new File(imgPath+"/img_"+menuname+".png");
    	if(imgFilesd.exists())
    	{ 	
    	//Toast.makeText(getApplicationContext(),imgPath  , Toast.LENGTH_LONG).show();        	
    	Bitmap imgBitmap = BitmapFactory.decodeFile(imgFilesd.getAbsolutePath());
    	recipimg.setImageBitmap(imgBitmap);
    	}
    	else
    	{
    	 new DownloadImagetask(this,recipimg).execute("img_"+menuname);    	
    	}
    	nameID = getResources().getIdentifier("it_" + menuname, "drawable", "com.aduppil.adupp");
    	recipname.setImageResource(nameID);
       imgID = getResources().getIdentifier("rcp_" + menuname  , "drawable", "com.aduppil.adupp");
       if(imgID == 0)
       {	File rcpFilesd = new File(imgPath+"/rcp_"+menuname+".png");
       if(rcpFilesd.exists())
   	{ 	Bitmap rcpBitmap = BitmapFactory.decodeFile(rcpFilesd.getAbsolutePath());
   	recipdetail.setImageBitmap(rcpBitmap);
    	   
   	}else
    	   reqbut.setVisibility(Button.VISIBLE);
       reqtip.setVisibility(Button.INVISIBLE);
       Toast.makeText(getApplicationContext(),"Press Button for Recipe" , Toast.LENGTH_LONG).show();
       }
       else
       recipdetail.setImageResource(imgID);
       // recpID = getResources().getIdentifier("img_" + menuname, "drawable", "com.aduppil.adupp");
       // recipimg.setImageResource(recpID);
    }catch(Exception e){
    	Toast.makeText(getApplicationContext(),imgID + " - value" , Toast.LENGTH_LONG).show();
    	Toast.makeText(getApplicationContext(),imgID , Toast.LENGTH_LONG).show();
    }
    reqbut.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			ImageView recipdetail = (ImageView)findViewById(R.id.recipedetail);
			((Button)findViewById(R.id.buttonrequest)).setVisibility(Button.INVISIBLE);
			 new DownloadImagetask(ConfectioneryMenu.this,recipdetail).execute("rcp_"+itemname);    	
		}
	});
    
    reqtip.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			setStartUpScreenAudio(itemname,v);
		}
	}) ;
  
	    
    
}
private void setStartUpScreenAudio(String menname,View v) {
	// TODO Auto-generated method stub;
	try
	{
	int rid= getApplicationContext().getResources().getIdentifier("ad_"+menname, "raw", getApplicationContext().getPackageName());
	MediaPlayer audioPlayer=MediaPlayer.create(getApplicationContext(),rid);	
	audioPlayer.start();
	}
	//audioPlayer.setLooping(true);
	catch (Exception e){
		v.setVisibility(Button.INVISIBLE);
		}
}



}
