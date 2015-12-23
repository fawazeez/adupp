package com.aduppil.adupp;


import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activityclass {
	Boolean isConnectionExist = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null)
        {
        isConnectionExist = checkMobileInternetConn();
        
        if (isConnectionExist) {
            // Internet Connection exists          
        } else {
            // Internet connection doesn't exist
            showAlertDialog(this, "No Internet Connection",
                    "Your device doesn't have internet. Get connected for Recipe images", false);
        }
        }
        TextView tv1=(TextView)findViewById(R.id.textView1);
        tv1.setText("പാചകവിധി");
        Typeface typeF = Typeface.createFromAsset(getAssets(), "ANJALIOLDLIPI.TTF");
        tv1.setTypeface(typeF);
        
        ImageButton but1=(ImageButton)findViewById(R.id.imagesoup);
        but1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_next= new Intent(MainActivity.this,Contents.class);
				intent_next.putExtra("id", "soup");
				MainActivity.this.startActivity(intent_next);
		}
		});
        
        ImageButton but2=(ImageButton)findViewById(R.id.imagechicken);
        but2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_next= new Intent(MainActivity.this,Contents.class);
				intent_next.putExtra("id", "chicken");
				MainActivity.this.startActivity(intent_next);
		}
		});
        
        ImageButton but3=(ImageButton)findViewById(R.id.imagevegetable);
        but3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_next= new Intent(MainActivity.this,Contents.class);
				intent_next.putExtra("id", "vegetable");
				MainActivity.this.startActivity(intent_next);
		}
		});
        
        ImageButton but4=(ImageButton)findViewById(R.id.imagepickle);
        but4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_next= new Intent(MainActivity.this,Contents.class);
				intent_next.putExtra("id", "pickle");
				MainActivity.this.startActivity(intent_next);
		}
		});
        
        
        ImageButton but5=(ImageButton)findViewById(R.id.imagebakery);
        but5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_next= new Intent(MainActivity.this,Contents.class);
				intent_next.putExtra("id", "bakery");
				MainActivity.this.startActivity(intent_next);
		}
		});
        
        
        ImageButton but6=(ImageButton)findViewById(R.id.imagerice);
        but6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_next= new Intent(MainActivity.this,Contents.class);
				intent_next.putExtra("id", "rice");
				MainActivity.this.startActivity(intent_next);
		}
		});
        
        ImageButton but7=(ImageButton)findViewById(R.id.imagepudding);
        but7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_next= new Intent(MainActivity.this,Contents.class);
				intent_next.putExtra("id", "pudding");
				MainActivity.this.startActivity(intent_next);
		}
		});
        
        
        ImageButton but8=(ImageButton)findViewById(R.id.imagefish);
        but8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_next= new Intent(MainActivity.this,Contents.class);
				intent_next.putExtra("id", "fish");
				MainActivity.this.startActivity(intent_next);
		}
		});
        
        
        ImageButton but9=(ImageButton)findViewById(R.id.imagemeat);
        but9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_next= new Intent(MainActivity.this,Contents.class);
				intent_next.putExtra("id", "meat");
				MainActivity.this.startActivity(intent_next);
		}
		});
        
        
        ImageButton but10=(ImageButton)findViewById(R.id.imageprawns);
        but10.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_next= new Intent(MainActivity.this,Contents.class);
				intent_next.putExtra("id", "prawns");
				MainActivity.this.startActivity(intent_next);
		}
		});
        
        ImageButton but11=(ImageButton)findViewById(R.id.imageroti);
        but11.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_next= new Intent(MainActivity.this,Contents.class);
				intent_next.putExtra("id", "roti");
				MainActivity.this.startActivity(intent_next);
		}
		});
        
        
        ImageButton but12=(ImageButton)findViewById(R.id.imagesnacks);
        but12.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_next= new Intent(MainActivity.this,Contents.class);
				intent_next.putExtra("id", "snacks");
				MainActivity.this.startActivity(intent_next);
		}
		});
        
        ImageButton but13=(ImageButton)findViewById(R.id.imagedrinks);
        but13.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_next= new Intent(MainActivity.this,Contents.class);
				intent_next.putExtra("id", "drinks");
				MainActivity.this.startActivity(intent_next);
		}
		});
        
        ImageButton but14=(ImageButton)findViewById(R.id.imagesalad);
        but14.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_next= new Intent(MainActivity.this,Contents.class);
				intent_next.putExtra("id", "salad");
				MainActivity.this.startActivity(intent_next);
		}
		});
        
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
		String userName = sharedPref.getString("Category", "Music");
	 if (userName.equals("Music"))
	 {  setStartUpScreenAudio( );    
	 }
	 SharedPreferences.Editor editor = sharedPref.edit();
	 //put your value
	 editor.putString("Category", "No Music");
	 editor.commit();
		
        
       
        
    }


    @SuppressWarnings("deprecation")
	public void showAlertDialog(Context context, String title, String message, Boolean status) {
        AlertDialog alertDialog = new AlertDialog.Builder(context).create();
 
        // Setting Dialog Title
        alertDialog.setTitle(title);
 
        // Setting Dialog Message
        alertDialog.setMessage(message);
 
        // Setting alert dialog icon
        alertDialog.setIcon((status) ? android.R.drawable.alert_light_frame :android.R.drawable.btn_star);
 

        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });
 
        // Showing Alert Message
        alertDialog.show();
    }


	private void setStartUpScreenAudio() {
		// TODO Auto-generated method stub;
    	MediaPlayer audioPlayer=MediaPlayer.create(getApplicationContext(), R.raw.intro);
    	//audioPlayer.setLooping(true);
    	audioPlayer.start();
		
	}
    public boolean checkMobileInternetConn() {
        //Create object for ConnectivityManager class which returns network related info
        ConnectivityManager connectivity = (ConnectivityManager) this.getSystemService(Context.CONNECTIVITY_SERVICE);
        //If connectivity object is not null
        if (connectivity != null) {
            //Get network info - Mobile internet access
            NetworkInfo info = connectivity.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
 
            if (info != null) {
                //Look for whether device is currently connected to Mobile internet
                if (info.isConnected()) {
                	Toast.makeText(this, "Recipe Images can incur data charges", Toast.LENGTH_SHORT).show();
                    return true;
                }
            }
                      NetworkInfo infowi = connectivity.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                      if (infowi != null) {
                          //Look for whether device is currently connected to Mobile internet
                          if (infowi.isConnected()) {
                              return true;
                          }
                      }

        }
        return false;
    }


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch(id)
        {
        case R.id.action_aboutus:
        //	Intent intent_aboutus= new Intent(this,AboutUs.class);
        	//this.startActivity(intent_aboutus);
        	 setStartUpScreenAudio( );  
        	break;        
        case R.id.action_gallery:
        	Intent intent_gallery= new Intent(this,Feedback.class);
        	this.startActivity(intent_gallery);
        	break;              	
        case R.id.action_example:
        	Intent intent_next= new Intent(MainActivity.this,Contents.class);
			intent_next.putExtra("id", "launcher");
			MainActivity.this.startActivity(intent_next);  
			break;   
        case R.id.action_google:
        	Intent intent_partner= new Intent(this,Partner.class);
        	this.startActivity(intent_partner);
        	break;  
       // 	Uri url = Uri.parse("http://www.google.com");
        //	Intent surf = new Intent(Intent.ACTION_VIEW,url);
        //	this.startActivity(surf);
        case R.id.action_share:
        	Intent shareIntent = new Intent();
        	shareIntent.setAction(Intent.ACTION_SEND);
        	shareIntent.setType("image/png");        	
        	Uri img = Uri.parse("android.resource://com.aduppil.adupp/"+R.drawable.poster);
        	shareIntent.putExtra(Intent.EXTRA_STREAM, img);
        	shareIntent.putExtra(Intent.EXTRA_TEXT, "New Recipe APP");
        	this.startActivity(Intent.createChooser(shareIntent, "Share"));
        	break;
        	default:
        		   return super.onOptionsItemSelected(item);	   
        	
        }
        return super.onOptionsItemSelected(item);
    }
}
